package com.selenium4beginners.java.constructors;

public class Student {
	int studentID;
	String studentName;
	
	// Constructors Initialize The Object When Creating The Object
	// Constructors Have The Same Name As The Class Name 'i.e., Student'
	// Constructors Have No Return Type 
	
	public Student () {
		studentID = 12;
		studentName = "Mary";
		System.out.println("Execute Constructor");
	}
	
	public void displayStudentInfo () {
		System.out.println("Student ID = " + studentID + "\n" +
										"Student Name = " + studentName + "\n");
	}
}