package branchAutomation.StepDefs.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {"@clickTracker"}
		)
public class RunnerTest {

}
