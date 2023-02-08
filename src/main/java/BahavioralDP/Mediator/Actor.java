package BahavioralDP.Mediator;

public interface Actor {
	
	void recieveMessage(String message);
	
	void sendMessage( String topic, String message);

}
