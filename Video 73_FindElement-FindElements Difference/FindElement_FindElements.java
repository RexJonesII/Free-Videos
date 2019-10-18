package com.selenium4beginners.selenium_testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElement_FindElements 
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp ()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();		
		driver.get("https://www.yahoo.com/");
	}
	
	@AfterTest
	public void tearDown ()
	{
		driver.quit();
	}
	
	@Test
	public void differenceFindElement_FindElements ()
	{
		WebElement yahooLink = driver.findElement(By.cssSelector("div#mega-bottombar a"));
		System.out.println("findElement: \n \t" + yahooLink.getText());
		
		List <WebElement> yahooLinks = driver.findElements(By.cssSelector("div#mega-bottombar a"));
		
		System.out.println("findElements: ");
		
		for (WebElement tempYahooLink : yahooLinks)
		{
			System.out.println("\t " + tempYahooLink.getText());
		}
	}
}