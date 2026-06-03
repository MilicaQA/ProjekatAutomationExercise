package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By signupLoginButton = By.cssSelector("a[href='/login']");
    By productsButton = By.cssSelector("a[href='/products']");

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Navigates user to Login/Signup page
    public void clickSignupLogin() {
        driver.findElement(signupLoginButton).click();
    }

    // Opens Products page
    public void clickProducts() {
        driver.findElement(productsButton).click();
    }

    // Delete Account button
    By deleteAccountButton = By.cssSelector("a[href='/delete_account']");

    // Clicks Delete Account button
    public void clickDeleteAccountButton() {
        driver.findElement(deleteAccountButton).click();
    }
}