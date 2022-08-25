package UI.helper;

import UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectHelper {
    private Select setUp(WebElement element) {
        return new Select(element);
    }

    public void selectByValue(WebElement element, String value) {
        setUp(element).selectByValue(value);
    }
}
