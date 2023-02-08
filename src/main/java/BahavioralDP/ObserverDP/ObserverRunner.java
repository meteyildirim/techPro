package BahavioralDP.ObserverDP;

import net.bytebuddy.agent.builder.AgentBuilder;

public class ObserverRunner {

	public static void main(String[] args) {
		
		ObserverRunner obrun = new ObserverRunner();
		
		obrun.observerDemo();

	}
	
	public  void observerDemo() {
		
		Channel ch1 = new NewsChannel();
		Channel ch2 = new NewsChannel();
		Channel ch3 = new NewsChannel();
		
		// kanallari kaydet
		
		NewsAgency agency = new NewsAgency();
		
		agency.addObserver(ch1);
		agency.addObserver(ch2);
		agency.addObserver(ch3);
		
		agency.sendNews("Deprem");
		agency.sendNews("Yardim");
		agency.sendNews("Ihtiyac");
		
		System.out.println("ch1 haber");
		ch1.printNews();
		System.out.println("ch2 haber");
		ch2.printNews();
		System.out.println("ch3 haber");
		ch3.printNews();
		
	}

}
