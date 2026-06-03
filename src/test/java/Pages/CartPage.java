package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    By removeButton = By.cssSelector(".fa-times");
    By cartTable = By.id("cart_info_table");
    By emptyCartText = By.id("empty_cart");

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Removes product from cart
    public void removeProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(removeButton)).click();
    }

    // Verifies product exists in cart
    public boolean isProductInCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartTable));

        return driver.getPageSource().contains("Blue Top");
    }

    // Verifies cart is empty
    public boolean isCartEmpty() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCartText));

        return driver.findElement(emptyCartText).getText().contains("Cart is empty");
    }
}