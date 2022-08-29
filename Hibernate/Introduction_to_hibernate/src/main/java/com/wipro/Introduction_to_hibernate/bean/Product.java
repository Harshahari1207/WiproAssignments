package com.wipro.Introduction_to_hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	private String name;
	@Id
	private int id;
	private int price;
	public Product() {
		super();
	}
	public Product(String name, int id, int price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	

}
