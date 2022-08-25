package API.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatedPlayer {
    @JsonProperty("grant_type")
    private String grantType;
    private String username;
    private String password;

//    public String getBearerTokenCreatedPlayer() throws JsonProcessingException {
//        Client client
//                = SDConverter
//                .deserialize(MethodsBasic.getCreatedPlayerJsonAUTHBASIC()
//                        .getBody().asPrettyString(), Client.class);
//        return client.getAccessToken();
//    }

//    @Test
//    public void testTokenCreatedPlayer() {
//        try {
//            System.out.println(getBearerTokenCreatedPlayer());
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
