package com.hibernate.Grocery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private int Id;
	
	@Column(name="Product")
	private String Pname;
	
	@Column(name="Category")
	private String category;
	
	@Column(name="Price")
	private int price;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product(int id, String pname, String category, int price) {
		super();
		Id = id;
		Pname = pname;
		this.category = category;
		this.price = price;
	}

	public Product() {
		super();
	}
	
	
	
	
}
