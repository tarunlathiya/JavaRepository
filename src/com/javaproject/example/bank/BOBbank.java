package com.javaproject.example.bank;

public class BOBbank extends AbstractBank
{
	private final double number = 6.5;
	
	@Override
	void getRateOfInterest()
	{
		System.out.println("Rate of interest of BOB bank: "+number+"%");
	}
}