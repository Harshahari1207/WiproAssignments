package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTask;

public class TestSort {
	DailyTask test1 = new DailyTask();
	int[] a = {5,4,3,2,1};
	int[] expected = {1,2,3,4,5};
	@Test
	public void test1() {
		
	
		assertArrayEquals(expected, test1.sortValues(a));
		}
	}

