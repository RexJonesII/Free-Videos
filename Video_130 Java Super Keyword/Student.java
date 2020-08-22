package com.selenium4beginners.java.keywordsuper;

public class Student extends Person {

	private String name;
	private int id;
	
	public Student (String name, int id) {
		super(id);
		this.name=name;		
	}
	
	public String displayStudentInformation () {
		return "Personal ID: " + super.getID() +
					"Student ID: " +getID();
	}
	
	@Override
	public int getID () {
		return this.id;
	}
	
	@Override
	public void setID (int id) {
		this.id = id;
	}
}