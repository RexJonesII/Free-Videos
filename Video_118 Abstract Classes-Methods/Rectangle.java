package com.selenium4beginners.java.oop.abstraction.abstractclasses;

public class Rectangle extends Shape {

	private int length = 5;
	private int width = 10;
	
	@Override
	public int calculatePerimeter () {
		int perimeter = (2 * length) + (2 * width);
		System.out.println("Rectangle Perimeter = " + perimeter);
		return perimeter;
	}	
}