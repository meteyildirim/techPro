package BahavioralDP.Mediator;

public class MediatorRunner {
	
	public static void main(String[] args) {
		
		MediatorRunner mediator = new MediatorRunner();
		
		mediator.mediatorDemo();
		
	}
	
	void mediatorDemo() {
		
		MessageDispatcher dispacther = new MessageDispatcher();
		
		Actor actor1 = new MessageActor("Actor 1", dispacther);
		Actor actor2 = new MessageActor("Actor 2", dispacther);
		Actor actor3 = new MessageActor("Actor 3", dispacther);
		Actor actor4 = new MessageActor("Actor 4", dispacther);
		
		dispacther.register("topic1", actor1);
		dispacther.register("topic2", actor2);
		dispacther.register("topic3", actor3);
		dispacther.register("topic4", actor4);
		
		actor1.sendMessage("topic2", "Message for topic 2");
		actor2.sendMessage("topic3", "Message for topic 3");
		actor3.sendMessage("topic8", "Message for topic 4");
	}

}
