package advancedJavaPractice.multitread.semaphorex;

import java.util.concurrent.Semaphore;

public class semaphorePr {
	
	/*
	 * Semaphore bir kaynaga erisebilen is parcacigi sayisini kisitlamak icin kullanilir
	 * Yani synchronized sadece bir is parcaciginin kilitlenmesi ve
	 * senkronize blok / yontemi yurutmesi izin verirken, semaphore n is parcacigina kadar izin verir ve digerlerini engeller
	 * 
	 * senaryo: deneme kabini/odeme kasasi
	 * Magazanin 3 denme kabini var. 5 kisi magazanin deneme kabini kullanmak istiyor
	 * Bu 5 tane islem icin 5 thread kullanilsin.
	 */
	
	public static void main(String[] args) {
		
		Semaphore semaphore = new Semaphore(3);
		
		Person person1 = new Person("Fred", semaphore);
		Person person2 = new Person("Wilma", semaphore);
		Person person3 = new Person("Betty", semaphore);
		Person person4 = new Person("Cakil", semaphore);
		Person person5 = new Person("Dino", semaphore);
		
		person1.start();
		person2.start();
		person3.start();
		person4.start();
		person5.start();
		
	}
	

		
		
	}

class Person extends Thread {
	
	private String name;
	private Semaphore semaphore;
	public Person(String name, Semaphore semaphore) {
		super();
		this.name = name;
		this.semaphore = semaphore;
	}
	
	public void run() {
		System.out.println(name+ " kabine girmek istiyor...");
		
		try {
			semaphore.acquire();// musaitt mi
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
		
		System.out.println(name + " kabini girdi");
		System.out.println(name + " kabini kullaniyor");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+ " Kabinden cikiyor");
		semaphore.release();
	}
	
}
