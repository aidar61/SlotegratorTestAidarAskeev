package API.apihelper;

import com.fasterxml.jackson.core.JsonProcessingException;
import dataProviders.URI;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.junit.Test;
import API.pojo.CreatedPlayer;

import java.io.File;

public class MethodsBasic {

    private final static File fileOfDefault
            = new File("/Users/aidarka61/IdeaProjects/Slotegrator/src/main/resources/body.json");
    private final static String jsonBody = "{\n" +
            "  \"grant_type\": \"client_credentials\",\n" +
            "  \"scope\": \"guest:default\"\n" +
            "}";

    public static Response getBodyJsonAUTHBASIC() {
        return APIHelperBasic.preRequestBasic(URI.TOKEN.auth)
                .body(fileOfDefault).request(Method.POST);
    }

    public static Response getCreatedPlayerJsonAUTHBASIC() throws JsonProcessingException {
        CreatedPlayer createdPlayer = new CreatedPlayer();
        createdPlayer.setGrantType("password");
        createdPlayer.setUsername(MethodsBearer.username);
        createdPlayer.setPassword("amFuZWRvZTEyMw==");
        String jsonBodyCreatedPlayer = SDConverter.serialize(createdPlayer);
        return APIHelperBasic
                .preRequestBasic(URI.TOKEN.auth)
                .body(jsonBodyCreatedPlayer)
                .request(Method.POST);
    }

    @Test
    public void testJSON() {
        try {
            System.out.println(getCreatedPlayerJsonAUTHBASIC().getBody().asPrettyString());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
