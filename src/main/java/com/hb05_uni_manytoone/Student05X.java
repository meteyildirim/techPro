package com.hb05_uni_manytoone;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

@Entity
public class Student05X {
	
	@Id
	private int id;
	
	@Column(name="student_name", nullable = false)
	private String name;
	
	private int grade;
	
	private LocalDateTime createOn; // objenin olusturuldugu tarih.
	
	@ManyToOne
	@JoinColumn(name="university_id")
	private UniversityX university;
	
	@PrePersist // Bu anotation : Database yazildiginda bu methodu calistir ve createOn bu tarihi atar... objenin olusturulma tarihi ile database yazilma tarihi farkli olabilir.
	public void prePersist() {
		createOn = LocalDateTime.now();
	}

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

	public LocalDateTime getCreateOn() {
		return createOn;
	}

//	public void setCreateOn(LocalDateTime createOn) { bu mantikli degil.. degistirlmemeli
//		this.createOn = createOn;
//	}

	public UniversityX getUniversity() {
		return university;
	}

	public void setUniversity(UniversityX university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Student05 [id=" + id + ", name=" + name + ", grade=" + grade + ", createOn=" + createOn
				+ ", university=" + university + "]";
	}

	
	
}
