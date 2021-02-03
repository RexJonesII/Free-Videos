package com.saucedemo.tests.login;

import com.saucedemo.pages.ProductsPage;
import com.saucedemo.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLockedOutUserLogin extends BaseTest {
  @Test
  public void testLockedOutUserGetsErrorMessage () {
    loginPage.setUsername("locked_out_user");
    loginPage.setPassword("secret_sauce");
    ProductsPage productsPage = loginPage.clickLoginButton();
    Assert.assertTrue(loginPage.getErrorMessage().contains("Epic sadface"));
  }
}