package creationaldesign.abstractfactorydp;

public class ColorFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		
		if(color==null) 
			{
			return null;
			}
		if(color.equalsIgnoreCase("blue")) 
			{
			return new Blue();
			}
		if(color.equalsIgnoreCase("red")) 
			{
			return new Red();
			}
		if(color.equalsIgnoreCase("green")) 
			{
			return new Green();
			}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		
		return null; // bunu null olarak birakiyoruz.. cunku bu fabrika color uretir.
	}

}
