package tutorials.testproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShadowDOMNested {

  WebDriver driver;

  @BeforeClass
  public void setUp () {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://shop.polymer-project.org/");
  }

  @Test
  public void findElementInNestedShadowDOM () {
    // Provide Access To JavaScript
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

    // Find The WebElement So We Can Perform An Action
    WebElement shopNowButton = (WebElement) jsExecutor.executeScript(
            "return document.querySelector('shop-app')." +
                    "shadowRoot.querySelector('shop-home')." +
                    "shadowRoot.querySelector('shop-button > a')");
    shopNowButton.click();
  }
}