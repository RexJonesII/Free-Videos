package seleniumfour;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.Log;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ViewConsoleLogs {

  ChromeDriver driver;

  @BeforeClass
  public void setUp () {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @Test
  public void viewConsoleLogs () {
    // Get The DevTools And Create A Session
    DevTools devTools = driver.getDevTools();
    devTools.createSession();

    // Send A Command To Enable The Logs
    devTools.send(Log.enable());

    // Add A Listener For The Logs
    devTools.addListener(Log.entryAdded(), logEntry -> {
      System.out.println(logEntry.asSeleniumLogEntry());
      System.out.println("----------");
      System.out.println("source = " + logEntry.getSource());
      System.out.println("level = " + logEntry.getLevel());
      System.out.println("text = " + logEntry.getText());
      System.out.println("timestamp = " + logEntry.getTimestamp());
    });
    // Load The AUT
    driver.get("https://www.lego.com/404");

  }

}