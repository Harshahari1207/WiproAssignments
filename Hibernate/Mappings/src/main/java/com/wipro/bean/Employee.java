package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Details")
public class Employee {
	
	@Id
	private int id;
	private String name;
	
	@OneToOne
	private Passport passport;

	public Employee() {
		super();
	}

	public Employee(int id, String name, Passport passport) {
		super();
		this.id = id;
		this.name = name;
		this.passport = passport;
	}

	public Employee(String name, Passport passport) {
		super();
		this.name = name;
		this.passport = passport;
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

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", passport=" + passport + "]";
	}
	
	

}
