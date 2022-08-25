package UIAPI.stepDefinitions.UI;

import UI.utils.Driver;
import UIAPI.stepDefinitions.UI.base.BaseSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UITestSteps extends BaseSteps {
    @Given("login into the system")
    public void login_into_the_system() {
        loginPage.loadPage();
        loginPage.loginIntoTheSystem();
    }

    @Then("user should see {string} header")
    public void user_should_see_header(String string) {
        Assertions.assertEquals(string, majorPage.getHeaderValue());
    }

    @Then("user clicked on the side menu Users button")
    public void user_clicked_on_the_side_menu_users_button() {
        majorPage.clickUserSideButton();
    }

    @Then("appear new side menu's values and clicked player button")
    public void appear_new_side_menu_s_values_and_clicked_player_button() {
        majorPage.clickPlayerButton();
    }

    @Then("should appear new table with credentials of Players")
    public void should_appear_new_table_with_credentials_of_players() {
        Assertions.assertEquals("Create player", majorPage.getCreatePlayerValue());
    }

    @When("user sorted players by amount on page and select {int}")
    public void user_sorted_players_by_amount_on_page_and_select(Integer amountOfPlayers) {
        majorPage.selectSizePlayers(String.valueOf(amountOfPlayers));
    }

    @Then("user should see {int} players on page")
    public void user_should_see_players_on_page(Integer amountOfPlayers) {
        Assertions.assertEquals(amountOfPlayers, majorPage.getAmountOfPlayersOnPage());
    }
}
