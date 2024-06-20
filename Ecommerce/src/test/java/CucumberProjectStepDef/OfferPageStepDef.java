package CucumberProjectStepDef;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import CucumberProjectPageObjects.OffersPage;
import CucumberProjectPageObjects.landingPage;
import CucumberProjectUtility.GeneralUtils;
import CucumberProjectUtility.testsetup;
import io.cucumber.java.en.Then;

public class OfferPageStepDef  {
	

	
	String dealerPagetext;
	testsetup t;
	
	
	public  OfferPageStepDef(testsetup t) {
		super();
		this.t=t;
	}
	
	@Then("^user searches the  product (.+) with shortname in offers page to see if product exists$")
	public void user_searches_the_same_product_with_shortname_in_offers_page_to_see_if_product_exists(String name) throws InterruptedException {
		switchToOffersPage();
		OffersPage o=new OffersPage(t.driver);
		o.search(name);
		Thread.sleep(1000);
		dealerPagetext=o.getText();
		
		
	}
	
	public void switchToOffersPage() {
		landingPage l=new landingPage(t.driver);
		l.dealsTab();
	GeneralUtils g=new GeneralUtils(t.driver);
	g.switchTo();
	}
	
	@Then("validate offersPage prod name validates with ProductPage prod name")
	public void validate_offersPage_prod_name_validates_with_ProductPageprodname() {
		
	
		Assert.assertEquals(dealerPagetext, t.ProductPagenameOfVeggie);
		
	}

}
