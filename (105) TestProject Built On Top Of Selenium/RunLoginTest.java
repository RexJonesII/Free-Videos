package io.testproject;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.testproject.java.enums.AutomatedBrowserType;
import io.testproject.java.sdk.v2.Runner;

public class RunLoginTest {

	Runner runner;
	DeveloperKey dk = new DeveloperKey();
	
	@BeforeClass
	public void setUp () throws InstantiationException {
		runner = Runner.createWeb(dk.token, AutomatedBrowserType.Chrome);
	}
	
	@Test
	public void logIntoExamplePage () throws Exception {
		LoginTest loginTest = new LoginTest ();
		runner.run(loginTest);
	}
	
	@AfterClass
	public void tearDown () throws IOException {
		runner.close();
	}
}












