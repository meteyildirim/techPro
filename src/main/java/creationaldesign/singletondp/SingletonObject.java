package creationaldesign.singletondp;

// Singleton yapisi .. her cagrildigin da ayni object doner... 
public class SingletonObject {
	
	String message = "Merhaba";
	
	private static SingletonObject instance = new SingletonObject();
	
	private SingletonObject( ) {};
	
	public static SingletonObject getInstance() {
		return instance;
	}
	
	public void changeMessage(String message) {
		this.message = message;
		
	}

}
