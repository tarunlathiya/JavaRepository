package com.javaproject.example.testcase;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

import com.javaproject.example.logic.CubeExample;

import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.assertEquals;

public class TestCase2
{
	@Before
	public void setUpBefore() throws Exception
	{
		System.out.println("Before every test case");
	}
	
	@Test
	public void testCube()
	{
		System.out.println("finding cube of given number");

		assertEquals(8, CubeExample.findCube(2));

		assertEquals(27, CubeExample.findCube(3));
	}
	
	@After
	public void setUpAfter() throws Exception
	{
		System.out.println("After every test case ");
	}
	
	
}
