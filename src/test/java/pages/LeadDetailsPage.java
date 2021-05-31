package pages;

import models.Leads;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LeadDetailsPage extends BasePage{
    public static final By DETAILS_TAB= By.cssSelector("a[data-label = 'Details']");

    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return false;
    }

    public LeadDetailsPage openDetailsTab(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(DETAILS_TAB));
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public void validateLead(Leads lead){
        validateInput("Lead Status", lead.getLeadStatus());
        validateInput("Name", String.format(lead.getSalutation()+" "+lead.getFirstName()+" "+lead.getLastName()));
        validateInput("Phone", lead.getPhone());
        validateInput("Company", lead.getCompany());
        validateInput("Email", lead.getEmail());
        validateInput("Title", lead.getTitle());
        validateInput("Rating", lead.getRating());
        validateInput("Address", String.format("%s\n%s, %s %s\n%s", lead.getStreet(),lead.getCity(),lead.getState(),
                lead.getZip(),lead.getCountry()));
        validateInput("Website", lead.getWebsite());
        validateInput("No. of Employees", lead.getNumberOfEmployees());
        validateInput("Lead Source", lead.getLeadSource());
        validateInput("Annual Revenue", String.format("$"+lead.getAnnualRevenue()));
        validateInput("Industry", lead.getIndustry());
        validateInput("Description", lead.getDescription());

    }

    public void validateStatusChange(){

    }
}
