package com.selenium4beginners.java.oop.inheritance;

public class Student extends Person {
	private int studentID;
	private String className;
	
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