package com.wipro.Introduction_to_hibernate.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	private String name;
	
	@Id
	private int id;
	private String designation;
	private int salary;
	public Employee(String name, int id, String designation, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.salary = salary;
	}
	
	public Employee(String name, String designation, int salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public Employee() {
		super();
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", designation=" + designation + ", salary=" + salary + "]";
	}
	

}
