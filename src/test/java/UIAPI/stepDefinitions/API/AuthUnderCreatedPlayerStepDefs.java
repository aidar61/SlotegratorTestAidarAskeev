package UIAPI.stepDefinitions.API;

import UIAPI.stepDefinitions.API.base.BaseSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class AuthUnderCreatedPlayerStepDefs extends BaseSteps {
    int statusCodeActual;

    @Given("perform POST method to authorization under created player with savedMockData")
    public void perform_post_method_to_authorization_under_created_player_with_saved_mock_data() {
        statusCodeActual = getBearerTokenOfCreatedPlayerSteps.performPostMethodToAuthAndGetToken();
    }

    @Then("players refresh and access tokens with status code {int} is returned")
    public void players_refresh_and_access_tokens_with_status_code_is_returned(Integer statusCode) {
        MatcherAssert.assertThat(statusCodeActual, Matchers.is(statusCode));
    }
}
