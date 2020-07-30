package com.selenium4beginners.java.oop.abstraction.interfaces;

public class Outlook implements EmailServiceProvider {

	public void newEmailMessage () {
		System.out.println("Outlook - New Email");
	}

	public void openJunkFolder () {
		System.out.println("Outlook - Open Junk Folder");
	}

	public void closeOutlook () {
		System.out.println("Outlook - Close Email Provider");
	}

	@Override
	public void createEmailMessage() {
		// TODO Auto-generated method stub
		System.out.println("Outlook - New Email");
	}

	@Override
	public void openJunkSpamFolder() {
		// TODO Auto-generated method stub
		System.out.println("Outlook - Open Junk Folder");
	}

	@Override
	public void closeEmailProvider() {
		// TODO Auto-generated method stub
		System.out.println("Outlook - Close Email Provider");
	}
}