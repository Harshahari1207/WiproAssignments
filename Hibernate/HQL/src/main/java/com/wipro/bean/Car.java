package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Car")
public class Car {
	
	@Id
	@Column(name="RegNo", length=5)
	private String regNo;
	
	@Column(name="Model", length=20)
	private String model;
	
	@Column(name="Color", length=10)
	private String color;
	
	@Column(name="Manufacturer", length=20)
	private String manuf;

	public Car() {
		super();
	}

	public Car(String regNo, String model, String color, String manuf) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.color = color;
		this.manuf = manuf;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManuf() {
		return manuf;
	}

	public void setManuf(String manuf) {
		this.manuf = manuf;
	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", model=" + model + ", color=" + color + ", manuf=" + manuf + "]";
	}
	
	

}
