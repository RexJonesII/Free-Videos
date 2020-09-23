package com.selenium4beginners.java.oop.polymorphism.override;

public class TestOverride {

	public static void main(String[] args) {

		int[] grades = {95, 100, 95, 74, 75, 89, 90};
		
		Student jane = new Graduate ();
		jane.setGrades(grades);
		
		Student john = new UnderGraduate ();
		john.setGrades(grades);
		
		System.out.println("Jane's Graduate GPA: " + jane.calculateGPA());
		System.out.println("John's UnderGraduate GPA: " + john.calculateGPA());
	}
}