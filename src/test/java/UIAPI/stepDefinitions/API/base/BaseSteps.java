package UIAPI.stepDefinitions.API.base;

import API.methods.*;


public class BaseSteps {
    protected ClientCredentialsSteps clientCredentialsSteps = new ClientCredentialsSteps();
    protected CreatePlayerSteps createPlayerSteps = new CreatePlayerSteps();
    protected GetBearerTokenOfCreatedPlayerSteps getBearerTokenOfCreatedPlayerSteps = new GetBearerTokenOfCreatedPlayerSteps();
    protected GetCredentialsPlayersSteps credentialsPlayersSteps = new GetCredentialsPlayersSteps();
    protected GetOtherPlayerCredentialsSteps getOtherPlayerCredentialsSteps = new GetOtherPlayerCredentialsSteps();
}
