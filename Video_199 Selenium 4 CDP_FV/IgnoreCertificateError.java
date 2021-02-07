package seleniumfour;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.security.Security;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UntrustedWebsite {

  ChromeDriver driver;
  DevTools devTools;

  @BeforeMethod
  public void setUp () {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    devTools = driver.getDevTools();
  }

  @Test
  public void loadBadWebsite () {
    devTools.createSession();
    devTools.send(Security.setIgnoreCertificateErrors(true));
    driver.get("https://self-signed.badssl.com");
  }

  @Test
  public void doNotLoadBadWebsite () {
    devTools.createSession();
    devTools.send(Security.setIgnoreCertificateErrors(false));
    driver.get("https://self-signed.badssl.com");
  }
}





























