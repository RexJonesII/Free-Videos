package com.selenium4beginners.java.oop.polymorphism.overload;

public class TestOverload {

	public static void main(String[] args) {

		Overload.add(10.0, 5);
		Overload.add(5, 15.0);
		Overload.add(5, 5);
		Overload.add(20.0, 20, 10);
		Overload.add(50, 50, 50);
	}
}