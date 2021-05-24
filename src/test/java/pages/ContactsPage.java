package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactsPage extends BasePage {
    public static final By NEW_CONTACT_BUTTON = By.cssSelector("[title=New]");
    String contactIsCreated = "//slot[@name = 'primaryField']//child::span[contains(text(),'%s')]";
    By ICON = By.cssSelector("img[title=Contacts]");
    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(ICON);
    }

    public ContactsPage open(){
        driver.get(BASE_URL + "/lightning/o/Contact/list?filterName=Recent");
        return this;
    }

    public ContactsModal clickNew() {
        driver.findElement(NEW_CONTACT_BUTTON).click();
        return new ContactsModal(driver);
    }
    public boolean contactIsCreated(String contactLastName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(contactIsCreated,contactLastName))));
        return driver.findElement(By.xpath(String.format(contactIsCreated,contactLastName))).isDisplayed();

    }

}
