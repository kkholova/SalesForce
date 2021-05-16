package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest{
    @Test
    public void openAccountsPage(){
        loginPage.open();
        loginPage.login(USER,PASSWORD);
//        driver.findElement(By.cssSelector("[title = Accounts]")).click();
        accountListPage.open();
        accountListPage.createNewAccount();
        accountListPage.fillInNewAccountForm();
    }

}
