package advancedJavaPractice.multitread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// treadler ayni anda ortak kaynaga ulasmasi gerektiginde sorunlar olabilir...
// bunun icin kaynaga sira ile erismesini saglariz. BUnun icin sy
// Thread maliyetli oldugu icin daha az sayida thread ile bu isi yapacagiz. daha once bunu 5 thread ile yapmistik. simdi bunu 3 thread ile yapacagiz

// 5 kisi var 3 bilgisayar var... isini yapan birakip gidiyor gibi
public class AppointmentApp2 {

	public static void main(String[] args) {

		/*
		 * Appointment prorami olacak herbir talep icin bir sonraki gun icin randevu
		 * verecek
		 * 
		 */
		ExecutorService service = Executors.newFixedThreadPool(3);
		String[] users = { "mete", "hasan", "kemal", "ali", "zeynep" };
		
		AppointmentCenter2 appoinmentCenter = new AppointmentCenter2();
		
		for(String user : users) {
			MyThread thread = new MyThread(appoinmentCenter); // veya kisaca  new AppointmentCenter2() 
			service.execute(thread); // thread.start kullanmiyoruz da thread havuza attiyoruz.
		}
		
		service.shutdown();

	}

}

class MyThread extends Thread {

	private AppointmentCenter2 appointmentCenter;
	
	

	public MyThread(AppointmentCenter2 appointmentCenter) {
		super();
		this.appointmentCenter = appointmentCenter;
	}



	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname+ " basladi");
		System.out.println("Randevu tarihiniz: "+ appointmentCenter.getAppointmentDate());
		System.out.println(tname+" bitti.");

	}
}