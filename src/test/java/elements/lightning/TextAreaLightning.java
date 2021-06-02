package elements.lightning;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class TextAreaLightning {
    WebDriver driver;
    String label;
    String inputLocatorLightning = "//*[contains(@class,'modal-body')]//label[text()='%s']/ancestor::lightning-textarea//textarea";

    public TextAreaLightning(WebDriver driver,String label){
        this.driver = driver;
        this.label = label;
    }

    @Step("Fill Input fields with data: {text}")
    public void writeTextareaForLightningFiels(String text){
        log.info(String.format("Fill in a field %s, with text %s, by locator%s", label,text,inputLocatorLightning));
        driver.findElement(By.xpath(String.format(inputLocatorLightning,label))).sendKeys(text);
    }
}
