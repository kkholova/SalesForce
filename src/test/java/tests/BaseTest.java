package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    LoginPage loginPage;
    HomePage homePage;
    AccountListPage accountListPage;
    ContactsPage contactsPage;
    AccountDetailsPage accountDetailsPage;
    AccountModal accountModal;
    public static final String USER ="katekholova-6aca@force.com";
    public static final String PASSWORD ="Kk7571255";

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//неявные ожидания
        wait = new WebDriverWait(driver,20);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        contactsPage = new ContactsPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        accountModal = new AccountModal(driver);
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }


}
