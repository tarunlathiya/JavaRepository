package com.javaproject.example.testcase;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestCase4Runner
{
	public static void main(String[] args)
	{
		Result result =  JUnitCore.runClasses(TestCase4.class);
		
		for(Failure failure: result.getFailures())
		{
			System.out.println(failure.toString());
		}
		
		System.out.println("Result = "+ result.wasSuccessful());
	}
}
