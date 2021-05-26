package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactsModal extends BasePage{
    public static final By MODAL_TITLE = By.xpath("//h2[text() = 'New Contact']");
    public static final By SAVE_NEW_CONTACT_BUTTON = By.xpath("//button[contains(@name,'SaveEdit')]");

    public ContactsModal(WebDriver driver) {
        super(driver);
    }
    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }

    public void create (Contacts contact){
        new Input(driver, "Phone").writeContact(contact.getPhone());
        new Input(driver, "Mobile").writeContact(contact.getMobile());
        new DropDown(driver,"Salutation").selectForNewContact(contact.getSalutation());
        new Input(driver, "First Name").writeContact(contact.getFirstName());
        new Input(driver, "Last Name").writeContact(contact.getLastName());
        new DropDown(driver, "Account Name").selectForNewContactSearchFields(contact.getAccountName());
//        new DropDown(driver,"Industry").select(account.getIndustry());
        new Input(driver, "Email").writeContact(contact.getEmail());
        new Input(driver, "Title").writeContact(contact.getTitle());
        new DropDown(driver, "Reports To").selectForNewContactSearchFields(contact.getReportsTo());
        new TextArea(driver, "Mailing Street").writeTextareaForContacts(contact.getMailingStreet());
        new TextArea(driver, "Other Street").writeTextareaForContacts(contact.getOtherStreet());
        new Input(driver, "Mailing City").writeContact(contact.getMailingCity());
        new Input(driver, "Mailing State/Province").writeContact(contact.getMailingState());
        new Input(driver, "Mailing Zip/Postal Code").writeContact(contact.getMailingZip());
        new Input(driver, "Mailing Country").writeContact(contact.getMailingCountry());
        new Input(driver, "Other City").writeContact(contact.getOtherCity());
        new Input(driver, "Other State/Province").writeContact(contact.getOtherState());
        new Input(driver, "Other Zip/Postal Code").writeContact(contact.getOtherZip());
        new Input(driver, "Other Country").writeContact(contact.getOtherCountry());
        new Input(driver, "Fax").writeContact(contact.getFax());
        new Input(driver, "Home Phone").writeContact(contact.getHomePhone());
        new Input(driver, "Other Phone").writeContact(contact.getOtherPhone());
        new Input(driver, "Asst. Phone").writeContact(contact.getAsstPhone());
        new Input(driver, "Assistant").writeContact(contact.getAssistant());
        new Input(driver, "Department").writeContact(contact.getDepartment());
        new DropDown(driver,"Lead Source").selectForNewContact(contact.getLeadSource());
        new Input(driver,"Birthdate").writeContact(contact.getBirthdate());
        new TextArea(driver, "Description").writeTextareaForContacts(contact.getDescription());
    }


    public void save(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_NEW_CONTACT_BUTTON));
        driver.findElement(SAVE_NEW_CONTACT_BUTTON).click();
    }
}
