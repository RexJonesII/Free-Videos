package com.selenium4beginners.java.keywordthis;

public class Student {
	// Keyword 'this' Refers To A Field Name aka Instance Variable
	int studentID;
	String studentName;	
	
	public Student (int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}	
	
	public Student (String studName, int studID) {
		this.studentName = studName;
		studentID = studID;
	}
	
	public void displayStudentInfo () {
		System.out.println("Student ID = " + this.studentID + "\n" +
										"Student Name = " + this.studentName + "\n");
	}
}