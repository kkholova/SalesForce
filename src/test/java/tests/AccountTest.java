package tests;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {
    @Test(description = "Account page is opened successfully")
    public void accountsPageOpenedSuccessfully() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Страница логина не открылась");
        loginPage
                .login(USER, PASSWORD)
                .isPageOpened();
        assertTrue(isOpened, "Home Page не открылась");
    }

    @Test(description = "Test that new contact was created")
    public void newAccountIsCreated() {
        loginPage
                .open()
                .login(USER, PASSWORD);
        Account account = new Account("Vlad", "+39339494", "tut.by", "+484848484", "Analyst",
                "Apparel", "100", "50", "description", "Billing St.", "shipping St.",
                "Minsk", "Minsk", "Rio", "Rio", "338838", "Belarus", "039393",
                "Brasil");
        accountListPage
                .open()
                .clickNew()
                .create(account);
        accountModal.save();
//        accountDetailsPage.openDetailsTab()
//                .validateAccount(account);
        assertTrue(accountListPage.accountIsCreated("Vlad"), "Account wasn't created");
//        accountListPage.createNewAccount();
//        accountListPage.fillInNewAccountForm();
    }

    @Test(description = "Test that new account contain correct data")
    public void dataInCreatedAccountIsCorrect() {
        loginPage
                .open()
                .login(USER, PASSWORD);
        Account account = new Account("James", "+3933949566654", "tut.by", "+484848484", "Analyst",
                "Apparel", "100", "50", "description", "Billing St.", "shipping St.",
                "Minsk", "Minsk", "Rio", "Rio", "338838", "Belarus", "039393",
                "Brasil");
        accountListPage
                .open()
                .clickNew()
                .create(account);
        accountModal.save();
//        accountDetailsPage.openDetailsTab();
        accountDetailsPage.validateAccount(account);
    }
}




