package override;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Silindir silindir = new Silindir(4,5);
		Silindir silindir2 = new Silindir();
		Square square = new Square(3);
		
		
		System.out.println(silindir.alan() +" " +square.alan());
		
		System.out.println(silindir2.alan());
		
		silindir2.setdYaricap(2);
		silindir2.setdYukseklik(3);
		
		System.out.println(silindir2.alan());
		
		
		
		

	}

}
