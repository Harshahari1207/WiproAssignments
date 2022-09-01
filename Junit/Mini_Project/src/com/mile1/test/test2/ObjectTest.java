package com.mile1.test.test2;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

class ObjectTest {

	

	@Test
	void testObject() throws NullStudentObjectException, NullNameException, NullMarksException {
		Student stu = null;
		NullStudentObjectException ne = new NullStudentObjectException();
		assertEquals(ne, StudentReport.validate(stu));
	}


}
