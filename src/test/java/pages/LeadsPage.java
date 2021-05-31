package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class LeadsPage extends BasePage {
    public static final By NEW_LEADS_BUTTON = By.cssSelector("[title=New]");
//    public static final By STATUS_COMPLETE_BUTTON = By.xpath("//button//span[text() = 'Mark Status as Complete']");
    String leadIsCreated = "//slot[@name = 'primaryField']//child::span[contains(text(),'%s')]";
    By ICON = By.xpath("img[title=Leads]");


    public LeadsPage(WebDriver driver) {
        super(driver);
    }


    public LeadsPage open() {
        driver.get(BASE_URL + "lightning/o/Lead/list?filterName=Recent");
        return this;
    }

    @Step("Open new contact form")
    public LeadsModal clickNew() {
        driver.findElement(NEW_LEADS_BUTTON).click();
        return new LeadsModal(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(ICON);
    }

    //TODO
    @Step("Check that contact is created")
    public boolean leadIsCreated(String contactLastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(leadIsCreated, contactLastName))));
        return driver.findElement(By.xpath(String.format(leadIsCreated, contactLastName))).isDisplayed();
    }




}
