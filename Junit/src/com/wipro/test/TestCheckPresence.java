package com.wipro.test;

import static org.junit.Assert.*;


import org.junit.Test;

import com.wipro.task.DailyTask;

public class TestCheckPresence {
	DailyTask test2 = new DailyTask();
	@Test
	public void truetest2() {
		
		
		assertTrue(test2.checkPresence("Harsha", "Hari"));
	}
	@Test
	public void falsetest2() {
		
		assertFalse(test2.checkPresence("Harsha", "Hari"));
		
	}

}
