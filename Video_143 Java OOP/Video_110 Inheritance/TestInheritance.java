package com.selenium4beginners.java.oop.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Person person = new Person ();
		person.getName();
		
		Student student = new Student ();
		student.getName();
		student.getStudentID();
		student.getClassName();
	}		
}