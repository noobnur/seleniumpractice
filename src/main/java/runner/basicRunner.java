package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
        features = {"src/main/java/feature"} ,
        format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        glue = "steps")
@RunWith(Cucumber.class)
public class basicRunner extends AbstractTestNGCucumberTests{
}
