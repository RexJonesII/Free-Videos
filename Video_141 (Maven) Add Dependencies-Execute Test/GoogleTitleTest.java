package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver;
	
	@Test
	public void testGoogleTitle () {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Page Title: " + driver.getTitle());
		driver.quit();
	}
}