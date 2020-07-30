package com.selenium4beginners.java.oop.abstraction.interfaces;

public interface EmailServiceProvider {

	public void createEmailMessage ();
	public void openJunkSpamFolder ();
	public void closeEmailProvider ();
	
	public default void saveDraftFolder () {
		System.out.println("Save Draft \n");
	}
	
	public static void sentEmailFolder () {
		System.out.println("Sent Email");
	}
}
