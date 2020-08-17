package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue="StepDefinitions"/*,
        tags="@ParameterizarionWithExampleKeyword"*/
, plugin = {"pretty","html:target/cucumber",
        "json:target/cucumber.json",
        "junit:target/report.xml"}

       /*, dryRun =true*/ , strict = true
)

public class TestRunner {
}
