package CucumberStepDef;

import java.util.List;

import io.cucumber.java.en.*;

public class Demo1Stepdef {

	@Given("User is on login landing Page")
	public void user_is_on_login_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("given");
	}
	
	
	
	//@When("user enters credentials with {string} and passowrd {string}")
	//public void user_enters_credentials_with_and_passowrd(String un, String pw) {
	  
	 //   System.out.println(un+" "+pw);
	//}
	

	
	//parameterization
	@When("^user enters credentials with (.+) and passowrd (.+)$")
	public void user_enters_credentials_with_and_passowrd(String un, String pw) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(un+" "+pw);
	}

	
	//data driven
	@When("user Signup for application")
	public void user_signup_for_application(List<String> data) {
		
		for(String d:data) {
			System.out.println(d);
		}
	       
	   
	}
	@Then("Home page displayed")
	public void home_page_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("then");
	}
	
	
	//background
	
	@Given("setup data")
	public void setup_data() {
	  System.out.println("added data in db");
	}
	@When("launch browser")
	public void launch_browser() {
	  System.out.println("metion which browser to lauch and launch it");
	}
	@Then("gotourl")
	public void gotourl() {
	  System.out.println("go to url");
	}

}
