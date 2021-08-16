package com.javaproject.example.math;

public class SquareAndCube
{
	static int x = 15;
	static int y = 20;

	static int square(int x)
	{ // Here, x is a local variable.
		int a = x * x;
		return a;
	}

	static int cube(int y)
	{ // Here, y is a local variable.
		int b = y * y * y;
		return b;
	}

	public static void main(String[] args)
	{
		int sq = square(5);
		int cb = cube(10);
		System.out.println("Squre is: "+sq);
		System.out.println("Cube is: "+cb);
	}
}
