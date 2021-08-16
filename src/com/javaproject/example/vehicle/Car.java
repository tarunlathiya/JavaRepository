package com.javaproject.example.vehicle;

public class Car implements Interval, SpeedRate
{
	int	avgspeed, totaldistance;
	int	speed	= 120;

	@Override
	public void totalDistance()
	{

		totaldistance = distance * speed;
		System.out.println("Total distance covered by Car is: " + totaldistance + " kilometers");
	}

	@Override
	public void avgSpeed()
	{
		avgspeed = totaldistance / speed;
		System.out.println("Average speed maintained by Car is: " + avgspeed + " kmph");
	}

	public static void main(String[] args)
	{
		Car b = new Car();

		b.totalDistance();
		b.avgSpeed();

	}
}
