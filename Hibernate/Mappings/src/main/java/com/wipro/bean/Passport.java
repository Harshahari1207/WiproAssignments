package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {
	
	@Id
	private int id;
	private String passportNo;
	public Passport() {
		super();
	}
	public Passport(int id, String passportNo) {
		super();
		this.id = id;
		this.passportNo = passportNo;
	}
	
	public Passport(String passportNo) {
		super();
		this.passportNo = passportNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", passportNo=" + passportNo + "]";
	}
	

}
