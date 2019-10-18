package com.selenium4beginners.selenium_testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchMethods_Windows
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp ()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();		
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	}
	
	@AfterTest
	public void tearDown ()
	{
		driver.quit();
	}
	
	@Test
	public void switchWindows () throws InterruptedException
	{
		String mainHandle = driver.getWindowHandle();
		System.out.println("Main Window ID: " + mainHandle + "\n");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");
		
		driver.findElement(By.id("button1")).click();		
		
		Set <String> allHandles = driver.getWindowHandles();
		System.out.println("Windows Open After Click: " + allHandles.size());
		
		for (String windowHandle : allHandles) 
		{
			if(mainHandle.equals(windowHandle))
			{
				System.out.println("\t Window ID 1: \t" + windowHandle +
												"\n \t URL: \t \t" + driver.getCurrentUrl() +						
												"\n \t Title: \t \t" + driver.getTitle());				
			}	
			else
			{
				driver.switchTo().window(windowHandle);
				
				System.out.println("\t Window ID 2: \t" + windowHandle +
						"\n \t URL: \t \t" + driver.getCurrentUrl() +						
						"\n \t Title: \t \t" + driver.getTitle());	
				
			}

		}
	}
}




































