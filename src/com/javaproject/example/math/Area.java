package com.javaproject.example.math;

import java.util.Scanner;

/* An program for finding area of circle */
public class Area
{
	double  radius,area;
	final double PI = 3.14;
	
	void findArea(double num) {
		radius = num;
		area = PI * radius * radius;
		System.out.println("Area of circle is: "+area);
	}
	
	public static void main(String[] args)
	{
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		num = sc.nextDouble();
		Area a = new Area();
		
		a.findArea(num);
	}
}
