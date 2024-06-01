package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class report {
	public  ExtentReports extent;
    public ExtentTest test;
    public ExtentSparkReporter s;
    public ExtentSparkReporterConfig c;
    public String path;
	
	public ExtentReports getreportObj() {
		
		
		path="reports/extentreport.html";
		
		extent = new ExtentReports();
		
		 extent.setSystemInfo("os", System.getProperty("os.version"));
		 extent.setSystemInfo("os", System.getProperty("java.version"));
		 extent.setSystemInfo("os", System.getProperty("os.name"));
		 c=s.config();
		 c.setTheme(Theme.DARK);
		 c.setDocumentTitle("orangeHrm");
		 c.setReportName("AUtomation");
		 c.setTimeStampFormat("dd-MM-YYYY hh:mm:ss");
		 c.setJs( "document.getElementsByClassName('logo')[0].style.display='none'");
		 
		 s=new ExtentSparkReporter(path);
		 extent.attachReporter(s);
		
		return extent;

}
	
	
	
	

	}
