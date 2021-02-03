package com.saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import com.saucedemo.tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBackPack extends BaseTest {
  @Test
  public void testAddBackPack () {
    ProductsPage productsPage = loginPage.loginWith(
                          "standard_user", "secret_sauce");
    productsPage.addBackPack();
    Assert.assertEquals(productsPage.getButtonName(), "REMOVE");

  }
}