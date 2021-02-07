package seleniumfour;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowNewTab {

WebDriver driver;
	
	@BeforeMethod
	public void setUp () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Title: " + driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown () {
		//driver.quit();		
	}
	
	@Test
	public void testNewWindowConcept () {
		WebDriver newPage = driver.switchTo().newWindow(WindowType.WINDOW);
		newPage.get("http://automationpractice.com/index.php?controller=contact");
		System.out.println("Title: " + driver.getTitle());
	}
	
	@Test
	public void testOpenSwitchWorkInNewTab () {
		
		// Open & Switch To New Window-Tab
		driver.switchTo().newWindow(WindowType.TAB).
		get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		System.out.println("Title: " + driver.getTitle());
		
		// Work In The New Window-Tab
		driver.findElement(By.id("email_create")).sendKeys("Automation34@Selenium4.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		// Get The Window ID Handles
		Set <String> allWindows = driver.getWindowHandles();
		Iterator<String> iterate = allWindows.iterator();
		String parentFirstWindow = iterate.next();
		String childSecondWindow = iterate.next();
		
		// Switch Back To The Parent Window-Tab & Work In The 1st Window-Tab
		driver.switchTo().window(parentFirstWindow);
		driver.findElement(By.id("search_query_top")).sendKeys("Faded Shirt");
		driver.findElement(By.name("submit_search")).click();
		System.out.println("Title: " + driver.getTitle());

	}
}