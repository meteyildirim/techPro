package com.hb05_uni_manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave05X {

	public static void main(String[] args) {
		
		Student05X std1 = new Student05X();

		std1.setId(1001);
		std1.setName("Esad Yildirim");
		std1.setGrade(98);
		
		Student05X std2 = new Student05X();

		std2.setId(1002);
		std2.setName("Mete Yildirim");
		std2.setGrade(88);
		
		Student05X std3 = new Student05X();

		std3.setId(1003);
		std3.setName("Ahsen Yildirim");
		std3.setGrade(89);
		
		UniversityX uni = new UniversityX();
		uni.setId(1);
		uni.setName("Uni Wien");
		
		std1.setUniversity(uni);
		std2.setUniversity(uni);
		std3.setUniversity(uni);

		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student05X.class).addAnnotatedClass(UniversityX.class); // iki tane entitiy clasimiz var..
	
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx =  session.beginTransaction();	
		
		
		session.save(std1);
		session.save(std2);
		session.save(std3);
		session.save(uni);

		
		tx.commit();
		session.close();
		sf.close();
		

	}

}
