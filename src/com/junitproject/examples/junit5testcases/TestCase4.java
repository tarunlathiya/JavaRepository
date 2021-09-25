package com.junitproject.examples.junit5testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.junitproject.example.mainlogic.Calculator;

public class TestCase4
{
	Calculator cal;

	@BeforeEach
	void setUp()
	{
		cal = new Calculator();
	}

	@Test
	@DisplayName(" Multiplication should work")
	void testMultiply()
	{
		assertEquals(48, cal.multiply(6, 8), "Regular multiplication should work");
	}

	@RepeatedTest(5)
	@DisplayName("Ensure correct handing with zero")
	void testMultipyWithZero()
	{
//		assumeFalse(System.getProperty("os.name").contains("Ubuntu"));
		
		assertEquals(0, cal.multiply(0, 5), "trying to multiply with zero ");
		assertEquals(0, cal.multiply(10, 0), "trying to multiply with zero");
	}
}
