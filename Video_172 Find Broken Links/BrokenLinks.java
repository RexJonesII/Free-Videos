package tutorials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.tools.ant.taskdefs.condition.Http;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {

  WebDriver driver;

  @BeforeClass
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.linkedin.com");
  }

  @AfterClass
  public void tearDown() { driver.quit(); }

  @Test
  public void findAllLinks() throws IOException {
    // Find & Get All Links
    List <WebElement> allLinks = driver.findElements(By.tagName("a"));
    System.out.println("# Links: " + allLinks.size());

    int i = 1;

    for (WebElement link : allLinks) {
      String url = link.getAttribute("href");

      if (url != null && !url.contains("javascript")) {
        // Establish A Connection To The URL
        HttpURLConnection connection =
                (HttpURLConnection) new URL(url).openConnection();
        connection.connect();

        // Get The Response Codes & Response Messages
        int responseCode = connection.getResponseCode();
        String responseMessage = connection.getResponseMessage();

        System.out.println(i + ". " + url +
                "\n \t" + responseCode + "\n \t" + responseMessage);
        i++;
        connection.disconnect();
      }
    }
  }
}