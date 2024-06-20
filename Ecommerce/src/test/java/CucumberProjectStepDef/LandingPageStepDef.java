package CucumberProjectStepDef;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import CucumberProjectPageObjects.landingPage;
import CucumberProjectUtility.testsetup;
import io.cucumber.java.en.*;

public class LandingPageStepDef{
	
	
	String dealerPagetext;
	testsetup t;
	
	public LandingPageStepDef(testsetup t) {
		super();
		this.t=t;
	}


	


	@Given("user is on Greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
		
		
		
}
	
	
	@When("^search product with shortname (.+) and extract actual name of product$")
	public void search_product_with_shortname_and_extract_actual_name_of_product(String veggie) throws InterruptedException {
		landingPage l=new landingPage(t.driver);
		l.searchProd(veggie);
		Thread.sleep(1000);
		String actual_name=l.getProdName();//Tomato - 1 Kg
		t.ProductPagenameOfVeggie=actual_name.split("-")[0].trim();
		System.out.println(t.ProductPagenameOfVeggie);
		
	  
	}
	
	
	


}
