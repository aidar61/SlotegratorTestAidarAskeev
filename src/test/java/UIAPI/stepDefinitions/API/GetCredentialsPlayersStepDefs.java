package UIAPI.stepDefinitions.API;

import UIAPI.stepDefinitions.API.base.BaseSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class GetCredentialsPlayersStepDefs extends BaseSteps {
    int statusCodeActual;

    @Given("perform GET method with the taken player's bearer token and get credentials")
    public void perform_get_method_with_the_taken_player_s_bearer_token_and_get_credentials() {
        statusCodeActual = credentialsPlayersSteps.getStatusCodeOfResourceRequest();

    }

    @Then("new player credentials and status code {int} is returned")
    public void new_player_credentials_and_status_code_is_returned(Integer statusCode) {
        MatcherAssert.assertThat(statusCodeActual, Matchers.is(statusCode));
    }

}
