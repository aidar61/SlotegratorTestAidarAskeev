package UIAPI.stepDefinitions.API;

import UIAPI.stepDefinitions.API.base.BaseSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class GetOtherPlayerCredentialsStepDefs extends BaseSteps {
    int statusCodeActual;

    @Given("perform GET method with player's token and get other player credentials")
    public void perform_get_method_with_player_s_token_and_get_other_player_credentials() {
        statusCodeActual = getOtherPlayerCredentialsSteps.getStatusCodeOfRequestPlayer();
    }

    @Then("status code {int} is returned with following body")
    public void status_code_is_returned_with_following_body(Integer statusCode) {
        MatcherAssert.assertThat(statusCodeActual, Matchers.is(statusCode));
    }

}
