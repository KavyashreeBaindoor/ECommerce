package seleniumProject.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility;

public class ConfirmationPage extends Utility{

	WebDriver driver;

 public ConfirmationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
 
 @FindBy(className="hero-primary")
	WebElement confirmationMssg;
 
 @FindBy(css ="label[class='ng-star-inserted']")
	WebElement orderid;
	
 
 public String mssg() {
	 return confirmationMssg.getText();
 }
 
 
 
 public OrdersPage obj() {
	 return new OrdersPage(driver);
 }
 
 
 public String orderid() {
		
		String b=orderid.getText();
		String s=b.substring(2,26);	
	return s;
	}
 
 
}