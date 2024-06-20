package CucumberProjectStepDef;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import CucumberProjectUtility.testsetup;
import io.cucumber.java.*;

public class Hooks {
	
	
	testsetup t;
	
	public Hooks(testsetup t) {
		this.t=t;
	}
	
	
	
	
	@After
	public void teardown() {
		t.driver.quit();
	}
	
	@AfterStep
	public void addScreenshot(Scenario s) throws IOException {
		if(s.isFailed()) {
			File src=((TakesScreenshot)t.driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("./CucumberScreenshots/"+System.currentTimeMillis()+".png");
			FileUtils.copyFile(src, dest);
			
		}
	}
	

}
