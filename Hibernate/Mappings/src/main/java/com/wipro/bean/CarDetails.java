package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Car_Details")
public class CarDetails {
	@Id
	private String regNo;
	private String model;
	private String color;
	
	@Column(name="Manufacturer")
	private String manuf;

	public CarDetails() {
		super();
	}

	public CarDetails(String regNo, String model, String color, String manuf) {
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
		return "Car_Details [regNo=" + regNo + ", model=" + model + ", color=" + color + ", manuf=" + manuf + "]";
	}
	
	

}
