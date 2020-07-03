package com.selenium4beginners.java.oop.encapsulation;

public class TestEmployeeObject {

	public static void main(String[] args) {
		Employee jane = new Employee();
		
		jane.setSalary(100000);
		System.out.println("Jane's Salary = " + jane.getSalary());
		
		jane.setBonus(10000);
		System.out.println("Jane's Bonus = " + jane.getBonus());
		
		jane.calculateTotalPay();
	}
}