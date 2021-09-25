package com.junitproject.example.junit4testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.junitproject.example.mainlogic.Calculation;

public class TestCase1
{
	@Test
	public void testfindMax()
	{
		System.out.println("Finding max number in array");
		assertEquals(54, Calculation.findMax(new int[] { 1, 5, 2, 54, 6, 7, 9, 7 }));

		assertEquals(35, Calculation.findMax(new int[] { 5, 3, 7, 4, 35, 7, 7, 4, 7, 4 }));

		assertEquals(8, Calculation.findMax(new int[] { 1, 5, 4, 8, 6, 3, 7 }));

		assertEquals(56, Calculation.findMax(new int[] { 42, 56, 8, 9, 7, 6, 5 }));

		assertEquals(-1, Calculation.findMax(new int[] { -67, -78, -99, -45, -1 }));

	}
}
