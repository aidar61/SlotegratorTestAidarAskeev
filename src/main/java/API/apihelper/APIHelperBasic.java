package API.apihelper;

import dataProviders.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;

public class APIHelperBasic {
    private static RequestSpecification authBasic(String endPoint) {
        return RestAssured.given()
                .header(new Header("Authorization"
                        , "Basic ZnJvbnRfMmQ2YjBhODM5MTc0MmY1ZDc4OWQ3ZDkxNTc1NWUwOWU6"))
                .baseUri(ConfigReader.getProperty("uri"))
                .basePath(endPoint);
    }

    public static RequestSpecification preRequestBasic(String endPoint) {
        return authBasic(endPoint)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON);
    }
}
