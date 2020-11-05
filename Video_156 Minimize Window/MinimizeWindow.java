package seleniumfour;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MinimizeWindow {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@AfterMethod
	public void tearDown () {
		driver.quit();		
	}
	
	@Test
	public void minimizeUsingNewFeature () {
		driver.manage().window().minimize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test
	public void maxmizeWindow () {
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test
	public void minimizeUsingSetPosition () {
		driver.manage().window().setPosition(new Point(-2000, 0));
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test
	public void minimizeUsingRobotClass () throws AWTException {
		Robot robot = new Robot ();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_N);
		
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_N);
	}
}