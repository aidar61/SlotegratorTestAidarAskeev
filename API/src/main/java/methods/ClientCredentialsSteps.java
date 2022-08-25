package methods;

import com.fasterxml.jackson.core.JsonProcessingException;
import methods.base.BaseMethods;
import pojo.Client;

public class ClientCredentialsSteps extends BaseMethods {
    public void performPOSTToGetBearerToken() {
        try {
            System.out.println(Client.getBearerToken());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    public void checkStatusCode(int statusCode) {

    }
}
