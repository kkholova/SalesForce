package tests;

import models.Contacts;
import models.Leads;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LeadTest extends BaseTest{


    @Test(description = "Test that leads page is opened")
    public void createNewLead() {
        loginPage.open()
                .login(USER, PASSWORD);
        boolean isOpened = leadsPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Leads page wasn't opened");
    }

    @Test(description = "Test that new lead was created")
    public void newLeadIsCreated() {
        loginPage
                .open()
                .login(USER, PASSWORD);
        Leads lead = new Leads("New","39393939","Ms.","Kate","Kholova","Indi","sasha@mail.ru",
                "PO","Hot","Street","onliner.by","Minsk","Minsk","03934800","Belarus","500",
                "Employee Referral","75","Banking","description");
        leadsPage
                .open()
                .clickNew()
                .create(lead);
        leadsModal.save();
        assertTrue(leadsPage.leadIsCreated(lead.getSalutation()+" "+lead.getFirstName()+" "+lead.getLastName()), "Contact wasn't created");
    }

    @Test(description = "Test that data in new lead is correct")
    public void newLeadContainsCorrectData() {
        loginPage
                .open()
                .login(USER, PASSWORD);
        Leads lead = new Leads("New","39393939","Mr.","Sasha","Kholov","Indi","sasha@mail.ru",
                "PO","Hot","Street","onliner.by","Minsk","Minsk","03934800","Belarus","500",
                "Employee Referral","75","Banking","description");
        leadsPage
                .open()
                .clickNew()
                .create(lead);
        leadsModal.save();
       leadDetailsPage.validateLead(lead);
    }

    @Test(description = "Test for new lead to go through all statuses")
    public void newLeadShouldGoToConvertedStatus() throws InterruptedException {
        loginPage
                .open()
                .login(USER, PASSWORD);
        Leads lead = new Leads("New","39393939","Mr.","Sasha","Kholov","Indi","sasha@mail.ru",
                "PO","Hot","Street","onliner.by","Minsk","Minsk","03934800","Belarus","500",
                "Employee Referral","75","Banking","description");
        leadsPage
                .open()
                .clickNew()
                .create(lead);
        leadsModal.save();
        convertLeadModal.clickOnStatusCompleteButton();
        boolean isOpened = convertLeadModal
                               .isPageOpened();
        assertTrue(isOpened, "Modal for lead convertation wasn't opened");
        convertLeadModal.convertLead();

        boolean isLeadConverted = convertLeadModal
                            .isLeadConverted();
        assertTrue(isLeadConverted, "Lead wasn't converted");
        convertLeadModal.goToLeads();

    }

}
