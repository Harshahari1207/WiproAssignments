package com.mile1.test.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;

class AgradeTest {

	@Test
	void testA() throws NullStudentObjectException, NullNameException, NullMarksException {
		Student stu = new Student("Anil", new int[] {90,90,80}, null);
		assertEquals("A", StudentReport.validate(stu));
		
	}

}
