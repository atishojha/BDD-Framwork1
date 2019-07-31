package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\Dell\\eclipse-workspace\\BDD_Framework_1\\Features\\Taging.feature", // Path of the Feature file
glue= {"StepDefinition"},                     //  Path of the Step defenition file
format= {"pretty","html:Output","junit:Output/leave.xml","json:Output/leave.json"},  //To generate different type of files
tags= {"@Smoke,@Sanity"},   //OR Tags:{"@Smoke,@Sanity"}...AND Tags:{"@Smoke","@Sanity"}...NOT Tags:{"~@Smoke"}
monochrome=true,                           //    For displaying console output in a proper Readable formate.
dryRun=false)   
public class Taging_Runner {

}

