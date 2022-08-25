package UI.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import UI.pom.base.BasePage;
import UI.utils.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MajorPage extends BasePage {
    public MajorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@alt='Casino']")
    WebElement casinoHeader;
    @FindBy(xpath = "//span[text()='Users']")
    WebElement userSideMenuButtonHeader;
    @FindBy(xpath = "//a[@href=\"/user/player/admin\"]")
    WebElement playerButtonElement;
    @FindBy(xpath = "//a[@class='btn btn-info']")
    WebElement createPlayer;
    @FindBy(xpath = "//select[@name=\"pageSizePlayers\"]")
    WebElement selectPageSizeElement;

    By locatorOfTr = By.xpath("//tbody/tr");

    public String getHeaderValue() {
        return helper.getAttribute(casinoHeader, "alt");
    }

    public void clickUserSideButton() {
        helper.clickAndWait(userSideMenuButtonHeader);
    }

    public void clickPlayerButton() {
        helper.clickAndWait(playerButtonElement);
    }

    public String getCreatePlayerValue() {
        return helper.getText(createPlayer);
    }

    public void selectSizePlayers(String sizeOfPagePlayers) {
        actionHelper.moveToElement(selectPageSizeElement);
        selectHelper.selectByValue(selectPageSizeElement, sizeOfPagePlayers);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getAmountOfPlayersOnPage() {
        List<WebElement> list = Driver.getDriver().findElements(locatorOfTr);
        actionHelper.setUp().moveToElement(list.get(list.size() - 1));
        return list.size();
    }
}
