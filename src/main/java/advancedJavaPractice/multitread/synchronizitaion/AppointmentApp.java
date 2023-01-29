package advancedJavaPractice.multitread.synchronizitaion;

import java.time.LocalDate;

// treadler ayni anda ortak kaynaga ulasmasi gerektiginde sorunlar olabilir...
// bunun icin kaynaga sira ile erismesini saglariz. BUnun icin sy

public class AppointmentApp {
	
	public static void main(String[] args) {
		
		/*
		 * Appointment prorami olacak
		 * herbir talep icin bir sonraki gun icin randevu verecek
		 * 
		 */
		
		String[] users = {"Tolstoy","Victor Higo", "Balzac","Dostoyevsky"};
		
		AppointmentCenter appCenter = new AppointmentCenter();
		
		//System.out.println(appCenter.getAppointmentDate() + users[0]);		
		
		for( String user:users) { // users sayisi kadar thread olusturacak
		Thread thread = new Thread (new Runnable() {
			@Override
			public void run() {					
				Thread.currentThread().setName(user);
				String name = Thread.currentThread().getName(); // thread isim vermeyince 0, 1 seklinde isim veriri ve ya alternatif olarak
				// onceki satirdaki gibi isim verebiliriz...				
				System.out.format("Sayin %-16s, Randevu tarihiniz: %10s %n",name,appCenter.getAppointmentDate());				
			}	
		});		
		
		thread.start(); //thread.run();
		}	
   }
	
//	Sayin Tolstoy         , Randevu tarihiniz: 2023-01-21 
//	Sayin Tolstoy         , Randevu tarihiniz: 2023-01-22 
//	Sayin Tolstoy         , Randevu tarihiniz: 2023-01-21 
//	Sayin Tolstoy         , Randevu tarihiniz: 2023-01-21 
	
// Ayni tarihlere randevu veriyor... synchronized kelimesini ekleyince
	
	// public synchronized LocalDate getAppointmentDate(  
	
//	Sayin Victor Higo     , Randevu tarihiniz: 2023-01-21 
//	Sayin Tolstoy         , Randevu tarihiniz: 2023-01-23 
//	Sayin Dostoyevsky     , Randevu tarihiniz: 2023-01-24 
//	Sayin Balzac          , Randevu tarihiniz: 2023-01-22 
	
// her kisiye ayri tarihlerde randevu verilir.

/* Ayrica eger blogun icinde sadce bir ksim da synchronized yapilabilir
 *  synchronized (this) {
 *  day = day.plusDays(1);
 *  }
 *  
 *  ifadesi ile sadece day i lock yapabiliriz
 */

}
