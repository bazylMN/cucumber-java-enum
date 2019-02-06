package glue;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue={"glue.hooks", "glue.steps"},
        features="src/test/resources/features",
        plugin={"pretty", "html:target/html"},
        monochrome=true)
public class CucumberRunner {
}
