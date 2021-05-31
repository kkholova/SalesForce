package elements.lightning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextAreaLightning {
    WebDriver driver;
    String label;
    String inputLocatorContacts = "//*[contains(@class,'modal-body')]//label[text()='%s']/ancestor::lightning-textarea//textarea";

    public TextAreaLightning(WebDriver driver,String label){
        this.driver = driver;
        this.label = label;
    }

    public void writeTextareaForLightningFiels(String text){
        System.out.println(String.format("Writing text '%s' into input with label '%s'",text,label));
        driver.findElement(By.xpath(String.format(inputLocatorContacts,label))).sendKeys(text);
    }
}
