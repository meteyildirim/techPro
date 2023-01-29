package com.hb01.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01_tekrar {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student01_tekrar.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction(); 
		
		Student01_tekrar std1 = session.get(Student01_tekrar.class, 1001);
		System.out.println(std1);
		tx.commit();
		session.close();
		sf.close();



	}

}
