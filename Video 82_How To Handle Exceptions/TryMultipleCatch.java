package com.selenium4beginners.java.exceptionhandle;

public class TryMultipleCatch
{
	public static void main(String[] args) 
	{
		try 
		{
			int value = 34/0;
			System.out.println("Value " + value);
		} 
		catch (ArithmeticException exc)
		{
			System.out.println("Can't Divide By Zero");
		}
		catch (Exception e)
		{
			System.out.println("There Is A Problem");
		}
	}
}

































