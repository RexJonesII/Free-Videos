package seleniumfour;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageScreenshot {

	WebDriver driver;
	
	@BeforeTest
	public void setUp () 	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}
	
	@AfterTest
	public void tearDown () {
		driver.quit();
	}

	@Test
	public void takeFullPageScreenshot () throws IOException {
		File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("Amazon Full Page Screenshot.png"));
	}
	
	@Test
	public void takePageScreenshot () throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("Amazon Screenshot.png"));
	}
}






















