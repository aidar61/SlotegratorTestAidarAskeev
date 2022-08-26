package API.methods;

import API.apihelper.APIHelperBearerSon;
import dataProviders.URI;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.junit.Test;

public class GetCredentialsPlayersSteps {


    public Response getJsonBodyResponse() {
        return APIHelperBearerSon.preRequestBearerSON(URI.PLAYERS.auth)
                .request(Method.GET);
    }

    public int getStatusCodeOfResourceRequest() {
        return getJsonBodyResponse().getStatusCode();
    }

}
