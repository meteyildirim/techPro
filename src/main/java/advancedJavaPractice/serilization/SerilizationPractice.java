package advancedJavaPractice.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationPractice {

	public static void main(String[] args) {
		
		// book nesnesindeki verileri book.txt kaydet
		// book class olustur
		// serilazible yapmak icin 
		// book implement Serializible yap
		
		writeObject();// books.txt yazar
		readObjects();

	}
	
	public static void writeObject() {
		Book book1 = new Book("Sefilller", "VictorHigo", 1900);
		Book book2 = new Book("Hayvan Ciftligi", "Georg Orwill", 1956);
		Book book3 = new Book("Savas Baris", "Dostoyevski", 1896);
		
		try {
			FileOutputStream fos = new FileOutputStream("books.txt");
			ObjectOutputStream write = new ObjectOutputStream(fos); // nesneleri yazdirmak icin kullanilir
			write.writeObject(book1);
			write.writeObject(book2);
			write.writeObject(book3);
			write.close();
			fos.close();
		} catch (Exception e) { // Exception tum exceptinlaeri yakalar... 
			
			e.printStackTrace();
		}

		
	}
	public static void readObjects() {
		// dosyalari okumak icin
		try {
			FileInputStream fis = new FileInputStream("books.txt");
			ObjectInputStream read = new ObjectInputStream(fis);
			Book book1 = (Book) read.readObject();
			Book book2 = (Book) read.readObject();
			Book book3 = (Book) read.readObject();
			
			System.out.println(book1);
			System.out.println(book2);
			System.out.println(book3);
			read.close();
			fis.close();
			
			// while icerisinde calistirmayi dene
			// object sadece bir ozeliigini okumak icin ne yapmali
			// try(FileInputStream fis=new FileInputStrem("books")) seklinde yapsak close ihtiyac kalmaz
			
			
		} catch (Exception e) { // FileNotFoundException yerine Exception kullanabilirsin
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}


}
