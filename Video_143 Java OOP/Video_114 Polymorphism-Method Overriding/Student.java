package com.selenium4beginners.java.oop.polymorphism.override;

import com.selenium4beginners.java.oop.inheritance.Person;

public class Student extends Person {
	private int studentID;
	private String className;
	private int[] grades;
	
	public int calculateGPA () {
		int sum = 0;
		
		for (int grade : grades) {
			sum = sum+grade;
		}
		return sum / grades.length;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}	
}