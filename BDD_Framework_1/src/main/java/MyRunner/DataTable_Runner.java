package MyRunner;
import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(
features="C:\\Users\\Dell\\eclipse-workspace\\BDD_Framework_1\\Features\\DataTable.feature",// Path of the Feature file
glue={"StepDefinition"},//  Path of the Step defenition file
format= {"pretty","html:Output","junit:Output/leave.xml","json:Output/leave.json"},  //To generate different type of files
monochrome=true,                           //    For displaying console output in a proper Readable formate.
dryRun=true)                              //     Used for checking proper maping between feature file and Step definition file.
public class DataTable_Runner {

}
