package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@Column(length = 5)
	private int studentid;

	@Column(length = 20)
	private String studentname;

	@Column(length = 20)
	private String studentdept;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentdept() {
		return studentdept;
	}

	public void setStudentdept(String studentdept) {
		this.studentdept = studentdept;
	}
	
	
	

}
