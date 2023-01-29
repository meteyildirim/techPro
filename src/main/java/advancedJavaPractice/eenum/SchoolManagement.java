package advancedJavaPractice.eenum;

import advancedJavaPractice.generics.interfaces.Student;
import advancedJavaPractice.generics.interfaces.Teacher;

public class SchoolManagement {

	// student and teacher deleting programs
	// user icin role tanimlayin (ADMIN, TEACHER, STUDENT) ve rollere gore silme
	// yetkisi olacak
	// student silme yetkisi teacher ve admin de olacak
	// teacher silme yetkisi admin de olacak

	public static void main(String[] args) {

		Student student = new Student("Esad Yildirim");
		Teacher teacher = new Teacher("Mustafa Basaran");

		User user1 = new User("Mete", Role.ROLE_ADMIN);
		User user2 = new User("Kazim", Role.ROLE_TEACHER);
		User user3 = new User("Mete", Role.ROLE_STUDENT);

		//
		deleteStudent(student, user1);
		deleteTeacher(teacher, user3);
		deleteTeacher(teacher, user2);
		deleteTeacher(teacher, user1);

	}

	public static void deleteStudent(Student std, User user) {

		if (user.getRole().equals(Role.ROLE_ADMIN) || user.getRole().equals(Role.ROLE_TEACHER)) {
			System.out.println("Student is deleted succesfully by " + user.getRole().getName().toUpperCase());
		} else {
			System.out.println(user.getRole().getName().toUpperCase() + " is not permitted to delete Student.");
		}

	}

	public static void deleteTeacher(Teacher teacher, User user) {

		if (user.getRole().equals(Role.ROLE_ADMIN)) {
			System.out.println("Teacher is deleted succesfully by " + user.getRole().getName().toUpperCase());
		} else {
			System.out.println(user.getRole().getName().toUpperCase() + " is not permitted to delete Teacher.");
		}

	}
}
