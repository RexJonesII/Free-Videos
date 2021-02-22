package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

  private By fullNameField = By.id("name");
  private By passwordField = By.id("password");
  private By loginButton = By.id("login");

  public LoginPage (WebDriver driver) {
    super(driver);
  }

  public void setFullName (String fullName) {
    type(fullName, fullNameField);
  }

  public void setPassword (String password) {
    type(password, passwordField);
  }

  public FormPage clickLoginButton () {
    click(loginButton);
    return new FormPage(driver);
  }
}
