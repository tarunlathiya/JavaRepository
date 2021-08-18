package com.javaproject.example.logic;

public class Calculation
{
	// find the maximum number in giver array
	public static int findMax(int arr[])
	{

		int max = arr[0];

		for (int i = 0; i < arr.length; i++)
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}
}
