package com.selenium4beginners.java.inputoutput;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) throws IOException  {

		String pathDirectory = System.getProperty("user.dir");
		
		// Write To A File
		PrintWriter write = new PrintWriter("Write File Test.txt");
		write.println("Joe Doe");
		write.println("Software Tester");
		write.println("10 Years Experience");
		write.close();
	}
}