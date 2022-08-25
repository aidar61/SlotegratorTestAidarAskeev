package API.methods;

import API.methods.base.BaseMethods;
import org.hamcrest.Matchers;
import API.pojo.Players;

public class CreatePlayerSteps extends BaseMethods {

    public void performPOSTToCreatePlayerWithMockData() {
        System.out.println(Players.createGetPlayerObjectWithJSON());
    }

    public int checkStatusCode() {
        return Players.getStatusCode();

    }

}
