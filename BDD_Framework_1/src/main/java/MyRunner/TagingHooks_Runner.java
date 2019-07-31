package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Dell\\eclipse-workspace\\BDD_Framework_1\\Features\\TagingHooks.feature",
glue= {"StepDefinition"},
format= {"pretty","html:Output","junit:Output/leave.xml","json:Output/leave.json"},
monochrome=true,
dryRun=false)
public class TagingHooks_Runner {
}
