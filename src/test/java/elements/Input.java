package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    String inputLocator = "//*[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input";
    String inputLocatorContacts = "//*[contains(@class,'modal-body')]//label[text()='%s']/ancestor::lightning-input//input";

    public Input(WebDriver driver,String label){
        this.driver = driver;
        this.label = label;
    }

    public void write(String text){
        System.out.println(String.format("Writing text '%s' into input with label '%s'",text,label));
        driver.findElement(By.xpath(String.format(inputLocator,label))).sendKeys(text);
    }
    public void writeContact(String text){
        System.out.println(String.format("Writing text '%s' into input with label '%s'",text,label));
        driver.findElement(By.xpath(String.format(inputLocatorContacts,label))).sendKeys(text);
    }
}
