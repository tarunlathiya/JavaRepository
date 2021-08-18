package com.javaproject.math;

public class TestStatic
{
	static int x = 20;	
	int	y = 30;

	void display()
	{
		System.out.println(x); 
		System.out.println(y);
	}

	static void show()
	{
		System.out.println(x);

	}

	public static void main(String[] args)
	{
		TestStatic st = new TestStatic();
		st.display();
		show();
	}
}
