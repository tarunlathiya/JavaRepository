package com.javaproject.example.testcase;
/*
 * parameterized test case 
 */

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;

import com.javaproject.example.logic.Calculator;


@RunWith(Parameterized.class)
public class TestCase5
{
	//fields used together with @Parameter must be public
	@Parameter(0)
	public int m1;
	
	@Parameter(1)
	public int m2;
	
	@Parameter(2)
	public int result;
	
	//creates the test data
	@Parameters
	public static Collection<Object[]> data()
	{
		Object[][] data = new Object[][] { {1,2,2}, {5,3,15}, {121,4,484} }; 
		return Arrays.asList(data);
	}
	
	@Test
	public void testMultiply()
	{
		Calculator cal = new Calculator();
		assertEquals("Result", result, cal.multiply(m1, m2));
	}
}
