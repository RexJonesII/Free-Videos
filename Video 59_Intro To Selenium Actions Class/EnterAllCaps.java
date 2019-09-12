package com.selenium4beginners.selenium_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnterAllCaps
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp ()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();			
		driver.get("https://www.google.com");
	}
	
	@AfterMethod
	public void tearDown () throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void enterAllCaps_Action ()
	{
		WebElement searchBox = driver.findElement(By.name("q"));
		
		Actions act = new Actions (driver);
		act.keyDown(searchBox, Keys.SHIFT);
		act.sendKeys(searchBox, "with build");
		act.keyUp(searchBox, Keys.SHIFT);
		
		Action action = act.build();
		action.perform();
	}
	
	@Test
	public void enterAllCaps_Actions ()
	{
		WebElement searchBox = driver.findElement(By.name("q"));
		
		Actions act = new Actions (driver);
		act.keyDown(searchBox, Keys.SHIFT);
		act.sendKeys(searchBox, "without build");
		act.keyUp(searchBox, Keys.SHIFT);
		act.perform();
		
		act.keyDown(searchBox, Keys.SHIFT).sendKeys(" Works Too").keyUp(searchBox, Keys.SHIFT).perform();
	}
}





































