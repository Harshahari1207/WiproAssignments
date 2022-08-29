package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Car_Owner")
public class CarOwner {
	@Id
	@GeneratedValue
	@Column(name="OwnerID")
	private int id;
	@Column(name="OwnerName", length=30)
	private String name;
	
	@OneToOne
	private CarDetails car;

	public CarOwner() {
		super();
	}

	public CarOwner(String name, CarDetails car) {
		super();
		this.name = name;
		this.car = car;
	}

	public CarOwner(int id, String name, CarDetails car) {
		super();
		this.id = id;
		this.name = name;
		this.car = car;
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

	public CarDetails getCar() {
		return car;
	}

	public void setCar(CarDetails car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "CarOwner [id=" + id + ", name=" + name + ", car=" + car + "]";
	}
	
	

}
