package com.javaproject.example.bank;

public class SBIbank extends AbstractBank
{
	private final double number = 9;
	
	@Override
	void getRateOfInterest()
	{
		System.out.println("Rate of interest of Axis bank: " + number + "%");
	}
}