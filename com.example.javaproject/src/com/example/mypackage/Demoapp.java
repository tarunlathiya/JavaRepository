package com.example.mypackage;

import java.util.Scanner;

public class Demoapp
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String s = sc.next();
		System.out.println("Hello " + s);
	}
}
