package com.javaproject.example.bank;

/*
 * The TestBank program implements an application which returns rate of interest of different banks */

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
