package CucumberProjectUtility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GeneralUtils {
	
	public WebDriver driver;
	
	public GeneralUtils(WebDriver d) {
		this.driver=d;
	}

	
	
	public void switchTo() {
		Set<String> s=driver.getWindowHandles();
		Iterator<String>i=s.iterator();
		String p=i.next();
		String c=i.next();
		driver.switchTo().window(c);
	}
	
	
	
	
}
