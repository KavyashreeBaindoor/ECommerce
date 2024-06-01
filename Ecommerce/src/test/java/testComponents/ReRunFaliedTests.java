package testComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFaliedTests implements IRetryAnalyzer {
	
	int count=0;
	int max_try=1;//re-run only once

	@Override
	public boolean retry(ITestResult result) {
		
		//failed test also comes to this block after reporting in extent reports ?does this  need to re-run?
		// TODO Auto-generated method stub
		
		if(count<max_try) {
			
			
			count++;
			return true; //to re-run
			
			
		}
		
		
		
		
		return false;
	}

}
