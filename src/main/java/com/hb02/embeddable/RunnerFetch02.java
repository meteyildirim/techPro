package com.hb02.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch02 {

	public static void main(String[] args) {
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student02.class);
		// biden fazla entity class olursa ..addAnnotatedClass(Student03.class) seklinde ekleyebilirsin
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx =  session.beginTransaction();
		
		Student02 getStd = session.get(Student02.class, 1001);
		System.out.println(getStd);
		System.out.println(getStd.getId() + " "+ getStd.getName());
		System.out.println(getStd.getAddress());
		
		
		tx.commit();
		session.close();
		sf.close();
	}

}
