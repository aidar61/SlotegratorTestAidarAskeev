package API.pojo;

import API.apihelper.APIHelperBasic;
import API.apihelper.MethodsBearer;
import API.apihelper.SDConverter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import dataProviders.MockDataGenerator;
import dataProviders.URI;
import io.restassured.http.Method;
import io.restassured.response.Response;
import lombok.Data;
import org.junit.Test;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatedPlayer {
    @JsonProperty("grant_type")
    private String grantType;
    private String username;
    private String password;

    private static String GetJSONBodyForTokenPlayer() throws JsonProcessingException {
        CreatedPlayer createdPlayer = new CreatedPlayer();
        createdPlayer.setGrantType("password");
        createdPlayer.setUsername(MockDataGenerator.username);
        createdPlayer.setPassword("amFuZWRvZTEyMw==");
        return SDConverter.serialize(createdPlayer);
    }

    public static Response getBodyPOSTMethodForGetTokenOfPlayer() throws JsonProcessingException {
        return APIHelperBasic.preRequestBasic(URI.TOKEN.auth)
                .body(GetJSONBodyForTokenPlayer())
                .request(Method.POST);
    }

    public static String getBearerTokenPlayer() throws JsonProcessingException {
        Client client = SDConverter
                .deserialize(getBodyPOSTMethodForGetTokenOfPlayer().getBody().asPrettyString()
                        , Client.class);
        return client.getAccessToken().toString();
    }

    @Test
    public void testBerar() {
        try {
            System.out.println(getBodyPOSTMethodForGetTokenOfPlayer());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
