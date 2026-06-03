package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

    WebDriver driver;

    // Signup section
    By nameField = By.cssSelector("[data-qa='signup-name']");
    By emailField = By.cssSelector("[data-qa='signup-email']");
    By signupButton = By.cssSelector("[data-qa='signup-button']");

    // Registration form
    By titleMrsRadioButton = By.id("id_gender2");
    By passwordField = By.id("password");

    By dayDropdown = By.id("days");
    By monthDropdown = By.id("months");
    By yearDropdown = By.id("years");

    By newsletterCheckbox = By.id("newsletter");

    By firstNameField = By.id("first_name");
    By lastNameField = By.id("last_name");
    By companyField = By.id("company");
    By addressField = By.id("address1");

    By countryDropdown = By.id("country");

    By stateField = By.id("state");
    By cityField = By.id("city");
    By zipcodeField = By.id("zipcode");
    By mobileNumberField = By.id("mobile_number");

    By createAccountButton = By.cssSelector("button[data-qa='create-account']");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    // Inserts valid username into Signup section
    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    // Inserts valid email address into Signup section
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    // Clicks Signup button and opens registration form
    public void clickSignupButton() {
        driver.findElement(signupButton).click();
    }

    // Selects Mrs. title radio button
    public void selectMrsTitle() {
        driver.findElement(titleMrsRadioButton).click();
    }

    // Inserts password into Password field
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    // Selects birthday from dropdown menu
    public void selectDay(String day) {
        driver.findElement(dayDropdown).sendKeys(day);
    }

    // Selects birth month from dropdown menu
    public void selectMonth(String month) {
        driver.findElement(monthDropdown).sendKeys(month);
    }

    // Selects birth year from dropdown menu
    public void selectYear(String year) {
        driver.findElement(yearDropdown).sendKeys(year);
    }

    // Selects newsletter checkbox
    public void clickNewsletterCheckbox() {
        driver.findElement(newsletterCheckbox).click();
    }

    // Inserts first name
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    // Inserts last name
    public void enterLastName(String lastName) {

        driver.findElement(lastNameField).sendKeys(lastName);
    }

    // Inserts company name
    public void enterCompany(String company) {
        driver.findElement(companyField).sendKeys(company);
    }

    // Inserts address
    public void enterAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    // Selects country from dropdown
    public void selectCountry(String country) {
        driver.findElement(countryDropdown).sendKeys(country);
    }

    // Inserts state
    public void enterState(String state) {
        driver.findElement(stateField).sendKeys(state);
    }

    // Inserts city
    public void enterCity(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    // Inserts zipcode
    public void enterZipcode(String zipcode) {
        driver.findElement(zipcodeField).sendKeys(zipcode);
    }

    // Inserts mobile number
    public void enterMobileNumber(String mobileNumber) {
        driver.findElement(mobileNumberField).sendKeys(mobileNumber);
    }

    // Clicks Create Account button
    public void clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
    }

}