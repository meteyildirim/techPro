package com.hb01.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="t_student01")  
public class Student01 {
	

	@Id // tabloda ID olusturmayi saglar. Yani unique deger. Primary deger
	//@Column(name="std_id") // bunu kullanirsan sutun ismi ID degilde std_id olur
	private int id;
	
	// name isminide sutun olusturur ama istersen column anno ile ismi farkli ver
	@Column(name="student_name", length=100, nullable = false, unique = false) // sql de ismi bu, 100 harfen daha uzun deger alamaz
	private String name; // javadaki ismi bu
	
	//@Transient // DB deki tablo "grade" adinada bir  kolon olusmasini engeller
	private int grade;
	
//	@Lob // large object belirtir...image icin kullan
//	private byte[] image;
	
	// getter ve setters 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student01 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

	

}
