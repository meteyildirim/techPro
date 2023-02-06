package creationaldesign.abstractfactorydp;

public abstract class AbstractFactory {
	
	// sadece yonlendirme yapacak
	
	abstract Color getColor(String color); // metodun tipi color
	abstract Shape getShape(String shape); // metodun tipi shape


}
