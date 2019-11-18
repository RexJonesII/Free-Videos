package com.selenium4beginners.selenium_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDown_Deselect
{
	WebDriver driver;
	@BeforeMethod
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");		
	}
	
	@Test
	public void deselectFromDropDown ()
	{
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		Select select = new Select (driver.findElement(By.name("cars")));
		
		select.selectByIndex(0);  //Volvo
		select.selectByValue("saab");
		select.selectByVisibleText("Opel");
		
		select.deselectByIndex(0);
		select.deselectByValue("saab");
		select.deselectByVisibleText("Opel");
	}
	
	@Test
	public void deselectAllFromDropDown ()
	{
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		Select select = new Select (driver.findElement(By.name("cars")));
		System.out.println("Drop Down Supports Multiple Selections? " + select.isMultiple());
		
		select.selectByIndex(0);  //Volvo
		select.selectByValue("saab");
		select.selectByVisibleText("Opel");
		select.selectByVisibleText("Audi");
		
		select.deselectAll();
	}
}























