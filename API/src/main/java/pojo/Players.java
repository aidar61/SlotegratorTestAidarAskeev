package pojo;

import apihelper.JSONMethodsBearer;
import apihelper.SDConverter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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

    public static Players getPlayerObjectWithJSON() {
        try {
            return SDConverter.deserialize(JSONMethodsBearer.getBodyJSONPlayerCredentialsBearer(), Players.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void getPlayerCredentialsAsObject() {
        System.out.println(getPlayerObjectWithJSON().toString());
    }
}
