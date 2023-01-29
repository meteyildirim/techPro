package com.hb03.uni_onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave03 {
	
	public static void main(String[] args) {
		
		Student03 std1 = new Student03();

		std1.setId(1001);
		std1.setName("Esad Yildirim");
		std1.setGrade(98);
		
		Student03 std2 = new Student03();

		std2.setId(1002);
		std2.setName("Mete Yildirim");
		std2.setGrade(88);
		
		Student03 std3 = new Student03();

		std3.setId(1003);
		std3.setName("Ahsen Yildirim");
		std3.setGrade(89);
		
		Diary d1 = new Diary();
		d1.setId(101);
		d1.setName("Esad gunluk");
		d1.setStudent(std1);
		
		Diary d2 = new Diary();
		d2.setId(102);
		d2.setName("Mete gunluk");
		d2.setStudent(std2);
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student03.class).addAnnotatedClass(Diary.class); // iki tane entitiy clasimiz var..
	
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx =  session.beginTransaction();
		
		
		session.save(std1);
		session.save(std2);
		session.save(std3);
		
		session.save(d1);
		session.save(d2);
		
		
		tx.commit();
		session.close();
		sf.close();
	}

}
