package UI.utils;

import dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver() {
        //Singleton pattern
    }

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxDriver();
                    break;
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

