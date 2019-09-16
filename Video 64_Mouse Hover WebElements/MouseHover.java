package com.selenium4beginners.selenium_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHover 
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp ()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();			
	}
	
	@AfterTest
	public void tearDown () throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void hoverAmazonMenu ()
	{
		driver.get("https://www.amazon.com");
		
		WebElement menuSignIn = driver.findElement(By.id("nav-link-accountList"));
		
		Actions act = new Actions (driver);
		act.moveToElement(menuSignIn).perform();
		
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		
		System.out.println("Title = " + driver.getTitle());
	}
}