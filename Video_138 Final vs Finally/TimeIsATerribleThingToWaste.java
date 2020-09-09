package com.selenium4beginners.java.keywordfinal;

//public final class TimeIsATerribleThingToWaste {
	public class TimeIsATerribleThingToWaste {
		
	// final Variables Cannot Be Changed "Constant Variables"
	// final Methods Cannot Be Overridden "Prevent Method Overriding" 
	// final Classes Cannot Be Sub Classed "Prevent Inheritance" 
	
	final int HOURS = 24;
	
	//public final void displayDailyHours () {
		public void displayDailyHours () {
		// HOURS = 24;
		System.out.println("Total Hours In A Day = " + HOURS);
	}
}