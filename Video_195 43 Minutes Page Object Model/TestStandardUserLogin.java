package com.saucedemo.tests.login;

import com.saucedemo.pages.ProductsPage;
import com.saucedemo.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStandardUserLogin extends BaseTest {
  @Test
  public void testStandardUserCanLogin () {
    ProductsPage productsPage = loginPage.loginWith(
                          "standard_user", "secret_sauce");
    Assert.assertTrue(productsPage.isProductLabelDisplayed());
  }
}