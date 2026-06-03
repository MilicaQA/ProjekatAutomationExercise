package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test(priority = 1)
    public void userCanSearchProduct() {

        // Login using valid credentials
        homePage.clickSignupLogin();
        loginPage.enterEmail("milica123@gmail.com");
        loginPage.enterPassword("Test123");
        loginPage.clickLoginButton();

        // Verifying successful login
        Assert.assertTrue(driver.getPageSource().contains("Logged in as"));

        // Opening Products page
        homePage.clickProducts();

        // Searching product
        productsPage.searchProduct("Blue Top");

        // Verifying searched product is displayed
        Assert.assertTrue(productsPage.isProductVisible("Blue Top"));
    }

    @Test(priority = 2)
    public void userCanFilterProductsByWomenCategory() throws InterruptedException {

        // Login using valid credentials
        homePage.clickSignupLogin();
        loginPage.enterEmail("milica123@gmail.com");
        loginPage.enterPassword("Test123");
        loginPage.clickLoginButton();

        // Verifying successful login
        Assert.assertTrue(driver.getPageSource().contains("Logged in as"));

        // Opening Products page
        homePage.clickProducts();

        // Clicking Women category
        productsPage.clickWomenCategory();

        Thread.sleep(1000);

        // Clicking Dress subcategory
        productsPage.clickDressSubcategory();

        // Verifying Women Dress products page
        Assert.assertTrue(driver.getPageSource().contains("Dress"));
    }

    @Test(priority = 3)
    public void userCanFilterProductsByMenCategory() throws InterruptedException {

        // Login using valid credentials
        homePage.clickSignupLogin();
        loginPage.enterEmail("milica123@gmail.com");
        loginPage.enterPassword("Test123");
        loginPage.clickLoginButton();

        // Verifying successful login
        Assert.assertTrue(driver.getPageSource().contains("Logged in as"));

        // Opening Products page
        homePage.clickProducts();

        // Clicking Men category
        productsPage.clickMenCategory();

        Thread.sleep(1000);

        // Clicking Tshirts subcategory
        productsPage.clickTshirtsSubcategory();

        // Verifying Men Tshirts products page
        Assert.assertTrue(driver.getPageSource().contains("Tshirts"));
    }

    @Test(priority = 4)
    public void userCanFilterProductsByPoloBrand() {

        // Login using valid credentials
        homePage.clickSignupLogin();
        loginPage.enterEmail("milica123@gmail.com");
        loginPage.enterPassword("Test123");
        loginPage.clickLoginButton();

        // Verifying successful login
        Assert.assertTrue(driver.getPageSource().contains("Logged in as"));

        // Opening Products page
        homePage.clickProducts();

        // Clicking Polo brand
        productsPage.clickPoloBrand();

        // Verifying Polo products page
        Assert.assertTrue(driver.getCurrentUrl().contains("Polo"));
    }
}