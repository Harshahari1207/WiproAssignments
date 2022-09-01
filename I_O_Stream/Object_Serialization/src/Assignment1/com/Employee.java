package Assignment1.com;

import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private String dob;
	private String department;
	private String designation;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee [name = " +name+ ", dob = " +dob+ ", department = " +department+ ", salary = " +salary+ "]";
	}

}
