package UI.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import UI.utils.Driver;

import java.time.Duration;

public class Helper {
    public Helper waitToBeVisible(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public Helper waitToBeClickable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public void waitElement(WebElement element) {
        waitToBeVisible(element).waitToBeClickable(element);
    }

    public void clickAndWait(WebElement element) {
        waitElement(element);
        element.click();
    }

    public void sendKeys(WebElement element, String str) {
        waitElement(element);
        element.sendKeys(str);
    }

    public String getAttribute(WebElement element, String value) {
        waitToBeVisible(element);
        return element.getAttribute(value);
    }

    public String getText(WebElement element) {
        waitToBeVisible(element);
        return element.getText();
    }
}
