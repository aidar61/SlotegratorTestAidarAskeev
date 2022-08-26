package API.apihelper;

import API.pojo.Client;
import API.pojo.CreatedPlayer;
import com.fasterxml.jackson.core.JsonProcessingException;
import dataProviders.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIHelperBearerSon {
    private static RequestSpecification authBearerSON(String endpoint) {
        try {
            return RestAssured.given()
                    .header(new Header("Authorization", "Bearer " + CreatedPlayer.getBearerTokenPlayer()))
                    .baseUri(ConfigReader.getProperty("uri"))
                    .basePath(endpoint);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static RequestSpecification preRequestBearerSON(String endpoint) {
        return authBearerSON(endpoint)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON);
    }

}
