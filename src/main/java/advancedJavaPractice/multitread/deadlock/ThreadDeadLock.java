package advancedJavaPractice.multitread.deadlock;

public class ThreadDeadLock {
	
	/*
	 * Uc kisi 3 nesneyi kullansin.
	 * 1.ksi : silgi kullaniyor ama kaleme ihtiyaci var
	 * 2. k : cetvel kullaniyor ama silgiye ihtiyaci var
	 * 3.k kalemi kullaniyor ama cetvele ihtiyaci var
	 * 
	 * Projeyi tasarlarke ic ice sychronized kullanmamak gerekir
	 * 
	 */

	public static void main(String[] args) {
		
		String kalem ="kalem";
		String cetvel ="cetvel";
		String silgi ="silgi";	
		
		Thread t1 = new Thread(new SyncThread(kalem, cetvel), "Dog" );
		Thread t2 = new Thread(new SyncThread(silgi, kalem), "Tom" );
		Thread t3 = new Thread(new SyncThread(cetvel, silgi), "Jerry" );
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}

class SyncThread implements Runnable{
private String obj1;
private String obj2;

	public SyncThread(String obj1, String obj2) {
	super();
	this.obj1 = obj1;
	this.obj2 = obj2;
}

	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name+" "+obj1+" i istiyor");
		synchronized (obj1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+" "+obj1+" i aldi");		
			System.out.println(name+" "+obj2+" i istiyor");
		synchronized (obj2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+" "+obj2+" i aldi");
			System.out.println(name+" "+obj2+" i birakti");			
		}
		
		System.out.println(name+" "+obj1+" i birakti");
		System.out.println("calisma tamamlandi");
		}		
	}
	
}
	