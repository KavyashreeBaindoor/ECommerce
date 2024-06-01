package testComponents;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Resources.report;

public class Listeners extends BaseTest implements ITestListener  {
	ExtentTest test;
	
	 report e=new report();
	 ExtentReports ex=e.getreportObj();
	 
	
	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("test started");
	test=ex.createTest(result.getMethod().getMethodName()).assignAuthor("kavya").assignCategory("smoke suite").assignDevice("chrome");
	}
	

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test success");
		test
		.info("this is a info mssg")
		.pass("passed");
		
	
	

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
		
		
			test
			.info("this is a info mssg")
			.fail(result.getThrowable());
			//.addScreenCaptureFromPath(screenshot(result.getMethod().getMethodName()),"failed screen captured");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("testskipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("testskipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("test failed with timeout");
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("execution started");
	
	/*
	 * if(extent==null) { extent = new ExtentReports(); }
	 */
	
	
	 
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("execution finsihed");
		  ex.flush();
		  
		
	}



}
