package com.wipro.Introduction_to_hibernate.bean;

import java.sql.Date;

import javax.persistence.Entity;


@Entity
public class Emp {
	
	private int no;
	private String name;
	private String job;
	private int manager;
	private Date hireDate;
	private double salary;
	private double commission;
	private int deptNo;
	public Emp(int no, String name, String job, int manager, Date hireDate, double salary, double commission,
			int deptNo) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.manager = manager;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
	}
	public Emp() {
		super();
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public String toString() {
		return "Emp [no=" + no + ", name=" + name + ", job=" + job + ", manager=" + manager + ", hireDate=" + hireDate
				+ ", salary=" + salary + ", commission=" + commission + ", deptNo=" + deptNo + "]";
	}
	
	

}
