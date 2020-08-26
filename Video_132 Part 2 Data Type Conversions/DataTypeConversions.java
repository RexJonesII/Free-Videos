package com.selenium4beginners.java;

public class DataTypeConversions {

	public static void main(String[] args) {
		// Widening Conversion (byte, short, int, long, float, double)
		
		// int destination = 34.56; Cannot Convert From double to int
		int source1 = 34;
		double destination1 = source1;
		System.out.println("Original (int) Value: " + source1);
		System.out.println("Widening Conversion (int to double): " + destination1);
		System.out.println("-------");
		
		// Narrowing Conversion
		double source2 = 34.999;
		int destination2 = (int) source2;
		System.out.println("Original (double) Value: " + source2);
		System.out.println("Narrowing Conversion (double to int): " + destination2);	
		System.out.println("-------");
		
		Double source3 = 12.12;
		int destination3 = source3.intValue();
		System.out.println("Original (Double) Object Value: " + source3);
		System.out.println("Convert Object To (int) Variable: " + destination3);
		System.out.println("-------");
		
		String source = "100";
		Double destination4 = Double.parseDouble(source);
		Integer destination5 = Integer.parseInt(source);
		System.out.println("Original (String) Value: " + source);
		System.out.println("Convert To (Double): " + destination4);
		System.out.println("Convert To (Integer): " + destination5);
	}
}