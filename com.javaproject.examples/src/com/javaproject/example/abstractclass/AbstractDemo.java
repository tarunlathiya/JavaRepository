package com.javaproject.example.abstractclass;

public class AbstractDemo
{
	public static void main(String[] args)
	{
		AbstractBank a = new SBIBank();
		System.out.println("Interest Of SBI Bank: " + a.getRateInterest() + "%");

		System.out.println("===========================================");

		AbstractBank b = new ICICIBank();
		System.out.println("Interest Of ICICI Bank: " + b.getRateInterest() + "%");

		System.out.println("===========================================");

		AbstractBank c = new BOBbank();
		System.out.println("Interest Of ICICI Bank: " + c.getRateInterest() + "%");
	}
}
