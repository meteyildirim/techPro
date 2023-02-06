package creationaldesign.singletondp;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		// burada Singleton object olusturamayiy.
		// Asagidaki hata verir. cunku constructor private dir
		//SingletonObject obj1 =  new SingletonObject();
		
		// kullanmak icin static metodu cagiririz. oda bize hep ayni objeyi doner
		SingletonObject obj2 = SingletonObject.getInstance();
		
		// test edelim, baska obj olusturalim
		SingletonObject obj3 = SingletonObject.getInstance();
		
		System.out.println(obj2==obj3); // true degerini verir... eger new ile yapilsa false olurdu..
		
		// 2ci yol test icin SigletonObject de bir public class olusturalim ve message degistirelim.
		// 1 obje ile degistirince diger objeninde degistigini goreceksin.
		
		System.out.println("Obj2 message:"+ obj2.message);
		System.out.println("Obj3 message:"+ obj3.message);
		obj2.changeMessage("Selam");
		// sadece obj2 degistirdim ama obj3 de degisti...:) they are same MAN
		System.out.println("Obj2 message:"+ obj2.message);
		System.out.println("Obj3 message:"+ obj3.message);
	}

}
