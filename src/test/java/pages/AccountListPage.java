package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

@Log4j2
public class AccountListPage extends BasePage {
    public static final By NEW_ACCOUNT_BUTTON = By.cssSelector("[title=New]");
    public static final By MENU_ACCOUNT = By.xpath("//*[@data-id = 'Account']");
    String accountIsCreated = "//slot[@name = 'primaryField']//child::span[contains(text(),'%s')]";
//    public static final By SAVE_NEW_ACCOUNT_BUTTON = By.cssSelector("[title=Save]");
//    String fillInFields = "//span[contains(text(),'%s')]//ancestor::label[@data-aura-class='uiLabel']//following-sibling::*";
//    String fillInAccountName = "//span[contains(text(),'%s')]//ancestor::div[@class='slds-form-element__control']//child::input";
//    String dropDownFields = "//span[contains(text(),'%s')]//ancestor::div[@class='slds-form-element__control']//child::a";


    By ICON = By.cssSelector("img[title=Accounts]");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(ICON);
    }


    public AccountListPage open(){
        driver.get(BASE_URL + "lightning/o/Account/list?filterName=Recent");
        return this;
    }

    @Step("Click on new account form creation button")
    public AccountModal clickNew() {
        log.info("Click on new account creation button");
        driver.findElement(NEW_ACCOUNT_BUTTON).click();
        return new AccountModal(driver);
    }

    public boolean accountIsCreated(String accountName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(accountIsCreated,accountName))));
        return driver.findElement(By.xpath(String.format(accountIsCreated, accountName))).isDisplayed();

    }

    public void clickOnAccountInMenu(){
        driver.findElement(MENU_ACCOUNT).click();
    }

//    public void fillInAField(String fieldName){
//        if(fieldName.equals("Account Name")){
//            driver.findElement(By.xpath(String.format(fillInAccountName, fieldName))).sendKeys("TestText");
//        } else if(fieldName.equals("Employees")||fieldName.equals("Annual Revenue")) {
//            driver.findElement(By.xpath(String.format(fillInFields, fieldName))).sendKeys("123456");
//        } else{
//            driver.findElement(By.xpath(String.format(fillInFields, fieldName))).sendKeys("TestText");
//        }
//
//    }
//    public void createNewAccount(){
//        driver.findElement(NEW_ACCOUNT_BUTTON).click();
//    }




//    public void dropDowns(String fieldName){
//        driver.findElement(By.xpath(String.format(dropDownFields, fieldName))).click();
//        List<WebElement> allOptions = driver.findElement(By.cssSelector("li"));
//
//    }

//    public void chooseASection(int index){
//        ArrayList<WebElement> allContextBar = (ArrayList<WebElement>) driver.findElements(By.cssSelector("[data-id]"));
//        allContextBar.get(1).click();
//    }




}
