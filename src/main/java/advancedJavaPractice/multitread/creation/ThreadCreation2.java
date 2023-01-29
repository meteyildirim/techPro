package advancedJavaPractice.multitread.creation;

public class ThreadCreation2 {
	
	/*
	 * Task : Runnable sinifindan bir thread olusturun ve bu threadler ile harfleri a dan z ye kadar yazdiriin
	 * 
	 * 2. yontemi kullanin
	 */
	
	public static void main(String[] args) {
		
	// main thread cabuk bitirdigi icin yaris basladi ve bitti hemen yazilir
		// bir cozum main thread uyutmaktir...
	
	System.out.println("Yaris basladi...");
		
	Counter counter1 = new Counter ("RoadRunner");
	Counter counter2 = new Counter ("SpeedyGonzales");
	
	Thread thread1 = new Thread(counter1);
	Thread thread2 = new Thread(counter2);
	
	thread1.start();
	thread2.start();

//	try {
//		Thread.sleep(100);
//	} catch (InterruptedException e) {
//		// TODO Bu sekilde yapinca yaris bittiyi en sona yazacak...coo mantikli cozum degil
//		e.printStackTrace();
//	}
	
// ikinci coum join methodu
	
	
	try {
		thread1.join(); // main threadine-methoduna thread 1 ve thread 2 beklmesini soyler
		thread2.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	System.out.println("Yaris bitti...");


	}
	
	// soru once hangi thread bittigini bilemilrmiyiz.. hayir JVM kontrolunde
	// thread bir bitince thread iki baslasin ...
	

}
