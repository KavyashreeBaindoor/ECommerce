package CucumberProjectStepDef;

import org.testng.Assert;

import CucumberProjectPageObjects.CheckOutPage;
import CucumberProjectUtility.testsetup;
import io.cucumber.java.en.*;


public class checkoutPageStepDef {
	
testsetup t;
CheckOutPage c;
	
	public checkoutPageStepDef(testsetup t) {
		super();
		this.t=t;
	}
	
	
	
	
	@When("Add product to Cart")
	public void add_product_to_cart() {
	    c=new CheckOutPage(t.driver);
	    c.clickOnPlusIcon(2);
	   
	    
	}
	@When("Proceed to Checkout")
	public void proceed_to_checkout() throws InterruptedException {
		 c.checkout();
		 Thread.sleep(2000);
	}
	
	
	@Then("validate name of product selected")
	public void validate_name_of_product_selected() {
	Assert.assertEquals( c.getProdName().split("-")[0].trim(),t.ProductPagenameOfVeggie);
	}
	
	
	
	@Then("apply and placeOrder buttons are displayed")
	public void apply_and_place_order_buttons_are_displayed() {
	   if(t.driver.findElement(c.applyBtn).isDisplayed() && t.driver.findElement(c.placeOrderBtn).isDisplayed()) {
		   Assert.assertTrue(true);  
	   }
	   else {
		   Assert.assertTrue(false); 
	   }
	}

}
