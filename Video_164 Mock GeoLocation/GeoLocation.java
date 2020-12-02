package seleniumfour;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class GeoLocation {

  @Test
  public void mockGeolocation () {
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    Map coordinates = new HashMap()
    {{
      put("latitude", 28.6139);
      put("longitude", 77.2090);
      put("accuracy", 1);
    }};
    driver.executeCdpCommand(
            "Emulation.setGeolocationOverride",coordinates);
    driver.get("https://where-am-i.org/");
  }
}


















