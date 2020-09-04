package com.selenium4beginners.java.keywordsthrowandthrows;

public class DemoThrow {

	public void divideNumbers (int num1, int num2) {
	
		if (num2 > 0) {
			int dividend = num1 / num2;
			System.out.println("What Is " + num1 + " Divided By " + num2 + "? " + dividend);
		}
		else
		{
			throw new ArithmeticException("Cannot Divide By Zero Or Less Than Zero");
		}
	}
		
	public static void main(String[] args) {
		DemoThrow dt = new DemoThrow ();
		dt.divideNumbers(100, 0);
	}
}