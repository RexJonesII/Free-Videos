package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
  private By usernameField = By.id("user-name");
  private By passwordField = By.id("password");
  private By loginButton = By.id("login-button");
  private By errorMessage = By.cssSelector("#login_button_container h3");

  public LoginPage (WebDriver driver) {
    super(driver);
  }
  public void setUsername (String username) {
    type(username, usernameField);
  }

  public void setPassword (String password) {
    type(password, passwordField);
  }

  public ProductsPage clickLoginButton () {
    click(loginButton);
    return new ProductsPage(driver);
  }

  public ProductsPage loginWith (String username, String password) {
    setUsername(username);
    setPassword(password);
    return clickLoginButton();
  }

  public String getErrorMessage () {
    return find(errorMessage).getText();
  }
}


















