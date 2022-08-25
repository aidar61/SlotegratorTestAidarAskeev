package UIAPI.stepDefinitions.API;

import UIAPI.stepDefinitions.API.base.BaseSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class ClientCredentialsStepDefs extends BaseSteps {
    @Given("perform POST method to get bearerToken")
    public void perform_post_method_to_get_bearer_token() {
        clientCredentialsSteps.performPOSTToGetBearerToken();
    }

    @Then("bearerToken and status code {int} is returned")
    public void bearer_token_and_status_code_is_returned(Integer statusCode) {
        MatcherAssert.assertThat(clientCredentialsSteps.checkStatusCode(), Matchers.is(statusCode));
    }
}
