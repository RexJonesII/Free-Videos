package com.selenium4beginners.java.Control_Statements;

public class EnhancedForLoop 
{
	public static void main(String[] args) 
	{
		int number[] = {1, 2, 3, 4, 5};
		int total = 0;
		
		for (int num : number)
		{
			System.out.println("Number: " + num);
			total += num;
		}
		
		System.out.println("--------------\n Total: " + total);
	}
}