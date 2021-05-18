package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;


public abstract class BasePage {
    public static final String BASE_URL ="https://godel.my.salesforce.com";

    WebDriver driver;
    WebDriverWait wait;


    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,20);

    }
    public abstract boolean isPageOpened();

    public boolean isExist(By locator){
        try{
            driver.findElement(locator);
            return true;
        }catch(NoSuchElementException exception){
            System.out.println(exception.getMessage());
            return false;
        }

    }
// не понятно как сделать по красоте
//    TODO  concat for Billing and Shipping
    public void validateInput(String label, String expected){
        String locator = "//div[contains(@class,'active')]//span[text()='%s']/ancestor::force-record-layout-item//slot[@slot = 'outputField']";
        if(label.equals("Annual Revenue")){
            expected = "$"+expected;
            Assert.assertEquals(
                    driver.findElement(By.xpath(String.format(locator,label))).getText(),
                    expected,
                    "Input text is not correct");
        }else {
            Assert.assertEquals(
                    driver.findElement(By.xpath(String.format(locator, label))).getText(),
                    expected,
                    "Input text is not correct"
            );
        }
    }


}
