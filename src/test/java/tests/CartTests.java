package tests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CartTests extends BaseTest{

    @Test(groups = "smoke")
    public void testAddToCart() {

        HomePage home = new HomePage(driver);
        home.search("MacBook");

        SearchPage search = new SearchPage(driver);
        search.clickFirstProduct();

        ProductPage product = new ProductPage(driver);
        product.addToCart();

        Assert.assertTrue(product.isSuccessDisplayed());
    }

    @Test(groups = "regression")
    public void testRemoveFromCart() {

        HomePage home = new HomePage(driver);
        home.search("MacBook");

        SearchPage search = new SearchPage(driver);
        search.clickFirstProduct();

        ProductPage product = new ProductPage(driver);
        product.addToCart();

        driver.get("https://demo.opencart.com/index.php?route=checkout/cart");

        CartPage cart = new CartPage(driver);
        cart.removeFirstItem();

        Assert.assertTrue(cart.getItemsCount() == 0);
    }
}
