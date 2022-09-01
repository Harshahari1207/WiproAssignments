package com.mile1.test.test2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;

class MarksTest {

	@Test
	void test() throws NullStudentObjectException, NullNameException, NullMarksException {
		Student stu = new Student("Ronaldo", null, null);
		NullMarksException ne= new NullMarksException();
		assertEquals(ne, StudentReport.validate(stu));
	}

}
