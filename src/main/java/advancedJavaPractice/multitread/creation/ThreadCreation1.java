package advancedJavaPractice.multitread.creation;

public class ThreadCreation1 {
	
	// process veya treadler coklu is yapilmasini(bilgisayarda) saglar.
	// processler bilgisayarin mp3 calarken excel kullanilmasi gibi
	// thread ise zoomda ses goruntu, ekran paylasimi yapma
	
	/*
	 * Threadler iki sekilde olustulur
	 * 1. thread sinifindan bir alt sinif olusturulur ve override yapilir
	 * 2. runnable interfacenin implement eden bir alt sinif olsuturulur run metodu override olur.ardindan thread sinifina constructor nesne olarak gonderilir.
	 * 
	 * Run methodu main de cagrilabilir ama thread olusturmaz
	 * 
	 * Java da thread olsuturmzsak uygulamalar nerede calisir.
	 * javada varsayilan olarak tum uyfulamalar main metodunu kullanir.
	 */

	public static void main(String[] args) {
		
		/*
		 * Task1: Thread sinifini exztend eden sayac sinifini olusturup bu 
		 * siniftan sayilari 1 den 100 kadar yazdiran iki tane thread olsuturunuz
		 */
		
		// sayac sinifini olusturduk
		// iki tread de ayni anda calisiyor...
		Sayac thread1= new Sayac("Ronalda");
		Sayac thread2= new Sayac("Messi");
		
		thread1.start();
		thread2.start();
		
		// iki thread ayni anda ayni veriyi kullanmak isterse , o zaman bir thread bitince digeri calistirilir...
				

	}

}
