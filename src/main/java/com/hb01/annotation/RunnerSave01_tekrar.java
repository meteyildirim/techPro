package com.hb01.annotation;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerSave01_tekrar {

	public static void main(String[] args) {

		Student01_tekrar std1 = new Student01_tekrar();

		std1.setId(1001);
		std1.setName("Esad Yildirim");
		std1.setGrade(98);

		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student01_tekrar.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(std1);

		tx.commit();

	}

}
