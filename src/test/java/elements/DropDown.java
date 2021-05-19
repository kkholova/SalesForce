package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    WebDriver driver;
    String label;
    String dropdownLocator = "//*[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//a";
    String optionLocator = "//*[contains(@class,'uiMenuList')and contains(@class,'visible')]//a[@title='%s']";

    public DropDown(WebDriver driver,String label){
        this.driver = driver;
        this.label = label;
    }

    public void select(String option){
        System.out.println(String.format("Selected option '%s' into dropdown '%s'",option,label));
        driver.findElement(By.xpath(String.format(dropdownLocator,label))).click();
        driver.findElement(By.xpath(String.format(optionLocator,option))).click();
    }
}
