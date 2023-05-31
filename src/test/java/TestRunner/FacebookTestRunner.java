package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Facebook.feature",  glue = "StepDefinition", plugin = {"pretty","html:target/cucumber.html" }
		)
public class FacebookTestRunner {

}
