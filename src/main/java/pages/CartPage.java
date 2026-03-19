package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By items = By.cssSelector(".table-responsive tbody tr");
    By remove = By.cssSelector("button[data-original-title='Remove']");

    public int getItemsCount() {
        return driver.findElements(items).size();
    }

    public void removeFirstItem() {
        driver.findElements(remove).get(0).click();
    }
}