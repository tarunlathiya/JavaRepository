package com.javaproject.example.abstractclass;

public class ICICIBank extends AbstractBank
{
	private final int rate = 9;

	@Override
	public double getRateInterest()
	{
		return rate;
	}
}
