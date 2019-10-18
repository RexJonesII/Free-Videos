package com.selenium4beginners.selenium_testng;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyPress
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://api.jquery.com/");		
	}
	
	@AfterMethod
	public void tearDown () throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	public void useKeysClass ()
	{
		driver.findElement(By.name("s")).sendKeys("Test");
		driver.findElement(By.name("s")).sendKeys(Keys.ENTER);
	}
	
	@Test
	public void useRobotClass () throws Exception 
	{
		Robot robot = new Robot ();
		driver.findElement(By.name("s")).sendKeys("json");
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		
	}
}