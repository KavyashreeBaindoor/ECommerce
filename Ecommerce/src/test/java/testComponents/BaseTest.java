package testComponents;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;

import seleniumProject.pageObjects.LoginPage;

public class BaseTest {
	
	public WebDriver driver;
	public LoginPage lo;
	
	public void setup() throws IOException {
		Properties p=new Properties();
		FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"//src//test//java//Resources//globaldata.properties");
		p.load(f);//expecting input stream
		
		
		//String bname=p.getProperty("browser");  old--without mvn parameter
		
		
		String bname=System.getProperty("browser")!=null ? bname=System.getProperty("browser"):p.getProperty("browser");
		
		
		if(bname.equals("chrome")) {
			
		driver=new ChromeDriver();

		
		}else if(bname.equals("edge")) {
			
			//edge
			driver=new EdgeDriver();
			
			
		}else if(bname.equals("firefox")) {
			
			//firefox code
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
	//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(2000));
		
		//return driver;
	}
	
	
	
	@BeforeMethod(alwaysRun = true)
	public void launchApp() throws IOException {
		setup();
		 lo=new LoginPage(driver);
		lo.url();
		
		
		
	}
	
	@AfterMethod(alwaysRun = true)//groups
	public void tearDown() throws IOException {
		driver.close();
			
	}
	
	public String screenshot(String testname,WebDriver driver) throws IOException, InterruptedException {
		//Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(src, dest);
		
		return dest.getAbsolutePath();
	}

	
	

}
