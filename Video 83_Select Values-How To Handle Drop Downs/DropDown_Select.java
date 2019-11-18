package com.selenium4beginners.selenium_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDown_Select
{
	WebDriver driver;
	
	@BeforeClass
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public void accessEmployeeList ()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
	}

	@Test
	public void selectFromDropDown ()
	{	
		WebElement findJobTitle = driver.findElement(By.id("empsearch_job_title"));
		Select selectJobTitle = new Select (findJobTitle);
		selectJobTitle.selectByIndex(1); // Account Clerk
		
		Select selectSubUnit = new Select (driver.findElement(By.id("empsearch_sub_unit")));
		selectSubUnit.selectByValue("6"); // IT
		
		Select selectInclude = new Select (driver.findElement(By.id("empsearch_termination")));
		selectInclude.selectByVisibleText("Past Employees Only");		
	}
}