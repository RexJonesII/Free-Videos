package com.selenium4beginners.selenium_testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TakeScreenshot 
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe"); //ByPassed This Line In The Video
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
	}
	
	@Test
	public void takeGreyHoundScreenshot ()
	{
		driver.get("https://www.greyhound.com/");
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + 
				"/Screenshots/GreyHound.png");
		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Screenshot Located At " + destination);
	}	
	
	@AfterTest
	public void tearDown ()
	{
		driver.quit();
	}
}