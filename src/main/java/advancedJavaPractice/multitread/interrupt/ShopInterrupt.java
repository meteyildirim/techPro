package advancedJavaPractice.multitread.interrupt;

public class ShopInterrupt {

/*
 * 
 * TASK: stokda urun yoksa yeni urunun gelmesi beklensin ve yeni urun gelince satis gerceklessin.
 */
	
	public static volatile int stock = 0;
	
	public static void main(String[] args) {
		
		ShopInterrupt shop = new ShopInterrupt();
		
		Thread consumerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				shop.consumeProduct(3);		
				
			}
		});
		
		consumerThread.setName("Tüketici");
		
		Thread producerThread = new Thread(new Runnable() {
			

			@Override
			public void run() {
				try {
					Thread.sleep(5000); // sonucu gozlemek icin bekle,ve bu sure sonra yeni urun geldigin farzet.
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
				shop.produceProduct(5);	
				
				consumerThread.interrupt(); // kesilim gonder ve bunu kullanarak alisversi yeniden baslat
				
			}
		});
		producerThread.setName("Üretici");
		
		consumerThread.start();
		producerThread.start();
		
	}
	
	
	
	
	public synchronized void  consumeProduct(int amount) {
		
		if(amount>stock) {
			System.out.println("");
			System.out.println("Yeterli ürün yok, güncel stok:"+ stock);
			System.out.println("Tüketici ürün girisi bekliyor");
			// nasil bekleyecek
			try {
				wait();
			} catch (InterruptedException e) {
				
				// kesilim gelince 
				if(amount <= stock) {
					System.out.println("");
					System.out.println(Thread.currentThread().getId()+" tüketici ürün satin almak istiyor");
					System.out.println("Ürün stokdan düsülüyor");
					stock = stock - amount;
					System.out.println("Güncel stok:"+stock);
				}else {
					System.out.println(Thread.currentThread().getId()+" tüketici ürün satin almak istiyor");
					System.out.println("Yeterli ürün yok");
					System.out.println("Güncel stok:"+stock);
					
				}
			}
		}



}
	public synchronized void produceProduct(int amount) {
		System.out.println("");
		System.out.println(Thread.currentThread().getName()+" ürün eklemek istiyor");
		System.out.println("Yeni ürün/ler eklendi, stok güncellendi");
		stock = stock+amount;

	}

}
