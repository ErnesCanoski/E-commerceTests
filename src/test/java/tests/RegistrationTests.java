package tests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegistrationTests extends BaseTest {

    @DataProvider(name = "userData")
    public Object[][] data() {
        return new Object[][]{
                {"John", "Doe", "123456"},
                {"Jane", "Doe", "123456"}
        };
    }

    @Test(groups = "smoke", dataProvider = "userData")
    public void testSuccessfulRegistration(String fn, String ln, String pass) {

        HomePage home = new HomePage(driver);
        home.goToRegister();

        RegisterPage reg = new RegisterPage(driver);

        String email = "test" + System.currentTimeMillis() + "@mail.com";

        reg.register(fn, ln, email, "123456", pass);

        Assert.assertTrue(driver.getPageSource().contains("Your Account Has Been Created"));
    }
}