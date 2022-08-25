package UIAPI.stepDefinitions.API;

import UIAPI.stepDefinitions.API.base.BaseSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class CreatePlayerStepDefs extends BaseSteps {
    @Given("perform POST method to create new player with mock Data")
    public void perform_post_method_to_create_new_player_with_mock_data() {
        createPlayerSteps.performPOSTToCreatePlayerWithMockData();
    }

    @Then("status code {int} is returned")
    public void status_code_is_returned(Integer statusCode) {
        MatcherAssert.assertThat(createPlayerSteps.checkStatusCode(), Matchers.is(statusCode));
    }

}
