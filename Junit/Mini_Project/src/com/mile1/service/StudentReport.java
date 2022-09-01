package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {
	
	public static String findGrades(Student studentObject) {
		int[] marks = studentObject.getMarks();
		int markSum = 0;
		
		for(int i=0; i<marks.length; i++) {
			if(marks[i] < 35) {
				return "F";
				}else {
					markSum += marks[i];
				}
		}
		if (markSum <= 150) return "D";
		else if (markSum > 150 && markSum <= 200) return "C";
		else if (markSum > 200 && markSum <= 250) return "B";
		else if (markSum > 250 && markSum <= 300) return "A";
		
		return "D";
	}
	
	public static String validate(Student studentObject) throws NullStudentObjectException, NullNameException, NullMarksException{
		if(studentObject == null) {
			throw new NullStudentObjectException();
		}else {
			if (studentObject.getName() == null) throw new NullNameException();
			if (studentObject.getMarks() == null) throw new NullMarksException();
			
			return findGrades(studentObject);
		}
	}

}
