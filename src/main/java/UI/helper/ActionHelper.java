package UI.helper;

import UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionHelper {
    public Actions setUp() {
        return new Actions(Driver.getDriver());
    }
    public void moveToElement(WebElement element) {
        setUp().moveToElement(element);
    }
    public void scroll() {
        Actions actions = new Actions(Driver.getDriver());
    }
}
