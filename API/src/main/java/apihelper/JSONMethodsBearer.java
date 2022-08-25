package apihelper;

import com.fasterxml.jackson.core.JsonProcessingException;
import dataProviders.MockDataGenerator;
import dataProviders.URI;
import io.restassured.http.Method;
import org.junit.Test;
import pojo.NewPlayer;


import java.io.File;

public class JSONMethodsBearer extends MockDataGenerator {
    private final static File file
            = new File("/Users/aidarka61/IdeaProjects/Slotegrator/API/src/main/resources/newPlayer.json");

    public static String getBodyJSONPlayerCredentialsBearer() throws JsonProcessingException {
        NewPlayer newPlayer = new NewPlayer();
        newPlayer.setUsername(generateUserName());
        newPlayer.setEmail(generateEmail());
        newPlayer.setPassword("amFuZWRvZTEyMw==");
        newPlayer.setPasswordConfirm("amFuZWRvZTEyMw==");
        String credentialsJSON = SDConverter.serialize(newPlayer);
        return APIHelperBearer.preRequestBearer(URI.PLAYERS.auth)
                .body(credentialsJSON)
                .request(Method.POST).getBody().asPrettyString();
    }

    @Test
    public void getBody() {
        try {
            System.out.println(getBodyJSONPlayerCredentialsBearer());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
