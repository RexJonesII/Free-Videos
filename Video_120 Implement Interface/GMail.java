package com.selenium4beginners.java.oop.abstraction.interfaces;

public class GMail implements EmailServiceProvider {

	public void composeEmailMessage () {
		System.out.println("GMail - Compose Email");
	}

	public void openSpamFolder () {
		System.out.println("GMail - Open Spam Folder");
	}

	public void closeGmail () {
		System.out.println("GMail - Close Email Provider");
	}

	@Override
	public void createEmailMessage() {
		// TODO Auto-generated method stub
		System.out.println("GMail - Compose Email");
	}

	@Override
	public void openJunkSpamFolder() {
		// TODO Auto-generated method stub
		System.out.println("GMail - Open Spam Folder");
	}

	@Override
	public void closeEmailProvider() {
		// TODO Auto-generated method stub
		System.out.println("GMail - Close Email Provider");
	}
}