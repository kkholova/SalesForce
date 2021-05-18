package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class AccountListPage extends BasePage {
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

    public void fillInAField(String fieldName){
        if(fieldName.equals("Account Name")){
            driver.findElement(By.xpath(String.format(fillInAccountName, fieldName))).sendKeys("TestText");
        } else if(fieldName.equals("Employees")||fieldName.equals("Annual Revenue")) {
            driver.findElement(By.xpath(String.format(fillInFields, fieldName))).sendKeys("123456");
        } else{
            driver.findElement(By.xpath(String.format(fillInFields, fieldName))).sendKeys("TestText");
        }

    }
    public void createNewAccount(){
        driver.findElement(NEW_ACCOUNT_BUTTON).click();
    }


//    public void dropDowns(String fieldName){
//        driver.findElement(By.xpath(String.format(dropDownFields, fieldName))).click();
//        List<WebElement> allOptions = driver.findElement(By.cssSelector("li"));
//
//    }

//    public void chooseASection(int index){
//        List<WebElement> allContextBar = driver.findElements(By.cssSelector("[data-id]"));
//        allContextBar.get(index).click();
//    }

    public void fillInNewAccountForm(){
        fillInAField("Account Name");
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

    public boolean accountIsCreated(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//slot[@name = 'primaryField']//child::span[contains(text(),'TestText')]")));
        return driver.findElement(By.xpath("//slot[@name = 'primaryField']//child::span[contains(text(),'TestText')]")).isDisplayed();

    }
}
