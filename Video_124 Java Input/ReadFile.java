package com.selenium4beginners.java.inputoutput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		String pathDirectory = System.getProperty("user.dir");
		
		File file = new File("Read File Test.txt");
		
		// Write To A File
		PrintWriter write = new PrintWriter(file);
		write.println("Joe Doe");
		write.println("Software Tester");
		write.println("10 Years Experience");
		write.println("Jane Doe");
		write.println("Automation Tester");
		write.println("12 Years Experience");
		write.close();
		
		// Read From A File
		FileReader readFile = new FileReader(pathDirectory + "/Read File Test.txt");
		Scanner scan = new Scanner(readFile);		
		
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());			
		}
	}
}