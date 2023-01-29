package advancedJavaPractice.multitread.volatileKeyword;

public class Numerator {
	
	private volatile static int counter = 0;
	
	public synchronized void getOrder() {
		
		String name = Thread.currentThread().getName();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		counter++;
		System.out.println("Sayin "+name+" siraniz: "+ counter);
	}
	

}
