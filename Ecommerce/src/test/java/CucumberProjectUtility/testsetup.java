package CucumberProjectUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class testsetup {
	
	public WebDriver driver;
	public String ProductPagenameOfVeggie;
	public BaseTest b;
	
	public  testsetup() throws IOException {
		
		BaseTest t=new BaseTest();
		driver=t.webdriverIntialize();
	}

}
