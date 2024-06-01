package seleniumProject.pageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility;


public class LoginPage extends Utility {
	
	WebDriver driver;

	public LoginPage(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(d, this);
		
	}
	
	@FindBy(id="userEmail")
	WebElement email;
	
	@FindBy(id="userPassword")
	WebElement pass;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[@aria-label='Incorrect email or password.']")
	WebElement invalidCredentialsErrorMssg;
	
	//action methods
	
	public ProductPage login(String mail,String pw) {
		email.sendKeys(mail);
		pass.sendKeys(pw);
		loginBtn.click();
		
		ProductPage p=new ProductPage(driver);	
		return p;
	}
	
	public void url() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public String getErrorMssg() {
		waitforElementtoappear(invalidCredentialsErrorMssg);
		return invalidCredentialsErrorMssg.getText();
	}

}
