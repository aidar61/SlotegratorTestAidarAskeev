package dataProviders;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try {
            String patch = "/Users/aidarka61/IdeaProjects/Slotegrator/API/src/main/resources/configurations.properties";
            FileInputStream input = new FileInputStream(patch);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key).trim();
    }
}
