package API.methods;

import API.apihelper.APIHelperBearerSon;
import dataProviders.URI;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;

public class GetOtherPlayerCredentialsSteps {
    public Response getBodyOfRequestOtherPlayerStepsResponse() {
        return APIHelperBearerSon.preRequestBearerSON(URI.PLAYERS.auth)
                .request(Method.GET, "/1");
    }

    public String getBodyOfRequestPlayer() {
        return getBodyOfRequestOtherPlayerStepsResponse()
                .getBody().asPrettyString();
    }

    public int getStatusCodeOfRequestPlayer() {
        return getBodyOfRequestOtherPlayerStepsResponse().getStatusCode();
    }
}
