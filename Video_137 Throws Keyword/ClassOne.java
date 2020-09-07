package com.selenium4beginners.java.keywordsthrowandthrows;

public class ClassOne {
	
	public int divideNumbers (int num1, int num2) throws Exception {
		
		int dividend = 0;		
	
		try {
			dividend = num1 / num2;
		}
		catch (Exception e) {
			System.out.println("Class 1: Throwing Back An Exception To Class 2");
			throw new Exception("Can You Check Your Numbers?");
		}		
	
		return dividend;
	}
}