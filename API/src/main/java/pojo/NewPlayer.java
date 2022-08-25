package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewPlayer {
    private String username;
    private String email;
    @JsonProperty("password_change")
    private String password;
    @JsonProperty("password_repeat")
    private String passwordConfirm;
    @JsonProperty("grant_type")
    private String grantType;

}
