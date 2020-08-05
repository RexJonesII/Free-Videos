package com.selenium4beginners.java.oop.abstraction.interfaces;

public interface MedicineStore {

	public void sellPrescription ();
	public void sellVitamins ();	
	
	default void payCashier () {
		System.out.println("Pay Pharmacy Technician");
	}
}