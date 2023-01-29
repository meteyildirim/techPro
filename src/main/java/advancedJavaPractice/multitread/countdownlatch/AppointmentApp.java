package advancedJavaPractice.multitread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class AppointmentApp {
	
	// main tread her zaman calissiyor.
	// bazi islemler onaylansin sonra tread calissin diyorsan latch kullan.
	
	// ornegin randevu olusturmadan once form doldurulacaktir
	
	// yani butun treadler ayni anda calismayacak bazilarina oncelik verilecek..
	
public static void main(String[] args) {
	
	CountDownLatch countDownLatch = new CountDownLatch(3);
	
	String[] users = {"Hakan","Boris","Sara","Kejda"};
	
	AppointmentCenter2 center = new AppointmentCenter2();
	
	for (String user : users) {
		
		Thread thread = new Thread ( new Runnable() {
			
			@Override
			public void run() {
				
				try {
					countDownLatch.await(); // threadlere beklemelerini soyluyor..countDownLatch calisana kadar
				} catch (InterruptedException e) {
					
					throw new RuntimeException();
				}
				System.out.println("Randevu tarihiniz: "+ center.getAppointmentDate());
				
			}
		});
		thread.start();
		
	}
	

// worker threadleri : bunlarin isleri daha oncelikli: Bu 3 tanesi diger treadlerden once calisacak
Worker w1 = new Worker("A", countDownLatch);
Worker w2 = new Worker("B", countDownLatch);
Worker w3 = new Worker("C", countDownLatch);

w1.start();
w2.start();
w3.start();

}
}

