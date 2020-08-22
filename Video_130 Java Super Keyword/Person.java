package com.selenium4beginners.java.keywordsuper;

public class Person {

	private int id;
	
	public Person (int id) {
		this.id=id;
	}
	
	public int getID () {
		return this.id;
	}
	
	public void setID (int id) {
		this.id = id;
	}	
	
	public void displayID () {
		System.out.println("ID = " + this.id);
	}
}