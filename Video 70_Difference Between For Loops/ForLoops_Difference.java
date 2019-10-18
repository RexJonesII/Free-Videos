package com.selenium4beginners.java.Control_Statements;

public class ForLoops_Difference 
{
	public static void main(String[] args) 	{
		int value[] = {10, 20, 30, 40, 50};
		int sum = 0;
		
		// Traditional For Loop
		for (int i = 0; i < 5; i++) 	
		{			
			sum += value[i];
		}
		
		// Enhanced For Loop
		for (int x : value) 
		{
			sum += x;
		}		
	}	
}


















