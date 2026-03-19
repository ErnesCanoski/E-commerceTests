package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By results = By.cssSelector(".product-thumb");
    By noResults = By.xpath("//p[contains(text(),'no product')]");

    public int getResultsCount() {
        return driver.findElements(results).size();
    }

    public boolean isNoResultsDisplayed() {
        return driver.findElements(noResults).size() > 0;
    }

    public void clickFirstProduct() {
        driver.findElements(results).get(0).click();
    }
}