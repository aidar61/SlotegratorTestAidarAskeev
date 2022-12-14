package API.pojo;

import API.apihelper.SDConverter;
import API.apihelper.MethodsBasic;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Data;
import org.junit.Test;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Client {
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private String expiresIn;
    @JsonProperty("access_token")
    private String accessToken;


    public static String getBearerToken() throws JsonProcessingException {
        Client client = SDConverter
                .deserialize(MethodsBasic.getBodyJsonAUTHBASIC()
                        .getBody().asPrettyString(), Client.class);
        return client.getAccessToken();
    }

    public static int getStatusCode() {
        return MethodsBasic.getBodyJsonAUTHBASIC().getStatusCode();
    }

    @Test
    public void statusCodeTest() {
        System.out.println(getStatusCode());
    }


    @Test
    public void tokenTest() {
        try {
            System.out.println(getBearerToken());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
