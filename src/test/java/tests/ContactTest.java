package tests;

import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    @Test
    public void createNewContact(){

        loginPage.open();
        loginPage.login(USER, PASSWORD);

    }
}
