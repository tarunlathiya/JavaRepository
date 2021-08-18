package com.javaproject.example.testcase;


import java.util.Arrays;
/*
 *   Parameterized test using constructor /
 */
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;

import com.javaproject.example.logic.Calculator;

@RunWith(Parameterized.class)
public class TestCase6
{
	private int m1;
	private int m2;
	
	
	public TestCase6(int p1, int p2)
	{
		m1 = p1;
		m2 = p2;
	}
	
	//Creating the data for testing
	@Parameters
	public static Collection<Object[]> testData()
	{
		Object[][] data = new Object[][] { {2,3}, {4,6}, {121,6} };
		return Arrays.asList(data);
	}
	
	@Test
	public void testMultiply()
	{
		Calculator cal = new Calculator();
		assertEquals("Result", m1*m2, cal.multiply(m1, m2));
	}
}
