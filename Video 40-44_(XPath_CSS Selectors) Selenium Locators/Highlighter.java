package com.selenium4beginners.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter 
{
	public static void highlightElement(WebDriver driver, WebElement element) 
	{
	JavascriptExecutor javascript=(JavascriptExecutor)driver; 
	 
	javascript.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid black;');", element);
	 
	try 
	{
	Thread.sleep(1000); 
	} 
	catch (InterruptedException e) {
	 
	System.out.println(e.getMessage());
	} 	 
	javascript.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);	 
	}
}
