package tests;

import models.Account;
import models.Contacts;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactTest extends BaseTest {

    @Test(description = "Test that contacts page is opened")
    public void newContactPageShouldOpen() {
        loginPage.open()
                .login(USER, PASSWORD);
        boolean isOpened = contactsPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Contacts не открылась");
    }


    @Test(description = "Test that new contact was created")
    public void newContactIsCreated() {
        loginPage
                .open()
                .login(USER, PASSWORD);
        Contacts contact= new Contacts("33838388","3939393939","Ms.", "John","Black",
                "dhdh@gsggs.ru","TestText","BA","Star","MailingStreet","OtherStreet","Minsk",
                "Minsk","Grodno","Grodno","39939","Belarus","39393","UK",
                "303030","ProductStream","9393939","3303003","Advertisement","5/11/2002","3939393","Carry",
                "description");
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
        Contacts contact= new Contacts("33838388","(393) 939-3939","Ms.", "John","Black",
                "dhdh@gsggs.ru","James","BA","Star","MailingStreet","OtherStreet","Minsk",
                "Minsk","Grodno","Grodno","39939","Belarus","39393","UK",
                "303030","ProductStream","9393939","3303003","Advertisement","5/11/2002","3939393","Carry",
                "description");
        contactsPage
                .open()
                .clickNew()
                .create(contact);
        contactsModal.save();
        contactDetailPage.validateContact(contact);

    }
}
