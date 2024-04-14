package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features= {".//Feature/"},//Executes all the files from the package
				glue="stepDefinitions",//To Execute the runner class
				plugin= {"pretty", "html:reports/myreport.html",//Html report 
						  "rerun:target/rerun.txt",//Failed testCase
						  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},//Extent report
				tags="@sanity",//Grouping
				//tags="@regression"
				//tags="@sanity and @regression" 
				//tags="@sanity and not @regression"
				//tags="@sanity or @regression"
				dryRun = false,
				monochrome=true,//To remove junk character
				publish=true//publish the report
				)
public class testRun {

}
