package advancedJavaPractice.multitread.creation;

public class Counter implements Runnable{
	
	private String name;
	
	

	public Counter(String name) {
		super();
		this.name = name;
	}



	public void run() {
		
		System.out.println(this.name+ " start...");
		for (char i = 'a'; i <= 'z'; i++) {
			
			System.out.println(this.name + "--> "+i);
			
			
			
		}
		
		System.out.println(this.name+ " finished...");
		
	}

}
