package CucumberProjectRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/CucumberProjectFeatures",glue="CucumberProjectStepDef"
,monochrome = true,plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		,"rerun:target/failedScenario.txt"},tags="@search")
public class runner extends AbstractTestNGCucumberTests {

	
	//for running paralleley
	
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel=true) public Object[][] scenarios(){ return
	 * super.scenarios(); }
	 */
}
