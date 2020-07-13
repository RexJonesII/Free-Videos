package com.selenium4beginners.java.oop.polymorphism.overload;

public class Overload {

	public static void add (int num1, int num2) {
		System.out.println("Add 2 int Numbers = " + (num1 + num2));
	}
	
	public static void add (int num1, double num2) {
		System.out.println("Add int & double Numbers = " + (num1 + num2));
	}
	
	public static void add (double num1, int num2) {
		System.out.println("Add double & int Numbers = " +
										(num1 + num2));
	}
	
	public static void add (double num1, int num2, int num3) {
		System.out.println("Add double & 2 int Numbers = " +
										(num1 + num2 + num3));
	}
	
	public static int add (int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("Add 3 int Numbers = " + sum);
		return sum;
	}

}















