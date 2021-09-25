package com.junitproject.examples.junit5testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.junitproject.example.mainlogic.Calculator;

public class TestCase8
{
	
	private Calculator cal;
	private static int[][] testData()
	{
		return new int[][] {{ 1 , 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 }};
	}
	
	@ParameterizedTest
	@MethodSource( value = "testData")
	void testWithParametersMultiply(int[] data)
	{
		cal = new Calculator();
		int m1 = data[0];
		int m2 = data[1];
		int expected = data[2];
		
		assertEquals(expected, cal.multiply(m1, m2));
	}
}
