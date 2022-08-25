package dataProviders;

public enum URI {
    BASIC(ConfigReader.getProperty("basic")),
    TOKEN(ConfigReader.getProperty("pathToken")),
    PLAYERS(ConfigReader.getProperty("pathPlayers"));
    public final String auth;

    URI(String auth) {
        this.auth = auth;
    }

    public static void main(String[] args) {
        System.out.println(URI.BASIC.auth);
    }
}
