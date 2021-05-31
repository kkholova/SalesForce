package elements.lightning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownLightning {
    WebDriver driver;
    String label;
    String dropdownLocatorForLightning = "//*[contains(@class,'modal-body')]//label[text()='%s']/ancestor::lightning-combobox//input";
    String optionLocatorForLightning = "//*[contains(@role,'option')]//span[@title='%s']";
    String searchFieldsForLightning = "//*[contains(@class,'modal-body')]//label[text()='%s']/ancestor::slot[contains(@name, 'inputField')]//input";

    public DropDownLightning(WebDriver driver, String label){
        this.driver = driver;
        this.label = label;
    }

    public void selectForNewLightningField(String option){
        System.out.println(String.format("Selected option '%s' into dropdown '%s'",option,label));
        driver.findElement(By.xpath(String.format(dropdownLocatorForLightning,label))).click();
        driver.findElement(By.xpath(String.format(optionLocatorForLightning,option))).click();
    }

    public void selectForNewSearchLightningFields(String option){
        System.out.println(String.format("Selected option '%s' into dropdown '%s'",option,label));
        driver.findElement(By.xpath(String.format(searchFieldsForLightning,label))).click();
        driver.findElement(By.xpath(String.format(optionLocatorForLightning,option))).click();
    }

}
