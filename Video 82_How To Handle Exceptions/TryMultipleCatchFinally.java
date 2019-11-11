package com.selenium4beginners.java.exceptionhandle;

public class TryMultipleCatchFinally 
{
	public static void main(String[] args) 
	{
		try 
		{
			int value = 34/2;
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
		finally
		{
			System.out.println("Close The Open File");
		}
	}
}

































