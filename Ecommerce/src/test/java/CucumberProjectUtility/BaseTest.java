package CucumberProjectUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	
	
WebDriver driver;

Properties p;
	
	public WebDriver webdriverIntialize() throws IOException {
		
		
		FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\CucumberProjectResources\\config.properties");
		p=new Properties();
		p.load(f);
		
		String url=p.getProperty("QAurl");
		
		
		if(driver==null) {
			
			if(p.getProperty("browser").equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
}
			
	if(p.getProperty("browser").equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
				
				driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
		}
		
		
		
		
		return driver;
		
		
	}
}
