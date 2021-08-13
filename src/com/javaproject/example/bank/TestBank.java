package com.javaproject.example.bank;

public class TestBank
{

	public static void main(String[] args)
	{
		AbstractBank a;
		a = new SBIbank();

		a = new BOBbank();

		a = new Axisbank();

	}

}
