package com.selenium4beginners.java.oop.abstraction.abstractclasses;

public class Square extends Shape {

	private int side = 10;
	
	@Override
	public int calculatePerimeter() {
		
		int perimeter = 4 * side;
		System.out.println("Square Perimeter = " + perimeter);
		return perimeter;
	}
}