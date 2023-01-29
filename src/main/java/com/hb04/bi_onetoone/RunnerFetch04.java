package com.hb04.bi_onetoone;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb02.embeddable.Student02;

public class RunnerFetch04 {

	public static void main(String[] args) {
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student04.class).addAnnotatedClass(Diary04.class);
		
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx =  session.beginTransaction();
		
		
		Student04 getStd = session.get(Student04.class, 1001);
		System.out.println(getStd);
	
		
		Diary04 getStdDiary = session.get(Diary04.class, 101);
		System.out.println(getStdDiary);
		System.out.println(getStdDiary.getStudent());
		
		
		System.out.println("******* HQL QUERY *******");
		
		String hqlQuery ="FROM Student04 WHERE grade>50 ";
		List<Student04> uResulty = session.createQuery(hqlQuery, Student04.class).getResultList();
		
		for (Iterator iterator = uResulty.iterator(); iterator.hasNext();) {
			Student04 student04 = (Student04) iterator.next();
			System.out.println(student04);
			
		}
		
//		Student04 [id=1001, name=Esad Yildirim, grade=98] // HQL nin ciktisi. toString() methodunu degistirerek burada gosterilen degistirebilrisin.
//		Student04 [id=1002, name=Mete Yildirim, grade=88]
//		Student04 [id=1003, name=Ahsen Yildirim, grade=89]
		

	// HQL 2
		System.out.println("\n\n******* HQL QUERY-2 *******");
		String hq = "SELECT s.name, d.name FROM Student04 s INNER JOIN FETCH Diary04 d on s.id=d.student";
		List<Object[]> rList = session.createQuery(hq).getResultList();
		
		for (Object[] objects : rList) {
			
		 System.out.println(Arrays.toString(objects));
			
		}
		
//		[Esad Yildirim, Esad gunluk]
//		[Mete Yildirim, Mete gunluk]
		
		// lambdayi kullanarak
		rList.forEach(oa ->{
			System.out.println(Arrays.toString(oa));
		});
		
		//LEFT join islemi
		// Butun ogrenciler ve kitabi olan ogrencileri istiyoruz
		System.out.println("Left Join ile yapalim");
		String hq1 = "SELECT s.name, d.name FROM Student04 s LEFT JOIN FETCH Diary04 d on s.id=d.student";// s.id=d.student.id seklindede yazilabilir.. hibernate bunu anliyor zaten
		
		List<Object []> gR = session.createQuery(hq1).getResultList();
		
		gR.forEach(x ->{
			System.out.println(Arrays.toString(x));
		});
		
		
		
		//Right join islemi
		// Butun gunlukler ve gunlugu olan ogrenciler
		System.out.println("Right Join ile yapalim");
		String hq2 = "SELECT s.name, d.name FROM Student04 s RIGHT JOIN FETCH Diary04 d on s.id=d.student";// s.id=d.student.id seklindede yazilabilir.. hibernate bunu anliyor zaten
		
		List<Object []> gR2 = session.createQuery(hq2).getResultList();
		
		gR2.forEach(y ->{
			System.out.println(Arrays.toString(y));
		});
		
		
		//Full join islemi
		// Butun gunlukler ve gunlugu olan ogrenciler
		System.out.println("FULL Join ile yapalim");
		String fj = "SELECT s.name, d.name FROM Student04 s FULL JOIN FETCH Diary04 d on s.id=d.student";// s.id=d.student.id seklindede yazilabilir.. hibernate bunu anliyor zaten
		
		List<Object []> fjR = session.createQuery(fj).getResultList();
		
		fjR.forEach(y ->{
			System.out.println(Arrays.toString(y));
		});
		
		
		
		
		tx.commit();
		session.close();
		sf.close();
		
		

	}

}
