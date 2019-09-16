package com.selenium4beginners.selenium_testng;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium4beginners.utility.Highlighter;

public class MouseLeftClick 
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/trigger-left-click.html");		
	}
	
	@AfterTest
	public void tearDown ()
	{
		driver.quit();
	}
	
	@Test
	public void leftClickButton ()
	{
		WebElement button = driver.findElement(By.cssSelector("span.btn-neutral"));
		
		Actions act = new Actions (driver);
		act.click(button).perform();
		
		List <WebElement> elements = driver.findElements(By.cssSelector("li span"));
		
		System.out.println("WebElements After Left Click:");
		
		for (WebElement element : elements) 
		{
			Highlighter.highlightElement(driver, element);
			
			System.out.println("\t" + element.getText());
		}
	}

}