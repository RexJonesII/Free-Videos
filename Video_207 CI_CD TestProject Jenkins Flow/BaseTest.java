package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

public class BaseTest {
  protected ChromeDriver driver;
  private final String URL = "https://example.testproject.io/web/index.html";
  protected LoginPage loginPage;

  @BeforeClass
  public void setUp () throws Exception {
    WebDriverManager.chromedriver().setup();

    driver = new ChromeDriver(
            new ChromeOptions(),
            "My first Project");
    driver.manage().window().maximize();
    driver.get(URL);
    loginPage = new LoginPage(driver);
  }

  @AfterClass
  public void tearDown () throws Exception {
    driver.quit();
  }
}