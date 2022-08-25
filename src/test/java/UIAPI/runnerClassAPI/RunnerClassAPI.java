package UIAPI.runnerClassAPI;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/aidarka61/IdeaProjects/Slotegrator/src/test/java/UIAPI/featuresFiles",
        glue = "UIAPI/stepDefinitions/API",
        tags = "@TestAPI",
        dryRun = false,
        monochrome = true,
        publish = true,
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        })
public class RunnerClassAPI {
}
