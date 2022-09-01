package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	
	
	public int finNumberOfNullMarksArray(Student[] s) {
		int c = 0;
		for(int i=0; i<s.length; i++) {
			try {
				s[i].getMarks();
			}catch(Exception e) {
				c++;
			}
		}
		
		return c;
	}
	
	public int findNumberOfNullNames(Student[] s) {
		int c = 0;
		for(int i=0; i<s.length; i++) {
			try {
				s[i].getName();
			}catch(Exception e) {
				c++;
			}
			
		}
		return c;
	}
	
	public int findNumberOfNullObjects(Student[] s) {
		int c = 0;
		for(int i=0; i<s.length; i++) {
			if(s[i] == null)
				c++;
			
		}
		return c;
	}



}
