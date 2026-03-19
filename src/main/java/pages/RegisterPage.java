package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By phone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirm = By.id("input-confirm");
    By policy = By.name("agree");
    By continueBtn = By.cssSelector("input.btn-primary");

    public void register(String fn, String ln, String em, String ph, String pass) {
        driver.findElement(firstName).sendKeys(fn);
        driver.findElement(lastName).sendKeys(ln);
        driver.findElement(email).sendKeys(em);
        driver.findElement(phone).sendKeys(ph);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirm).sendKeys(pass);
        driver.findElement(policy).click();
        driver.findElement(continueBtn).click();
    }
}