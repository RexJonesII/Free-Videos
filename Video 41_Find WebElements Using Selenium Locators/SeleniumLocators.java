package com.selenium4beginners.selenium_testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium4beginners.utility.Highlighter;

public class SeleniumLocators 
{
	WebDriver driver;
	
	@BeforeClass
	public void setUp ()
	{
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void demoSeleniumLocators ()
	{		
		// Find WebElement By id
		WebElement username = driver.findElement(By.id("txtUsername"));
		Highlighter.highlightElement(driver, username);
		
		// Find WebElement By name
		WebElement password = driver.findElement(By.name("txtPassword"));
		Highlighter.highlightElement(driver, password);
		
		// Find WebElement By className
		WebElement buttonLogIn = driver.findElement(By.className("button"));
		Highlighter.highlightElement(driver, buttonLogIn);
			
		//Find WebElement By linkText
		WebElement linkForgotPassword = driver.findElement(By.linkText("Forgot your password?"));
		Highlighter.highlightElement(driver, linkForgotPassword);
		
		// Scroll Down The Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1250)");
		
		// Find WebElement By partialLinkText
		WebElement linkOrangeHRM = driver.findElement(By.partialLinkText("OrangeHRM"));
		Highlighter.highlightElement(driver, linkOrangeHRM);
		
		// Find WebElement By tagName
		List <WebElement> images = driver.findElements(By.tagName("img"));
		
		for (WebElement image : images) 
		{
			Highlighter.highlightElement(driver, image);
		}
	}
}































































