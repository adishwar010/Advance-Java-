package com.hibernateP.registration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import org.hibernate.annotations.Generated;

@Entity
public class Student {

	public Student() {
		super();
	}

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name ="First_name")
	private String fname;
	
	@Column(name="sex")
	private String sex;

	public Student(int id, String fname, String sex) {
		super();
		this.id = id;
		this.fname = fname;
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
