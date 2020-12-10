package seleniumfour;

import java.util.Optional;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.network.Network;
import org.openqa.selenium.devtools.network.model.ConnectionType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.devtools.network.Network.loadingFailed;
import static org.testng.Assert.assertEquals;

public class EnableNetworks {

  EdgeDriver driver;
  DevTools devTools;

  @BeforeMethod
  public void setUp () {
    WebDriverManager.edgedriver().setup();
    driver = new EdgeDriver();
    driver.manage().window().maximize();
    devTools = driver.getDevTools();
  }

  @Test
  public void enableSlowNetwork () {
    devTools.createSession();
    devTools.send(Network.enable(
            Optional.empty(),
            Optional.empty(),
            Optional.empty()));
    devTools.send(Network.emulateNetworkConditions(
            false,
            150,
            2500,
            2000,
            Optional.of(ConnectionType.CELLULAR3G)));
    driver.get("https://www.linkedin.com");
    System.out.println("Slow " + driver.getTitle());
  }

  @Test
  public void accessLinkedIn () {
    driver.get("https://www.linkedin.com");
    System.out.println("Access " + driver.getTitle());
  } 
}




















