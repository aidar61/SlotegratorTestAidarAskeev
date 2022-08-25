package dataProviders;

import com.github.javafaker.Faker;

import java.util.Locale;

public class MockDataGenerator {

    private final static Faker faker = new Faker(new Locale("EN"));

    protected static String generateUserName() {
        return faker.name().username();
    }

    protected static String generateEmail() {
        return faker.internet().emailAddress();
    }
}
