package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCart = By.id("button-cart");
    By success = By.cssSelector(".alert-success");

    public void addToCart() {
        driver.findElement(addToCart).click();
    }

    public boolean isSuccessDisplayed() {
        return driver.findElements(success).size() > 0;
    }
}