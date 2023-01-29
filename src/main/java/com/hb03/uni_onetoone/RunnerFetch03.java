package com.hb03.uni_onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb02.embeddable.Student02;

public class RunnerFetch03 {

	public static void main(String[] args) {
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student03.class).addAnnotatedClass(Diary.class);
		
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx =  session.beginTransaction();
		
		
		Student03 getStd = session.get(Student03.class, 1001);
		System.out.println(getStd);
		
		Diary getStdDiary = session.get(Diary.class, 101);
		System.out.println(getStdDiary);
		System.out.println(getStdDiary.getStudent());

	
		
		tx.commit();
		session.close();
		sf.close();
		
		

	}

}
