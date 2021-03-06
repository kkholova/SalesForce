package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;
import tests.base.TestListener;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public abstract class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    LoginPage loginPage;
    HomePage homePage;
    AccountListPage accountListPage;
    ContactsPage contactsPage;
    AccountDetailsPage accountDetailsPage;
    AccountModal accountModal;
    ContactsModal contactsModal;
    ContactDetailPage contactDetailPage;
    LeadsPage leadsPage;
    LeadsModal leadsModal;
    LeadDetailsPage leadDetailsPage;
    ConvertLeadModal convertLeadModal;
    public static String USER ="katekholova-48yh@force.com";
    public static String PASSWORD="KKKkkk!80297571255";

    @Parameters({"browser"})
    @BeforeMethod(description = "Open browser")
    public void setUp(@Optional("chrome") String browser, ITestContext testContext){
        if(browser.equals(("chrome"))) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
        } else if (browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        testContext.setAttribute("driver", driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//неявные ожидания
        wait = new WebDriverWait(driver,25);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        contactsPage = new ContactsPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        accountModal = new AccountModal(driver);
        contactsModal = new ContactsModal(driver);
        contactDetailPage = new ContactDetailPage(driver);
        leadsPage = new LeadsPage(driver);
        leadsModal = new LeadsModal(driver);
        leadDetailsPage = new LeadDetailsPage(driver);
        convertLeadModal = new ConvertLeadModal(driver);
    }


    @AfterMethod(alwaysRun = true,description = "Close browser")
    public void tearDown() {
        driver.quit();
    }


}
