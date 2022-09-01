package com.wipro.test;


import static org.junit.Assert.*;
import org.junit.Test;

import com.wipro.task.DailyTask;

public class TestStringConcat {
	DailyTask test = new DailyTask();
	@Test
	public void test() {
		
		
		assertEquals("Harsha Hari", test.doStringConcat("Harsha", "Hari"));
	}

}
