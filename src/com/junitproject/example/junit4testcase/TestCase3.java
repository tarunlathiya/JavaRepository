package com.junitproject.example.junit4testcase;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junitproject.example.mainlogic.WordExample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;

public class TestCase3
{
	
	private WordExample we;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println(" Starting all Test Cases");
	}

	@Before
	public void setUpBefore() throws Exception
	{
		we = new WordExample();
	}

	@Test
	public void testRev()
	{
		System.out.println(" Reverse the word ");
		assertEquals(" nahk si eman ym", we.revWord("my name is khan"));
	}

	@After
	public void setUpAfter() throws Exception
	{
		System.out.println("Test is completed ");
	}
	
	@AfterClass
	public static void setUpAfterClass() throws Exception
	{
		System.out.println("Completed all test cases ");
	}
}
