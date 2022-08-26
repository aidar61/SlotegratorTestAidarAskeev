package API.apihelper;

import dataProviders.MockDataGenerator;
import dataProviders.URI;
import API.pojo.NewPlayer;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.junit.Test;


import java.io.File;

public class MethodsBearer extends MockDataGenerator {
    private final static File file
            = new File("/Users/aidarka61/IdeaProjects/Slotegrator/API/src/main/resources/newPlayer.json");


    public static Response getBodyJSONPlayerCredentialsBearer() throws JsonProcessingException {
        NewPlayer newPlayer = new NewPlayer();
        newPlayer.setUsername(username);
        newPlayer.setEmail(email);
        newPlayer.setPassword("amFuZWRvZTEyMw==");
        newPlayer.setPasswordConfirm("amFuZWRvZTEyMw==");
        String credentialsJSON = SDConverter.serialize(newPlayer);
        return APIHelperBearer.preRequestBearer(URI.PLAYERS.auth)
                .body(credentialsJSON)
                .request(Method.POST);
    }

    @Test
    public void testBody() {
        try {
            System.out.println(getBodyJSONPlayerCredentialsBearer().getBody().asPrettyString());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
