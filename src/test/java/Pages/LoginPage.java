package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By emailField = By.cssSelector("[data-qa='login-email']");
    By passwordField = By.cssSelector("[data-qa='login-password']");
    By loginButton = By.cssSelector("[data-qa='login-button']");
    By logoutButton = By.linkText("Logout");

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Enters email into login form
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    // Enters password into login form
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    // Clicks login button
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    // Performs logout action
    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }

}