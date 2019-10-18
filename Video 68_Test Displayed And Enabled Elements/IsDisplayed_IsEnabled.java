package com.selenium4beginners.selenium_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IsDisplayed_IsEnabled
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
	public void tearDown ()
	{
		//driver.quit();
	}

	@Test
	public void testIsDisplayedIsEnabled ()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();		
		
		WebElement buttonDelete = driver.findElement(By.id("btnDelete"));		
		boolean isDeleteButtonDisplayed = buttonDelete.isDisplayed();
		boolean isDeleteButtonEnabled = buttonDelete.isEnabled();
		
		System.out.println("Before Click - Is Delete Button Displayed And Enabled? " + "\n \t"
										+ "Displayed = " + isDeleteButtonDisplayed + "\n \t"
										+ "Enabled = " + isDeleteButtonEnabled + "\n");
		
		driver.findElement(By.xpath("//a[text()='fiona.grace']/preceding::input[1]")).click();
		
		isDeleteButtonDisplayed = buttonDelete.isDisplayed();
		isDeleteButtonEnabled = buttonDelete.isEnabled();
		
		System.out.println("After Click - Is Delete Button Displayed And Enabled? " + "\n \t"
										+ "Displayed = " + isDeleteButtonDisplayed + "\n \t"
										+ "Enabled = " + isDeleteButtonEnabled + "\n");
		
		
		
	}
}





















