package com.selenium4beginners.java.oop.abstraction.interfaces;

public class TestEmailServiceProvider {

	public static void main(String[] args) {
		EmailServiceProvider outlook = new Outlook ();
		outlook.openJunkSpamFolder();
		outlook.createEmailMessage();
		outlook.closeEmailProvider();
		outlook.saveDraftFolder();
		
		EmailServiceProvider gmail = new GMail ();
		gmail.openJunkSpamFolder();
		gmail.createEmailMessage();
		gmail.closeEmailProvider();
		gmail.saveDraftFolder();
	}
}