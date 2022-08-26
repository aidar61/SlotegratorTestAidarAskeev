package API.methods;

import API.pojo.CreatedPlayer;
import com.fasterxml.jackson.core.JsonProcessingException;

public class GetBearerTokenOfCreatedPlayerSteps {

    public int performPostMethodToAuthAndGetToken() {
        try {
            return CreatedPlayer.getBodyPOSTMethodForGetTokenOfPlayer().getStatusCode();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
