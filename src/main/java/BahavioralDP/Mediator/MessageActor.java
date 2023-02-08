package BahavioralDP.Mediator;

public class MessageActor implements Actor{
	
	String name;
	Dispatcher dispatcher;
	

	public MessageActor(String name, Dispatcher dispatcher) {
		super();
		this.name = name;
		this.dispatcher = dispatcher;
	}

	@Override
	public void recieveMessage(String message) {
		
		System.out.println(name + " recieved message "+ message);
		
		
	}

	@Override
	public void sendMessage(String topic, String message) {
		
		dispatcher.dispatch(topic, message);
		
		
	}

}
