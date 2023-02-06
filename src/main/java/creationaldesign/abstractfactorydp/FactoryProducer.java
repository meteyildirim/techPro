package creationaldesign.abstractfactorydp;

public class FactoryProducer {
	// bu runnerin muhatap oldugu class olacak
	
	// new yapilamasin diye...
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
	}

}
