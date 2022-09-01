package set.Assignment3;

import java.util.TreeSet;

public class Employee {
	private int Empid;
	private String Name;
	private float salary;
	
	public Employee(int Empid, String name, float salary) {
		super();
		this.Empid = Empid;
		this.Name = Name;
		this.salary = salary;
		
	}
	
	
	
	public int getEmpid() {
		return Empid;
	}



	public void setEmpid(int empid) {
		Empid = empid;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public float getSalary() {
		return salary;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	public String toString() {
		return "Employee [EmpID = " +Empid+ ", Name = " +Name+ ", Salary = " +salary+ " ]"; 
	}
	

}
