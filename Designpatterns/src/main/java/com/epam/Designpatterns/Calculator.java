package com.epam.Designpatterns;

public class Calculator
{
	private static Calculator cal ;
	private Calculator() {};
	public static Calculator getInstance()
	{
		if(cal==null)
			cal = new Calculator();
		return cal;
	}
	public int addition(int a,int b)
	{
		return a+b;
	}
	public  int subtraction(int a,int b)
	{
		return a-b;
	}
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	public int division(int a,int b)
	{
		return a/b;
	}
}