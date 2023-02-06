package creationaldesign.factorydp;

public class FactoryPatterDemo {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 =shapeFactory.getShape("daire");
		Shape shape2 =shapeFactory.getShape("kare");
		Shape shape3 =shapeFactory.getShape("dikdörtgen");
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
	}

}
