package apihelper;

import dataProviders.URI;
import io.restassured.http.Method;
import io.restassured.response.Response;

import java.io.File;

public class JSONMethodsBasic {

    private final static File file
            = new File("/Users/aidarka61/IdeaProjects/Slotegrator/API/src/main/resources/body.json");
    private final static String jsonBody = "{\n" +
            "  \"grant_type\": \"client_credentials\",\n" +
            "  \"scope\": \"guest:default\"\n" +
            "}";

    public static Response getBodyJsonAUTHBASIC() {
        return APIHelperBasic.preRequestBasic(URI.TOKEN.auth)
                .body(file).request(Method.POST);
    }
}
