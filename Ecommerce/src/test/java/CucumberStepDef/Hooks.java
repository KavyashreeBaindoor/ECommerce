package CucumberStepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	
	public void general() {
		System.out.println("i run before every scenario of every feature file");
	}
	
	
	@Before("@AdminLogin")
	public void adminLogin() {
		System.out.println("beofore Admin login tagged scenario");
	}
	
	@Before("@UserLogin")
public void userLogin() {
		System.out.println("beofore user login tagged scenario");
	}
	
	@After
	public void teardown() {
		System.out.println("i run after every scenario of every feature file bcz i am not tagged");
	}

}
