package pages;

import elements.lightning.DropDownLightning;
import elements.lightning.InputLightning;
import elements.lightning.TextAreaLightning;
import io.qameta.allure.Step;
import models.Leads;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LeadsModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text() = 'New Lead']");
    public static final By SAVE_NEW_LEAD_BUTTON = By.xpath("//button[contains(@name,'SaveEdit')]");

    public LeadsModal(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }

    @Step("Create new lead")
    public void create (Leads lead){
        new DropDownLightning(driver, "Lead Status").selectForNewLightningField(lead.getLeadStatus());
        new InputLightning(driver, "Phone").writeContactLightning(lead.getPhone());
        new DropDownLightning(driver,"Salutation").selectForNewLightningField(lead.getSalutation());
        new InputLightning(driver, "First Name").writeContactLightning(lead.getFirstName());
        new InputLightning(driver, "Last Name").writeContactLightning(lead.getLastName());
        new InputLightning(driver, "Company").writeContactLightning(lead.getCompany());
        new InputLightning(driver, "Email").writeContactLightning(lead.getEmail());
        new InputLightning(driver, "Title").writeContactLightning(lead.getTitle());
        new DropDownLightning(driver, "Rating").selectForNewSearchLightningFields(lead.getRating());
        new TextAreaLightning(driver, "Street").writeTextareaForLightningFiels(lead.getStreet());
        new InputLightning(driver, "Website").writeContactLightning(lead.getWebsite());
        new InputLightning(driver, "City").writeContactLightning(lead.getCity());
        new InputLightning(driver, "State/Province").writeContactLightning(lead.getState());
        new InputLightning(driver, "Zip/Postal Code").writeContactLightning(lead.getZip());
        new InputLightning(driver, "Country").writeContactLightning(lead.getCountry());
        new InputLightning(driver, "No. of Employees").writeContactLightning(lead.getNumberOfEmployees());
        new InputLightning(driver, "Annual Revenue").writeContactLightning(lead.getAnnualRevenue());
        new DropDownLightning(driver,"Lead Source").selectForNewLightningField(lead.getLeadSource());
        new DropDownLightning(driver,"Industry").selectForNewLightningField(lead.getIndustry());
        new TextAreaLightning(driver, "Description").writeTextareaForLightningFiels(lead.getDescription());
    }

    @Step("Click on save new Lead button")
    public void save(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_NEW_LEAD_BUTTON));
        driver.findElement(SAVE_NEW_LEAD_BUTTON).click();
    }

}
