package pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountDetailsPage extends BasePage {
    public static final By DETAILS_TAB= By.cssSelector("a[data-label = 'Details']");

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }
//TODO implement
    @Override
    public boolean isPageOpened() {
        return false;
    }

    public AccountDetailsPage openDetailsTab(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(DETAILS_TAB));
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public void validateAccount(Account account){
        validateInput("Account Name", account.getAccountName());
        validateInput("Website", account.getWebsite());
        validateInput("Phone", account.getPhone());
        validateInput("Fax", account.getFax());
        validateInput("Type", account.getOption());
        validateInput("Industry", account.getIndustry());
        validateInput("Employees", account.getEmployees());
        validateInput("Annual Revenue", account.getAnnualRevenue());
        validateInput("Description", account.getDescription());
        validateInput("Billing Street", account.getBillingStreet());
        validateInput("Shipping Street", account.getShippingStreet());
        validateInput("Billing City", account.getBillingCity());
        validateInput("Billing State/Province", account.getBillingState());
        validateInput("Shipping City", account.getShippingCity());
        validateInput("Shipping State/Province", account.getShippingState());
        validateInput("Billing Zip/Postal Code", account.getBillingZip());
        validateInput("Billing Country", account.getBillingCountry());
        validateInput("Shipping Zip/Postal Code", account.getShippingZip());
        validateInput("Shipping Country", account.getShippingCountry());

    }
}
