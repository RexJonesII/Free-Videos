package com.selenium4beginners.selenium_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragSlider_Vertical
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe"); 
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");
	}
	
	@AfterMethod
	public void tearDown () throws InterruptedException
	{
		Thread.sleep(1000); // Thread.sleep Is Used So Execution Pause For 1 Second
		driver.quit();
	}

	@Test
	public void dragSliderDown ()
	{
		WebElement slider = driver.findElement(By.cssSelector("div.small-3 span.range-slider-handle"));
		
		WebElement value = driver.findElement(By.id("sliderOutput2"));
		
		Actions act = new Actions (driver);
		act.dragAndDropBy(slider, 0, 34).perform();
		
		System.out.println("What Is The Value After Dragging The Slider Down? " + value.getText());
	}
	
	@Test
	public void dragSliderUp ()
	{
		WebElement slider = driver.findElement(By.cssSelector("div.small-3 span.range-slider-handle"));
		
		WebElement value = driver.findElement(By.id("sliderOutput2"));
		
		Actions act = new Actions (driver);
		act.dragAndDropBy(slider, 0, -34).perform();
		
		System.out.println("What Is The Value After Dragging The Slider Up? " + value.getText());
	}
}