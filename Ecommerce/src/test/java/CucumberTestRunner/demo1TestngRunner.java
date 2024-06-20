package CucumberTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/CucumberFeatures",glue="CucumberStepDef"
,monochrome = true,plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"})
public class demo1TestngRunner extends AbstractTestNGCucumberTests {

	

}
