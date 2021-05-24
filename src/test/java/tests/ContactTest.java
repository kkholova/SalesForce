package tests;

import models.Account;
import models.Contacts;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactTest extends BaseTest {

    @Test
    public void createNewContact() {
        loginPage.open()
                .login(USER, PASSWORD);
        boolean isOpened = contactsPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Contacts не открылась");
    }


    @Test
    public void newContactIsCreated() {
        loginPage
                .open()
                .login(USER, PASSWORD);
        Contacts contact= new Contacts("33838388","3939393939","Ms.", "John","Black",
                "dhdh@gsggs","Paul","BA","Star","MailingStreet","OtherStreet","Minsk",
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
//        assertTrue(contactsPage.contactIsCreated("Black"), "Contact wasn't created");
    }
}
