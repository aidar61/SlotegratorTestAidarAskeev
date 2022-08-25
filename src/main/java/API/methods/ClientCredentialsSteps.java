package API.methods;

import API.methods.base.BaseMethods;
import API.pojo.Client;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.hamcrest.Matchers;

public class ClientCredentialsSteps extends BaseMethods {
    public void performPOSTToGetBearerToken() {
        try {
            System.out.println(Client.getBearerToken());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public int checkStatusCode() {
       return Client.getStatusCode();
    }
}
