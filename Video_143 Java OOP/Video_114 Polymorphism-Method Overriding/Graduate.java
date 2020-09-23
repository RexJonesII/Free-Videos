package com.selenium4beginners.java.oop.polymorphism.override;

public class Graduate extends Student{

	private int minimumGrade = 75;
	
	@Override
	public int calculateGPA() {
		int sum = 0;
		
		for (int grade : getGrades()) {
			if (grade >= minimumGrade) {
				sum += grade;
			}				
		}
		return sum / getGrades().length;
	}
}