package creationaldesign.abstractfactorydp;

public class ShapeFactory extends AbstractFactory{
	
	public Shape getShape(String shapeType) {
		
		if (shapeType ==null) {
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("daire")) {
			return new Circle();
		}
		if(shapeType.equalsIgnoreCase("kare")) {
			return new Square();
		}
		if(shapeType.equalsIgnoreCase("dikdörtgen")) {
			return new Rectangle();
		}
		return null;
		
	}


	Color getColor(String color) {
    // bu shape factoryde oldugu icin null donuyor
		return null;
	}

}
