package creationaldesign.abstractfactorydp;

public class AbstractFactoryPatternDemo {
	
	// bu runner class
	// buradan sadece factory producer emredecegiz...
	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");		
		Shape shape1 = shapeFactory.getShape("daire");
		shape1.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color1 = colorFactory.getColor("red");
		color1.fill();
	}
	

}
