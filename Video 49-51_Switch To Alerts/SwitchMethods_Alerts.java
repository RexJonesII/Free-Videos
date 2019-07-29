package com.selenium4beginners.selenium_testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchMethods_Alerts 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp ()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	
	@Test
	public void switchToInformationAlert () throws Exception 
	{
		driver.findElement(By.xpath("//div[@id='content']/div[1]/ul[1]/li[1]/button")).click();
		
		WebDriverWait wait = new WebDriverWait (driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		System.out.println(driver.findElement(By.id("result")).getText());		
	}	
	
	@Test
	public void switchToConfirmationAlert () throws Exception
	{
		driver.findElement(By.xpath("//div[@id='content']/div[1]/ul[1]/li[2]/button")).click();
		
		WebDriverWait wait = new WebDriverWait (driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		System.out.println(driver.findElement(By.id("result")).getText());	
	}
	
	@Test
	public void switchToPromptAlert () throws Exception
	{
		driver.findElement(By.xpath("//div[@id='content']/div[1]/ul[1]/li[3]/button")).click();
		
		WebDriverWait wait = new WebDriverWait (driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.sendKeys("I Am An Automation Engineer");		
		alert.accept();
		
		System.out.println(driver.findElement(By.id("result")).getText());	
	}

	@AfterMethod
	public void tearDown () throws InterruptedException
	{
		Thread.sleep(2000); // Thread.sleep Is Here Slow Down Execution And Show The Result Before Closing
		driver.quit();
	}
}
