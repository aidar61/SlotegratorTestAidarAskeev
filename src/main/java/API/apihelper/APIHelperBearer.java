package API.apihelper;

import com.fasterxml.jackson.core.JsonProcessingException;
import dataProviders.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;
import API.pojo.Client;

public class APIHelperBearer {
    private static RequestSpecification authBearer(String endPoint) {
        try {
            return RestAssured.given()
                    .header(new Header("Authorization", "Bearer " + Client.getBearerToken()))
                    .baseUri(ConfigReader.getProperty("uri"))
                    .basePath(endPoint);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static RequestSpecification preRequestBearer(String endPoint) {
        return authBearer(endPoint)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON);
    }
}
