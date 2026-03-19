package tests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test(groups = "regression")
    public void testInvalidEmail() {

        HomePage home = new HomePage(driver);
        home.goToLogin();

        LoginPage login = new LoginPage(driver);
        login.login("fake@mail.com", "123456");

        Assert.assertTrue(driver.getPageSource().contains("Warning"));
    }

    @Test(groups = "regression")
    public void testInvalidPassword() {

        HomePage home = new HomePage(driver);
        home.goToLogin();

        LoginPage login = new LoginPage(driver);
        login.login("test@mail.com", "wrong");

        Assert.assertTrue(driver.getPageSource().contains("Warning"));
    }
}