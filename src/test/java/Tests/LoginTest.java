package Tests;
import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void userCanLoginWithValidCredentials() {

        // Opening Signup/Login page
        homePage.clickSignupLogin();

        // Entering valid login credentials
        loginPage.enterEmail("milica123@gmail.com");
        loginPage.enterPassword("Test123");

        // Clicking Login button
        loginPage.clickLoginButton();

        // Verifying successful login
        Assert.assertTrue(driver.getPageSource().contains("Logged in as"));
    }

    @Test(priority = 2)
    public void userCannotLoginWithInvalidPassword() {

        // Opening Signup/Login page
        homePage.clickSignupLogin();

        // Entering valid email and invalid password
        loginPage.enterEmail("milica123@gmail.com");
        loginPage.enterPassword("wrongPassword123");

        // Clicking Login button
        loginPage.clickLoginButton();

        // Verifying error message is displayed
        Assert.assertTrue(driver.getPageSource().contains("Your email or password is incorrect!"));
    }

    @Test(priority = 3)
    public void userCannotLoginWithInvalidEmail() {

        // Opening Signup/Login page
        homePage.clickSignupLogin();

        // Entering invalid email and valid password
        loginPage.enterEmail("wrongmilica123@gmail.com");
        loginPage.enterPassword("Test123");

        // Clicking Login button
        loginPage.clickLoginButton();

        // Verifying error message is displayed
        Assert.assertTrue(driver.getPageSource().contains("Your email or password is incorrect!"));
    }

    @Test(priority = 4)
    public void userCanLogoutSuccessfully() {

        // Opening Signup/Login page
        homePage.clickSignupLogin();

        // Logging into account
        loginPage.enterEmail("milica123@gmail.com");
        loginPage.enterPassword("Test123");
        loginPage.clickLoginButton();

        // Verifying successful login
        Assert.assertTrue(driver.getPageSource().contains("Logged in as"));

        // Clicking Logout button
        loginPage.clickLogoutButton();

        // Verifying user is logged out successfully
        Assert.assertTrue(driver.getPageSource().contains("Signup / Login"));
    }

    @Test(priority = 5)
    public void userCanDeleteAccountSuccessfully() throws InterruptedException {

        // Opening Signup/Login page
        homePage.clickSignupLogin();

        // Logging into delete test account
        loginPage.enterEmail("milica123@gmail.com");
        loginPage.enterPassword("Test123");
        loginPage.clickLoginButton();
        Thread.sleep(3000);

        // Verifying successful login
        Assert.assertTrue(driver.getPageSource().contains("Logged in as"));

        // Clicking Delete Account button
        homePage.clickDeleteAccountButton();
        Thread.sleep(6000);

        // Verifying successful account deletion
        Assert.assertTrue(driver.getCurrentUrl().contains("delete_account"));
    }
}
