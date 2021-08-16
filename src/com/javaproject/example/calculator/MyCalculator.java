package com.javaproject.example.calculator;

import java.util.Scanner;

/* The calculator program  implements application which returns the sum of divisors of given number */

public class MyCalculator implements Arithmetic
{
	@Override
	public void divisorSum(int n)
	{
		int i, sum = 0;
		for (i = 1; i <= n; i++)
		{

			if (n % i == 0)
			{
				sum = sum + i;

			}
		}
		System.out.println("Sum of divisors of " + n + " is " + sum);
	}

	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		n = sc.nextInt();

		MyCalculator cal = new MyCalculator();
		cal.divisorSum(n);
	}
}
