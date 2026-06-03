package Base;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public HomePage homePage;
    public LoginPage loginPage;
    public SignupPage signupPage;
    public ProductsPage productsPage;
    public CartPage cartPage;

    @BeforeMethod
    public void setUp() {

        // ChromeDriver initialization
        driver = new ChromeDriver();
        // Maximize browser window for better element visibility
        driver.manage().window().maximize();
        // Setting explicit and implicit waits
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Navigate to Automation Exercise application
        driver.get("https://automationexercise.com/");

        // Initialize page objects
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        signupPage = new SignupPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        //Closing up browser after finishing each test
        driver.quit();
    }
}