package com.hb01.annotation;


import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01 {

	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student01.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();	
		
		// Db den bilgi almak icin
		   // 1.yol: get methodu ( en basiti)
			// 2: yol: SQl ile yaz
			// HQL yazabilirsiniz. Class + SQL = HQL
		
			// 
//		Student01 student1 = session.get(Student01.class, 1001); // class ismini yaz ve ID yaz
//		Student01 student2 = session.get(Student01.class, 1002); // class ismini yaz ve ID yaz
//		Student01 student3 = session.get(Student01.class, 1003); // class ismini yaz ve ID yaz
//		System.out.println(student1);
//		System.out.println(student2);
//		System.out.println(student3);
		
		//********* 2. yol ************
//
//				String sqlQuery = "SELECT * FROM t_student01";
//		
//		List<Object []> resultList = session.createSQLQuery(sqlQuery).getResultList(); // gelen list ve object olacagini biliyoruz.
//		
//		for(Object[] object: resultList) {
//			System.out.println(Arrays.toString(object));
//			
//		}
		
		// ****** 3.yol ****** HQL : Burada tablo ismi veya header kullanmiyoruz
		// SQL sorgusunda fromdan sonra sinif ismi kullanilmalidir
		
//		String hqlQuery = "FROM Student01";// burada sinifin ismini kullaniyoruz. SQL den farkli
//		List<Student01> resultList2 = session.createQuery(hqlQuery, Student01.class).getResultList();
//		
//		for(Student01 student01: resultList2) {
//			System.out.println(student01);
//		}
		
	// uniqueResult() with SQL

//		String sqlQuery2 = "SELECT * FROM t_student01 WHERE student_name='Kasim Güler'";
//		
//		Object[] uResultx = (Object[]) session.createSQLQuery(sqlQuery2).uniqueResult();
//		
//		System.out.println(Arrays.toString(uResultx));
//		
		
	// HQL ile yazalim
//		String hqlQuery3 ="FROM Student01 WHERE name='Mete Yildirim' ";
//		Student01 uResulty = session.createQuery(hqlQuery3, Student01.class).uniqueResult();
//		System.out.println(uResulty);
		
	// ********* Yukaridaki ifadeyi HQL ile Alias kullanarak yapabilirz.
		
//		String hqlQuery3 = "FROM Student01 std WHERE std.name='Kasim Güler'"; //std alias oluyor.
//		Student01 uniResult = session.createQuery(hqlQuery3,Student01.class).uniqueResult();
//		System.out.println(uniResult);
		
 // **** grade degeri X olan ogrencileri getireleim
		
		String hqlQuery4 = "FROM Student01 s WHERE s.grade=90 ";
		List<Student01> stdList = session.createQuery(hqlQuery4, Student01.class).getResultList();
		
		for(Student01 s: stdList) {
		System.out.println(s);
	}
		// 2. alternatif
//		String hqlQuery5 = "SELECT s.id,s.name FROM Student01 s WHERE s.grade=90";
//		List<Object[]> stdList5 = session.createQuery(hqlQuery5).getResultList();
//		
//		for(Object[] s: stdList5) {
//		System.out.println(Arrays.toString(s));
//	}
				
		
		tx.commit();
		session.close();
		sf.close();
	}

}
