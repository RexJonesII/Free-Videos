package com.selenium4beginners.selenium_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseDoubleClick 
{
WebDriver driver;
	
	@BeforeTest
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();		
		driver.get("https://api.jquery.com/dblclick/");
	}
	
	@AfterTest
	public void tearDown ()
	{
		//driver.quit();
	}
	
	@Test
	public void doubleClickButton ()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 2500)");
		
		driver.switchTo().frame(0);
		
		WebElement box = driver.findElement(By.cssSelector("body > div"));
		
		System.out.println("Color Before: " + box.getCssValue("background-color"));
		
		Actions act = new Actions (driver);
		act.doubleClick(box).perform();
		
		System.out.println("Color After: " + box.getCssValue("background-color"));		
	}
}