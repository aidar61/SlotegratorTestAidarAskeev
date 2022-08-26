package dataProviders;

import com.github.javafaker.Faker;

import java.util.Locale;

public class MockDataGenerator {

    private final static Faker faker = new Faker(new Locale("EN"));

    public static String username = generateUserName();
    public static String email = generateEmail();

    protected static String generateUserName() {
        username = faker.name().username();
        return username;
    }

    protected static String generateEmail() {
        email = faker.internet().emailAddress();
        return email;
    }

}
