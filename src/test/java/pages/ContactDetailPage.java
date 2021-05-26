package pages;


import models.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

 public class ContactDetailPage extends BasePage {
    public static final By DETAILS_TAB= By.cssSelector("a[data-label = 'Details']");

    public ContactDetailPage(WebDriver driver) {
        super(driver);
    }

    //TODO implement
    @Override
    public boolean isPageOpened() {
        return false;
    }

    public ContactDetailPage openDetailsTab(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(DETAILS_TAB));
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public void validateContact(Contacts contact){
        validateInput("Name", String.format(contact.getSalutation()+" "+contact.getFirstName()+" "+contact.getLastName()));
        validateInput("Account Name", String.format("%s\n%s %s %s",contact.getAccountName(),"Open",contact.getAccountName(),"Preview"));
        validateInput("Title", contact.getTitle());
        validateInput("Phone", contact.getPhone());
        validateInput("Mobile", contact.getMobile());
        validateInput("Email", contact.getEmail());
        validateInput("Reports To", String.format("%s\n%s %s %s",contact.getReportsTo(),"Open",contact.getReportsTo(),"Preview"));
        validateInput("Mailing Address", String.format("%s\n%s, %s %s\n%s", contact.getMailingStreet(),contact.getMailingCity(),contact.getMailingState(),
                contact.getMailingZip(),contact.getMailingCountry()));
        validateInput("Other Address", String.format("%s\n%s, %s %s\n%s", contact.getOtherStreet(),contact.getOtherCity(),contact.getOtherState(),
                contact.getOtherZip(),contact.getOtherCountry()));
        validateInput("Fax", contact.getFax());
        validateInput("Home Phone", contact.getHomePhone());
        validateInput("Other Phone", contact.getOtherPhone());
        validateInput("Asst. Phone", contact.getAsstPhone());
        validateInput("Assistant", contact.getAssistant());
        validateInput("Description", contact.getDescription());
        validateInput("Department", contact.getDepartment());
        validateInput("Lead Source", contact.getLeadSource());
        validateInput("Department", contact.getDepartment());
        validateInput("Birthdate", contact.getBirthdate());

    }
}


