package tutorials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShadowDOM {

  WebDriver driver;

  @BeforeMethod
  public void setUp () {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://books-pwakit.appspot.com/");
  }

  @AfterMethod
  public void tearDown (){ //driver.quit();
  }

  @Test
  public void findShadowDOMWithoutSeleniumFindElement () {
    // Provide Access So The Driver Can Execute JavaScript
    JavascriptExecutor jsExecutor
            = (JavascriptExecutor) driver;

    // Execute JavaScript To Return A WebElement
   WebElement bookSearchField = (WebElement) jsExecutor.executeScript(
            "return document.querySelector(\"body > book-app\")." +
                    "shadowRoot.querySelector(\"#input\")");

    // Perform An Action On The WebElement
    bookSearchField.sendKeys("Shadow DOM Without Find Element");
  }

  @Test
  public void findShadowDOMWithSeleniumFindElement () {
    // #1 Find Shadow Host
    WebElement shadowHost = driver.findElement(By.tagName("book-app"));

    // #2 Execute JavaScript To Return The Shadow Root
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    WebElement shadowRoot = (WebElement) jsExecutor.executeScript(
            "return arguments[0].shadowRoot", shadowHost);

    // #3 Find The WebElement Then Perform An Action On The WebElement
    WebElement app_header = shadowRoot.findElement(By.tagName("app-header"));
    WebElement app_toolbar
            = app_header.findElement(By.cssSelector(".toolbar-bottom"));
    WebElement book_input_decorator
            = app_toolbar.findElement(By.tagName("book-input-decorator"));
    WebElement searchField = book_input_decorator.findElement(By.id("input"));
    searchField.sendKeys("Shadow DOM With Find Element");
  }
}