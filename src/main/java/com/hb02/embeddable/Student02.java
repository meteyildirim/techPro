package com.hb02.embeddable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_student02")
public class Student02 {
	

	@Id
	private int id;
	
	@Column(name="student_name", length = 100, nullable =false, unique =false)
	private String name;
	
	@Embedded // kullanimi optional
	private Address address;
	
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
