package API.pojo;

import API.apihelper.SDConverter;
import API.apihelper.MethodsBearer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Data;
import org.junit.Test;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Players {
    private String id;
    @JsonProperty("country_id")
    private String countryId;
    @JsonProperty("timezone_id")
    private String timezoneId;
    private String username;
    private String email;
    private String name;
    private String gender;
    private String birthdate;
    private String bonuses_allowed;
    @JsonProperty("is_verified")
    private String isVerified;

    public static Players createGetPlayerObjectWithJSON() {
        try {
            return SDConverter
                    .deserialize(MethodsBearer.getBodyJSONPlayerCredentialsBearer()
                            .getBody().asPrettyString(), Players.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static int createPlayerAndGetStatusCode() {
        try {
            return MethodsBearer.getBodyJSONPlayerCredentialsBearer().getStatusCode();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testStatusCode() {
        System.out.println(createPlayerAndGetStatusCode());
    }

    @Test
    public void getPlayerCredentialsAsObject() {
        System.out.println(createGetPlayerObjectWithJSON().toString());
    }
}
