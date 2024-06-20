package CucumberProjectRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failedScenario.txt",glue="CucumberProjectStepDef"
,monochrome = true,plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})
public class failedScenario extends AbstractTestNGCucumberTests {
	
	

}
