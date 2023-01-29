package com.hb01.annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_student01")
public class Student01_tekrar {

	@Id
	private int id;

	@Column(name = "studdent_name", length = 100, nullable = false, unique = false)
	private String name;

	private int grade;

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
		return "Student01_tekrar [id=" + id + ", name=" + name + ", grade=" + grade + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
