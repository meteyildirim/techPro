package advancedJavaPractice.generics.classes;

public class StudentLists {
	
	// 1-ogrencilerin isim vize noto ve final notunun listeleyen program yapiniz
	// 2- kutuphane icin ogrencilerin isim okul ve mail adreslerini listeleyen bir program yapiniz

	public static void main(String[] args) {
		
		System.out.println("** Java Dersi vize ve final notlari");
		listGrade();
		
		
		System.out.println(" == Kutuphane Uye Listesi ==");
		
		listLib();

	}
	
	public static void listGrade() {
		
		Student<String, Double, Double> std1 = new Student("Ahsen", 80.80, 99.9);
		Student<String, Double, Double> std2 = new Student("Esad", 82.80, 90.9);
		Student<String, Double, Double> std3 = new Student("Sinem", 83.80, 93.9);
		
		System.out.printf("%-10s  ||  %4s  || %4s    %n", std1.getS(), std1.getU(), std1.getV() );
		System.out.printf("%-10s  ||  %4s  || %4s    %n", std2.getS(), std2.getU(), std2.getV() );
		System.out.printf("%-10s  ||  %4s  || %4s    %n", std3.getS(), std3.getU(), std3.getV() );
	
	}
	
	public static void listLib() {
		
		Student<String, String, String> std1 = new Student("Ahsen", "Trabzon OO", "m@gmail.com");
		Student<String, String, String> std2 = new Student("Esad", "Kasustu OO", "k@gmail.com");
		Student<String, String, String> std3 = new Student("Sinem", "Erzurum OO", "y@gmail.com");
		
		System.out.printf("%-10s  ||  %4s  || %4s    %n", std1.getS(), std1.getU(), std1.getV() );
		System.out.printf("%-10s  ||  %4s  || %4s    %n", std2.getS(), std2.getU(), std2.getV() );
		System.out.printf("%-10s  ||  %4s  || %4s    %n", std3.getS(), std3.getU(), std3.getV() );
	
	}
	
	

}
