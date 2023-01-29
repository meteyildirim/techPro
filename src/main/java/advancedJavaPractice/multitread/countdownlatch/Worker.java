package advancedJavaPractice.multitread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread {

	private String name;
	private CountDownLatch latch;
	
	
	public Worker(String name, CountDownLatch latch) {
		super();
		this.name = name;
		this.latch = latch;
	}
	
	public void run(){
		System.out.println(name+ " thread basladi");
		System.out.println(name+ " islem yapiliyor");
		System.out.println(name+ " thread bitti.");
		latch.countDown();
	}
	
	

}
