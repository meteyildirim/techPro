package advancedJavaPractice.generics.interfaces;

// class generic bir interfaces implement ediyorsa kendiside generic olmak zorunda 
// veya bunu yerine data tipini girerek hatanin onune geceriz

public class StudentRepo implements Repository<Student> {


	public void add(Student student) {
		System.out.println(student.getName()+" basari ile kaydedildi");
		
	}

	public void get(Student student) {
		
		System.out.println(student.getName()+" basari ile bulundu");

	}

	public void update(Student student) {
		
		System.out.println(student.getName()+" basari ile guncellendi");

		
	}

	public void delete(Student student) {
		
		System.out.println(student.getName()+" basari ile silindi");

		
		
	}

}
