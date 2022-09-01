package com.mile1.test.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;

class FgradeTest {

	@Test
	void testF() throws NullStudentObjectException, NullNameException, NullMarksException {
		Student stu = new Student("Hari", new int[] {26,35,24}, null);
		assertEquals("F", StudentReport.validate(stu));
	}

}
