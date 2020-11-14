package seleniumfour;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementScreenshot {
	WebDriver driver;
	
	@BeforeClass
	public void setUp () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@AfterClass
	public void tearDown () {
		driver.quit();
	}

	@Test
	public void takeWebElementScreenshot () throws IOException {
		WebElement logoOrangeHRM = driver.findElement(By.cssSelector("#divLogo > img"));
		File source = logoOrangeHRM.getScreenshotAs(OutputType.FILE);
		File destination = new File ("Orange HRM Logo.png");
		FileUtils.copyFile(source, destination);
	}
	
	@Test
	public void takePageSectionScreenshot () throws IOException {
		WebElement pageSectionOrangeHRM = driver.findElement(By.id("divLoginImage"));
		File source = pageSectionOrangeHRM.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File ("Orange HRM Page Section.png"));
	}
}

























