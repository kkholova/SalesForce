package tests;

import models.Account;
import models.Contacts;
import models.ContactsFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactTest extends BaseTest {

    @Test(description = "Test that contacts page is opened")
    public void newContactPageShouldOpen() {
        loginPage.open()
                .login(USER, PASSWORD);
        contactsPage.open();
        accountListPage.clickOnAccountInMenu();
        contactsPage.clickOnContactsInMenu();
        boolean isOpened = contactsPage
                .isPageOpened();
        assertTrue(isOpened, "Contacts не открылась");
    }


    @Test(description = "Test that new contact was created")
    public void newContactIsCreated() {
        loginPage
                .open()
                .login(USER, PASSWORD);
        Contacts contact= ContactsFactory.get();
        contactsPage
                .open()
                .clickNew()
                .create(contact);
        contactsModal.save();
//        accountDetailsPage.openDetailsTab()
//                .validateAccount(account);
        assertTrue(contactsPage.contactIsCreated(contact.getFirstName()+" "+contact.getLastName()), "Contact wasn't created");
    }

    @Test(description = "Test that new contact contain correct data")
    public void dataInNewContactIsCorrect() {
        loginPage
                .open()
                .login(USER, PASSWORD);
        Contacts contact= ContactsFactory.get();
        contactsPage
                .open()
                .clickNew()
                .create(contact);
        contactsModal.save();
        contactDetailPage.validateContact(contact);

    }
}
