package com.selenium4beginners.java.oop.abstraction.abstractclasses;

public class ShapeTest {

	public static void main(String[] args) {
		//Shape shape = new Shape (); Abstract Classes Cannot Create An Object
		Shape shape1 = new Square ();
		Shape shape2 = new Rectangle ();
		
		Square square = new Square ();
		square.printShapeMessage();
		square.calculatePerimeter();
		
		Rectangle rectangle = new Rectangle ();
		rectangle.calculatePerimeter();		
	}
}