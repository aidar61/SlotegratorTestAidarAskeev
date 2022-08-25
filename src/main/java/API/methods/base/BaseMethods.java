package API.methods.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class BaseMethods {


    public static void main(String[] args) {
        String jsonBody = "{\n" +
                "  \"grant_type\": \"client_credentials\",\n" +
                "  \"scope\": \"guest:default\"\n" +
                "}";
        Response response = RestAssured.given()
                .header(new Header("Authorization", "Basic ZnJvbnRfMmQ2YjBhODM5MTc0MmY1ZDc4OWQ3ZDkxNTc1NWUwOWU6"))
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(jsonBody)
                .baseUri("http://test-api.d6.dev.devcaz.com")
                .basePath("/v2/oauth2/token")
                .request(Method.POST);
        System.out.println(response.getBody().asPrettyString());
    }
}
