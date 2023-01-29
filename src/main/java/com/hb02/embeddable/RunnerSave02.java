package com.hb02.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave02 {

	public static void main(String[] args) {
		
		Student02  std1 =  new Student02();
		std1.setId(1001);
		std1.setName("Mete Yildirim");
		Address add1 = new Address();
		
		add1.setCity("Trabzon");
		add1.setCountry("Turkiye");
		add1.setZipCode("6100");
		std1.setAddress(add1);
		
		Student02  std2 =  new Student02();
		std2.setId(1002);
		std2.setName("Mete Yildirim");
		Address add2 = new Address();
		
		add2.setCity("London");
		add2.setCountry("UK");
		add2.setZipCode("3456");
		std2.setAddress(add2);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student02.class);
		// biden fazla entity class olursa ..addAnnotatedClass(Student03.class) seklinde ekleyebilirsin
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx =  session.beginTransaction();
		
		
		session.save(std1);
		session.save(std2);
		
		
		tx.commit();
		session.close();
		sf.close();
	}

}
