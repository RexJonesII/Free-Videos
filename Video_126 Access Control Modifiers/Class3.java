package com.selenium4beginners.java.demopackage2;

import com.selenium4beginners.java.demopackage1.Class1;

public class Class3 extends Class1 {

	public static void main(String[] args) {
		// public, protected "Different Package - Sub Class"
		Class3 obj = new Class3 ();
		System.out.println("(Public) Age = " + obj.age);
		System.out.println("(Protected) Birthday = " + obj.birthday);	}
}