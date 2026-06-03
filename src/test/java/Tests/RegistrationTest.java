package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test(priority = 1)
    public void userCanRegisterWithValidCredentials() {

        // Opening Signup/Login page
        homePage.clickSignupLogin();

        // Filling Signup section
        signupPage.enterName("Milica");
        signupPage.enterEmail("milica123@gmail.com");
        signupPage.clickSignupButton();

        // Filling registration form
        signupPage.selectMrsTitle();
        signupPage.enterPassword("Test123");
        signupPage.selectDay("24");
        signupPage.selectMonth("March");
        signupPage.selectYear("1995");
        signupPage.clickNewsletterCheckbox();
        signupPage.enterFirstName("Milica");
        signupPage.enterLastName("Nikolic");
        signupPage.enterCompany("Grammer");
        signupPage.enterAddress("8305 Main St");
        signupPage.selectCountry("United States");
        signupPage.enterState("Texas");
        signupPage.enterCity("Dallas");
        signupPage.enterZipcode("75001");
        signupPage.enterMobileNumber("+1 (945) 555-0195");

        // Creating account
        signupPage.clickCreateAccountButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("account_created"));

    }

    @Test(priority = 2)
    public void userCannotRegisterWithExistingEmail() {

        // Opening Signup/Login page
        homePage.clickSignupLogin();

        // Trying to register with already existing email
        signupPage.enterName("Milica");
        signupPage.enterEmail("milica123@gmail.com");
        signupPage.clickSignupButton();

        // Verifying error message for already existing email
        Assert.assertTrue(driver.getPageSource().contains("Email Address already exist!"));
    }

}