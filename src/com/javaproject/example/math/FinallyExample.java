package com.javaproject.example.math;

public class FinallyExample
{
	public static void main(String[] args)
	{
		try
		{
			int a = 0, b=10, c;

			c = b / a;
			System.out.println(c);
		}
		catch (ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("The above exception is for logical error");
		}
	}
}
