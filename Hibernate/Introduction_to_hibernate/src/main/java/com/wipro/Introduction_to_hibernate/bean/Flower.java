package com.wipro.Introduction_to_hibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flower {
	@Id
	@Column (name="FlowerID")
	private String id;
	
	@Column (name="FlowerName")
	private String name;
	
	private String color;
	private int price;
	public Flower() {
		super();
	}
	public Flower(String id, String name, String color, int price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Flower [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	

}
