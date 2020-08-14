package com.selenium4beginners.java.constructors;

public class Students {
	int studentID;
	String studentName;
	
	// Constructors Initialize The Object When Creating The Object
	// Constructors Have The Same Name As The Class Name 'i.e., Student'
	// Constructors Have No Return Type 
	
	public Students (int id, String name) {
		studentID = id;
		studentName = name;
		System.out.println("Student ID & Name");
	}
	
	Students (int id) {
		studentID = id;
		System.out.println("Student ID");
	}
	
	public void displayStudentInfo () {
		System.out.println("Student ID = " + studentID + "\n" +
										"Student Name = " + studentName + "\n");
	}
}