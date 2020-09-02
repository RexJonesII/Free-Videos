package com.selenium4beginners.java;

public class StringDemo {

	public static void main(String[] args) {
		String username = new String ("SoftwareEngineer34");
		String name = "Rex Jones II";
		
		System.out.println("Username: " + username + "\n" + "Name: " + name);
		System.out.println("Name (Lowercase): " + name.toLowerCase());
		System.out.println("Name (Uppercase): " + name.toUpperCase());
		System.out.println("Name (Length): " + name.length());
		System.out.println("Name (substring): " + name.substring(0, 3));
		System.out.println("Name (First Character): " + name.charAt(0));
		System.out.println("Name (Contains Jones): " + name.contains("Jones"));
		System.out.println("Name (Equals REX JONES II): " + name.equals("REX JONES II"));
		
		String nickName = "James";
		System.out.println(String.format("My Nickname Is %s", nickName));
	}
}