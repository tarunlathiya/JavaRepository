package com.junitproject.examples.junit5testcases;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.junitproject.example.mainlogic.Calculation;

public class TestCase7
{
	@BeforeAll
	@DisplayName(" Started All Test Cases ")
	static void setUpinit()
	{
		System.out.println(" Starting all test cases ");
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	@BeforeEach
	@DisplayName(" Test Case Started ")
	void setUp()
	{
		System.out.println(" Starting your first test case ");
	}

	@Test
	@DisplayName(" The Task of finding maximum number should work ")
	void testFindMax()
	{
		assertEquals(96, Calculation.findMax(new int[] { 46, 96, 68, 47, 56, 48, 45, 55, 51, 84, 5 }));
	}

	@AfterEach
	@DisplayName(" Your first test case is completed ")
	void teadDown()
	{
		System.out.println(" Completed first case");
	}

	@AfterAll
	@DisplayName("Completed All Test Cases ")
	static void tearDownAll()
	{
		System.out.println(" Completed All Test Cases ");
	}
}
