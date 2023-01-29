package com.hb01.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {
	
	public static void main(String[] args) {
		
		Student01 student1 = new Student01();
		student1.setId(1001);
		student1.setName("Mete Yildirim");
		student1.setGrade(90);
		
		Student01 student2 = new Student01();
		student2.setId(1002);
		student2.setName("Kasim Güler");
		student2.setGrade(92);
		
		Student01 student3 = new Student01();
		student3.setId(1003);
		student3.setName("Veli Yildiz");
		student3.setGrade(62);
		//hibernate conf dosyasini ve entity classini bildir.
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student01.class);
		
		
		// session olustur 
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx =  session.beginTransaction();
		
		//session.save(student1);
		//session.save(student2);
		session.save(student1);
		
		tx.commit(); // data base yazmayi yap
		
		session.close();
		
		
		
	}

}
