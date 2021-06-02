package elements.uiInput;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class TextArea {
    WebDriver driver;
    String label;
    String inputLocator = "//*[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//textarea";

    public TextArea(WebDriver driver,String label){
        this.driver = driver;
        this.label = label;
    }

    @Step("Fill Input fields with data: {text}")
    public void write(String text){
        log.info(String.format("Fill in a field %s, with text %s, by locator%s", label,text,inputLocator));
        driver.findElement(By.xpath(String.format(inputLocator,label))).sendKeys(text);
    }


}
