package io.testproject;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.testproject.java.sdk.v2.drivers.WebDriver;
import io.testproject.java.sdk.v2.enums.ExecutionResult;
import io.testproject.java.sdk.v2.exceptions.FailureException;
import io.testproject.java.sdk.v2.reporters.TestReporter;
import io.testproject.java.sdk.v2.tests.WebTest;
import io.testproject.java.sdk.v2.tests.helpers.WebTestHelper;

public class LoginTest implements WebTest {

	public ExecutionResult execute(WebTestHelper helper) throws FailureException {
		WebDriver driver = helper.getDriver();
		TestReporter reporter = helper.getReporter();
		
		driver.get("https://example.testproject.io/web/index.html");
		driver.manage().window().maximize();
		
		reporter.step("Enter Name");
		driver.findElement(By.id("name")).sendKeys("Rex Jones II");
		
		reporter.step("Enter Password");
		driver.findElement(By.id("password")).sendKeys("12345");
		
		reporter.step("Click Login Button");
		driver.findElement(By.id("login")).click();
		
		String greeting = driver.findElement(By.id("greetings")).getText();
		System.out.println(greeting);
		Assert.assertTrue(greeting.contains("Rex"));
		
		
		
		
		return ExecutionResult.PASSED;
	}

}








