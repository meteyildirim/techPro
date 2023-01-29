package advancedJavaPractice.multitread.creation;

public class Sayac extends Thread {
	
	private String name;
	
	public Sayac(String name) {
		super();
		this.name = name;
	}

	// run metodunu override et
	@Override
	public void run() {
		
		System.out.println(this.name+ " thread started");
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println(this.name+" --> "+i);
			
		}
		
		System.out.println(this.name+ " thread finished");
		
		
	}

}
