package API.methods;

import API.methods.base.BaseMethods;
import API.pojo.Players;

public class CreatePlayerSteps extends BaseMethods {

    public void performPOSTToCreatePlayerWithMockData() {
        System.out.println(Players.createGetPlayerObjectWithJSON());
    }

    public int CreatePlayerAndReturnStatusCode() {
        return Players.createPlayerAndGetStatusCode();
    }

}
