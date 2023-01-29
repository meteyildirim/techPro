package advancedJavaPractice.generics.interfaces;

import java.util.ArrayList;
import java.util.List;

// okul yonetimi icin ogrenci ogretmen kayitlarini olusturan goruntuleyen guncelleyen silen programi yaziniz

public class SchoolManagement {

	public static void main(String[] args) {
		
		Student student = new Student("Mete");
		StudentRepo studentRepo = new StudentRepo();
		Teacher teacher = new Teacher ("Hakan");
		TeacherRepo teacherRepo = new TeacherRepo();
		
		List<Teacher> teacherList = new ArrayList<Teacher>();
		
		studentRepo.add(student);
		studentRepo.update(student);
		studentRepo.get(student);
		studentRepo.delete(student);
		
		teacherRepo.add(teacher);
		
		
		

	}

}
