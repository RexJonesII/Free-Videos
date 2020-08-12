package com.selenium4beginners.java.demopackage1;

public class Class2 {

	public static void main(String[] args) {
		// public, protected, default "Same Package"
		Class1 obj = new Class1 ();
		System.out.println("(Public) Age = " + obj.age);
		System.out.println("(Protected) Birthday = " + obj.birthday);
		System.out.println("(Default) Experience = " + obj.experience);
	}
}