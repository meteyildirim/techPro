package advancedJavaPractice.multitread.creation;

public class ThreadCreation3 {

	public static void main(String[] args) {
		
		/*
		 * Task: Anonymous slass kullnarak thread olusturunuz
		 * lambda expression kullanarak thread olusturunz
		 */
		
		// Anaymous : bunu ogren
		Thread thread1 = new Thread(new Runnable() {
			
			public void run() {
				Thread.currentThread().setName("Tweety kacacagim");
				String name = Thread.currentThread().getName();
				for (int i = 0; i <100; i++) {
					System.out.println(name + "--->" + i);					
				}
			}			
	});
		
		//lambda expression
		Thread thread2 = new Thread(()->{
			
			Thread.currentThread().setName("Silvester yakalayacagim");
			String name = Thread.currentThread().getName();
			for (int i = 0; i <100; i++) {
				System.out.println(name + "--->" + i);				
			}						
			
		});
		
		thread1.start();
		thread2.start();

}
	
	// runnable interface kullanrak thread olusturmak daha cok tercih edilir cunku
	/*
	 * Javada sadece bir class extend edebildigimiz icin bu bir hakkimizi thread ile harcamamaliyiz.
	 * 
	 */
	
}
