package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {

    WebDriver driver;
    WebDriverWait wait;

    // Search product elements
    By searchInput = By.id("search_product");
    By searchButton = By.id("submit_search");

    // View product button
    By viewProductButton = By.cssSelector("a[href='/product_details/1']");

    // Add to cart button on Product Details page
    By addToCartButton = By.cssSelector("button.btn.btn-default.cart");

    // Women category elements
    By womenCategory = By.cssSelector("a[href='#Women']");
    By dressSubcategory = By.cssSelector("a[href='/category_products/1']");

    // Men category elements
    By menCategory = By.cssSelector("a[href='#Men']");
    By tshirtsSubcategory = By.cssSelector("a[href='/category_products/3']");

    // Brand elements
    By poloBrand = By.cssSelector("a[href='/brand_products/Polo']");

    // Pop-up buttons
    By viewCartButton = By.xpath("//u[text()='View Cart']");
    By continueShoppingButton = By.cssSelector(".btn.btn-success.close-modal.btn-block");

    // Constructor
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Clicks on View Product
    public void clickViewProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(viewProductButton))
                .click();
    }

    // Adds product to cart
    public void clickAddToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton))
                .click();
    }

    // Opens cart from pop-up window
    public void clickViewCart() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(viewCartButton));

        wait.until(ExpectedConditions.elementToBeClickable(viewCartButton))
                .click();

        wait.until(ExpectedConditions.urlContains("/view_cart"));
    }

    // Searches for product using search bar
    public void searchProduct(String productName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput)).sendKeys(productName);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }

    // Opens Women category
    public void clickWomenCategory() {
        driver.findElement(womenCategory).click();
    }

    // Opens Dress subcategory
    public void clickDressSubcategory() {
        driver.findElement(dressSubcategory).click();
    }

    // Opens Men category
    public void clickMenCategory() {
        driver.findElement(menCategory).click();
    }

    // Opens Tshirts subcategory
    public void clickTshirtsSubcategory() {
        driver.findElement(tshirtsSubcategory).click();
    }

    // Opens Polo brand products
    public void clickPoloBrand() {
        driver.findElement(poloBrand).click();
    }

    // Verifies searched product
    public boolean isProductVisible(String productName) {
        return driver.getPageSource().contains(productName);
    }
}