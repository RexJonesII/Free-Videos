package com.selenium4beginners.selenium_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragSlider_Horizontal 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe"); 
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://rangeslider.js.org/");
	}
	
	@AfterMethod
	public void tearDown () throws InterruptedException
	{
		Thread.sleep(1000); // Thread.sleep Is Used So Execution Pause For 1 Second To See The Slider Move And New Value
		driver.quit();
	}

	@Test
	public void dragSliderLeft ()
	{
		WebElement slider = driver.findElement(By.xpath("//div[@id='js-rangeslider-0']/div[2]"));
		
		WebElement output = driver.findElement(By.id("js-output"));
		
		Actions act = new Actions (driver);
		act.dragAndDropBy(slider, -100, 0).perform();
		
		System.out.println("What Is The Output After Dragging Left? " + output.getText());
	}
	
	@Test
	public void dragSliderRight ()
	{
		WebElement slider = driver.findElement(By.xpath("//div[@id='js-rangeslider-0']/div[2]"));
		
		WebElement output = driver.findElement(By.id("js-output"));
		
		Actions act = new Actions (driver);
		act.dragAndDropBy(slider, 100, 0).perform();
		
		System.out.println("What Is The Output After Dragging Right? " + output.getText());
	}
}