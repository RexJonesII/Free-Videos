package com.selenium4beginners.java.oop.abstraction.interfaces;

public class ComboStore implements FoodStore, ClothesStore, MedicineStore{

	@Override
	public void sellPrescription() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellVitamins() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellShoes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellShirts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellFruits() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellVegetables() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payCashier() {
		// TODO Auto-generated method stub
		ClothesStore.super.payCashier();
	}

	@Override
	public void createEmailMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openJunkSpamFolder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeEmailProvider() {
		// TODO Auto-generated method stub
		
	}
}