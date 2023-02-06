package com.hb05_uni_manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UniversityX {
	
	@Id
	private int id;
	
	
	@Column(nullable = false, unique = true)
	private String name;


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


	@Override
	public String toString() {
		return "Universty [id=" + id + ", name=" + name + "]";
	}
	
	

}
