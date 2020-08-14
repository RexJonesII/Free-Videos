package com.selenium4beginners.java.constructors;

public class TestParameterizedConstructors {

	public static void main(String[] args) {

		Students student2 = new Students(34, "James");
		student2.displayStudentInfo();
		
		Students student3 = new Students(56);
		student3.displayStudentInfo();
	}
}