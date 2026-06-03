package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test(priority = 1)
    public void userCanAddProductToCart() {

        // Opening Products page
        homePage.clickProducts();

        // Clicking on View Product
        productsPage.clickViewProduct();

        // Adding product to cart
        productsPage.clickAddToCart();

        // Opening cart from modal
        productsPage.clickViewCart();

        // Verifying product is added to cart
        Assert.assertTrue(cartPage.isProductInCart());
    }

    @Test(priority = 2)
    public void userCanRemoveProductFromCart() throws InterruptedException {

        // Opening Products page
        homePage.clickProducts();

        // Clicking on View Product
        productsPage.clickViewProduct();

        // Adding product to cart
        productsPage.clickAddToCart();
        Thread.sleep(3000);

        // Opening cart from modal
        productsPage.clickViewCart();

        // Verifying product is added
        Assert.assertTrue(cartPage.isProductInCart());

        // Removing product
        cartPage.removeProduct();

        // Verifying cart is empty
        Assert.assertTrue(cartPage.isCartEmpty());
    }
}