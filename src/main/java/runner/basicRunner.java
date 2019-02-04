package runner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/feature"} ,
        format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        glue = "steps")
public class basicRunner {
}
