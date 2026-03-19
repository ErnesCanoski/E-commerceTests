package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.name("search");
    By searchBtn = By.cssSelector("button.btn-default");
    By myAccount = By.linkText("My Account");
    By register = By.linkText("Register");
    By login = By.linkText("Login");

    public void search(String product) {
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchBtn).click();
    }

    public void goToRegister() {
        driver.findElement(myAccount).click();
        driver.findElement(register).click();
    }

    public void goToLogin() {
        driver.findElement(myAccount).click();
        driver.findElement(login).click();
    }
}
