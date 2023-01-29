package advancedJavaPractice.multitread.waitNotify;

public class WaitShopNotify {
	
	/*
	 * Task : Bir marketteki stok miktarini takip eden bir uygulama tasarlayiniz.
	 * Markette yeterli urun yoksa urun gelmesi beklensin
	 * Yeni urun eklenince satisi gerceklessin
	 */
	
	public static volatile int stock = 0;
	
	public static void main(String[] args) {
		
		WaitShopNotify shop = new WaitShopNotify();
		
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
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				shop.produceProduct(5);		
				
			}
		});
		producerThread.setName("Üretici");
		
		consumerThread.start();
		producerThread.start();
		
	}
	
	
	
	
	public synchronized void  consumeProduct(int amount) {
		
		if(amount>stock) {
			System.out.println("");
			System.out.println("Yeterli ürün yok, güncel stok"+ stock);
			System.out.println("Tüketici ürün girisi bekliyor");
			// nasil bekleyecek
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

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
	public synchronized void produceProduct(int amount) {
		System.out.println("");
		System.out.println(Thread.currentThread().getName()+" ürün eklemek istiyor");
		System.out.println("Yeni ürün/ler eklendi, stok güncellendi");
		stock = stock+amount;
		System.out.println("Güncel stock: "+stock);
		notify();
	}
}
