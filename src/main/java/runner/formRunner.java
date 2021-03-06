package runner;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/feature/fillOutForms.feature"} ,
        format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        glue = "steps")
public class formRunner extends AbstractTestNGCucumberTests {
}
