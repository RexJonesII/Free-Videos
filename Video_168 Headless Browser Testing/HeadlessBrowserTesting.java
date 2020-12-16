package tutorials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadlessBrowserTesting {

  @Test
  public void htmlHeadlessBrowser () {
    WebDriver driver = new HtmlUnitDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    System.out.println("HTML Title: " + driver.getTitle());

  }

  @Test
  public void chromeHeadlessBrowserOne () {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.setHeadless(true);
    WebDriver driver = new ChromeDriver(options);

    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    System.out.println("Chrome Title 1: " + driver.getTitle());
  }

  @Test
  public void chromeHeadlessBrowserTwo () {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    WebDriver driver = new ChromeDriver(options);

    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    System.out.println("Chrome Title 2: " + driver.getTitle());
  }

  @Test
  public void firefoxHeadlessBrowserOne () {
    WebDriverManager.firefoxdriver().setup();
    FirefoxOptions options = new FirefoxOptions();
    options.setHeadless(true);
    WebDriver driver = new FirefoxDriver(options);

    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    System.out.println("Firefox Title 1: " + driver.getTitle());
  }

  @Test
  public void firefoxHeadlessBrowserTwo () {
    WebDriverManager.firefoxdriver().setup();
    FirefoxOptions options= new FirefoxOptions();
    options.addArguments("--headless");
    WebDriver driver = new FirefoxDriver(options);

    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    System.out.println("Firefox Title 2: " + driver.getTitle());
  }
}






















