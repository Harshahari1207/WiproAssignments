package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	
	static Student data[] = new Student[10];
	
	static {
		for(int i=0; i<data.length; i++)
			data[i] = new Student();
		data[0] = new Student("Amar", new int[] {45,65,25}, null);
		data[1] = new Student(null, new int[] {15,25,55}, null);
		data[2] = null;
		data[3] = new Student("Mouna", new int[] {65,75,95}, null);
		data[4] = null;
		data[5] = new Student("Rajani", new int[] {55,65,85}, null);
		data[6] = new Student("Sunil", new int[] {25,35,45}, null);
		data[7] = new Student("Anil", new int[] {90,75,65}, null);
		data[8] = new Student(null, new int[] {25,75,55}, null);
		data[9] = new Student("Ronaldo", null, null);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StudentReport studentReport = new StudentReport();
		StudentService studentService = new StudentService();
		
		System.out.println("Grade Calculator");
		String x = null;
		
		for(int i=0 ; i < data.length; i++) {
			try {
				x = studentReport.validate(data[i]);
				
			}catch(NullNameException e) {
				x = "NullNameException occurred";
			}catch(NullMarksException e) {
				x = "NullMarksArrayException occurred";
			}catch(NullStudentObjectException e) {
				x = "NullStudentObjectException occurred";
			}
			
			System.out.println("GRADE = " +x);
		}
		System.out.println("Number of Objects with Marks array as null = " +studentService.finNumberOfNullMarksArray(data));
		System.out.println("Number of Objects with Name as null = " +studentService.findNumberOfNullNames(data));
		System.out.println("Number of Objects that are entierly null = " +studentService.findNumberOfNullObjects(data));
		
		System.out.println("TC7: Number of Objects with Name as null = " +studentService.findNumberOfNullNames(data));
		System.out.println("TC8: Number of Objects that are entierly null = " +studentService.findNumberOfNullObjects(data));
		System.out.println("TC9: Number of object e=with Marks array as null = " +studentService.finNumberOfNullMarksArray(data));

	}

}
