package com.selenium4beginners.java.keywordthis;

public class TestThisKeyword {

	public static void main(String[] args) {
		Student student1 = new Student(1234, "Mary");
		student1.displayStudentInfo();

		Student student2 = new Student("James", 5678);
		student2.displayStudentInfo();
	}
}