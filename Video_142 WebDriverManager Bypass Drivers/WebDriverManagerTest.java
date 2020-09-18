package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	@Test
	public void demoWebDriverManager1 () {
		
		WebDriverManager.chromedriver().setup();		
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.linkedin.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void demoWebDriverManager2 () {
		
		WebDriverManager.chromedriver().driverVersion("2.34").setup();
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.linkedin.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
























