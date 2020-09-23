package com.selenium4beginners.java.oop.abstraction.interfaces;

public interface ClothesStore {

	public void sellShoes ();
	public void sellShirts ();
	
	default void payCashier () {
		System.out.println("Pay Cashier");
	}
}