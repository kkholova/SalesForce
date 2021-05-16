package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountListPage extends BasePage{
    public static final By NEW_ACCOUNT_BUTTON = By.cssSelector("[title=New]");
    public static final By SAVE_NEW_ACCOUNT_BUTTON = By.cssSelector("[title=Save]");
    String fillInFields = "//span[contains(text(),'%s')]//ancestor::label[@data-aura-class='uiLabel']//following-sibling::*";
    String fillInAccountName = "//span[contains(text(),'%s')]//ancestor::div[@class='slds-form-element__control']//child::input";
    String dropDownFields = "//span[contains(text(),'%s')]//ancestor::div[@class='slds-form-element__control']//child::a";
    By ICON = By.cssSelector("img[title=Accounts]");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(ICON);
    }

    public AccountListPage open(){
        driver.get(BASE_URL + "/lightning/o/Account/list?filterName=Recent");
        return this;
    }

    public void createNewAccount(){
        driver.findElement(NEW_ACCOUNT_BUTTON).click();
    }

    public void fillInAField(String fieldName){
        driver.findElement(By.xpath(String.format(fillInFields, fieldName))).sendKeys("TestText");

    }

    public void fillInAccountName(String fieldName){
        driver.findElement(By.xpath(String.format(fillInAccountName, fieldName))).sendKeys("TestText");
    }

//    public void dropDowns(String fieldName){
//        driver.findElement(By.xpath(String.format(dropDownFields, fieldName))).click();
//        List<WebElement> allOptions = driver.findElement(By.cssSelector("li"));
//
//    }

    public void fillInNewAccountForm(){
        fillInAccountName("Account Name");
        fillInAField("Phone");
        fillInAField("Fax");
        fillInAField("Website");
//        selectDropDowns("Type");
        fillInAField("Employees");//should be numeric
//        selectDropDowns("Industry");
        fillInAField("Annual Revenue");//should be numeric
        fillInAField("Description");
        fillInAField("Billing Street");
        fillInAField("Shipping Street");
        fillInAField("Billing City");
        fillInAField("Billing State/Province");
        fillInAField("Shipping City");
        fillInAField("Shipping State/Province");
        fillInAField("Billing Zip/Postal Code");
        fillInAField("Billing Country");
        fillInAField("Shipping Zip/Postal Code");
        fillInAField("Shipping Country");
        driver.findElement(SAVE_NEW_ACCOUNT_BUTTON).click();
    }
}
