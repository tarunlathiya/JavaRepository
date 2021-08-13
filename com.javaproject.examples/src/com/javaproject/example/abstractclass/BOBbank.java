package com.javaproject.example.abstractclass;

public class BOBbank extends AbstractBank
{
	private final double rate = 7.5;

	@Override
	public double getRateInterest()
	{
		return rate;
	}
}
