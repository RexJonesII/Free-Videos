package com.selenium4beginners.java.keywordsthrowandthrows;

public class ClassTwo {

	public static void main(String[] args) {
		
		ClassOne obj = new ClassOne();
	
		try {
			System.out.println(obj.divideNumbers(100, 0));
		} catch (Exception e) {
			System.out.println("Class 2: " + e.getMessage());
		}
	}	
}