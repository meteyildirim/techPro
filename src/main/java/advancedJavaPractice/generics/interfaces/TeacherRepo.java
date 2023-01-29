package advancedJavaPractice.generics.interfaces;

public class TeacherRepo implements Repository<Teacher> {

	public void add(Teacher teacher) {
		
		System.out.println(teacher.getName()+" basari ile kaydedildi");
		
	}

	public void get(Teacher teacher) {
		
		System.out.println(teacher.getName()+" basari ile bulundu");
		
	}

	public void update(Teacher teacher) {
		
		System.out.println(teacher.getName()+" basari ile guncellendi");
		
	}

	public void delete(Teacher teacher) {
		
		System.out.println(teacher.getName()+" basari ile silindi");
		
	}

}
