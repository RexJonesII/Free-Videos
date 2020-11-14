package seleniumfour;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRect {

	WebDriver driver;
	
	@BeforeClass
	public void setUp () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@AfterClass 
	public void tearDown () {
		driver.quit();
	}

	@Test
	public void getPositionDimension () {
		WebElement logoOrangeHRM = driver.findElement(By.cssSelector("#divLogo > img"));
		Rectangle rectLogo = logoOrangeHRM.getRect();
		Point pointLogo = logoOrangeHRM.getLocation();
		Dimension dimLogo = logoOrangeHRM.getSize();
		System.out.println("\t    Selenium 3 \t   Selenium 4");
		System.out.println("-------------------------------------------------");
		System.out.println("x \t\t" + pointLogo.getX() + "\t\t" + rectLogo.getX());
		System.out.println("y \t\t" + pointLogo.getY() + "\t\t" + rectLogo.getY());
		System.out.println("Width \t\t" + dimLogo.getWidth() + "\t\t" + rectLogo.getWidth());
		System.out.println("Height \t\t" + dimLogo.getHeight() + "\t\t" + rectLogo.getHeight());
		driver.findElement(By.tagName(""));
	}
}


























