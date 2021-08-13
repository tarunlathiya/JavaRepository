package com.javaproject.example.abstractclass;

public class SBIBank extends AbstractBank
{
	private final int rate = 7;

	@Override
	public double getRateInterest()
	{
		return rate;
	}

}
