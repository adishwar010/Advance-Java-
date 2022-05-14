package com.spring.orm.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	
	@Id
	private int sId;
	public Student(int sId, String name, String city) {
		super();
		this.sId = sId;
		this.name = name;
		this.city = city;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student() {
		super();
	}
	private String name;
	private String city;
}
