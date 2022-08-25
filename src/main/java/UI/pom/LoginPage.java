package UI.pom;

import dataProviders.ConfigReader;
import UI.pom.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import UI.utils.Driver;

public class LoginPage extends BasePage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder=\"Login\"]")
    WebElement loginInputFieldElement;
    @FindBy(xpath = "//input[@placeholder=\"Password\"]")
    WebElement passwordInputFieldElement;
    @FindBy(xpath = "//input[@type=\"submit\"]")
    WebElement submitButtonElement;

    public LoginPage loadPage() {
        Driver.getDriver().get(ConfigReader.getProperty("uriUI"));
        return this;
    }

    private LoginPage inputLoginField() {
        helper.sendKeys(loginInputFieldElement, ConfigReader.getProperty("login"));
        return this;
    }

    private LoginPage inputPasswordField() {
        helper.sendKeys(passwordInputFieldElement, ConfigReader.getProperty("password"));
        return this;
    }

    private void clickSubmitButton() {
        helper.clickAndWait(submitButtonElement);
    }

    public void loginIntoTheSystem() {
        inputLoginField().inputPasswordField().clickSubmitButton();
    }
}
