package com.hb04.bi_onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student04 {

	@Id
	private int id; // burada int degilde Long veya Integer gibi wrapper tercih edilmeli. Cunku
					// bunlar null default degeri alirken int 0 default degeri alir

	@Column(name = "std_name")
	private String name;

	private int grade;

	@OneToOne(mappedBy = "student") // mappedBy buradaki classin tableninda yeni bir column olusmamasini saglar.
	private Diary04 diary;

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

	public Diary04 getDiary() {
		return diary;
	}

	public void setDiary(Diary04 diary) {
		this.diary = diary;
	}

	@Override
	public String toString() {
		return "Student04 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

}
