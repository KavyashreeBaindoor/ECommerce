package seleniumProject.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility;

public class CheckOutPage extends Utility{
	WebDriver driver;

 public CheckOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
 
 @FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement inputBoxCountry;
 
 @FindBy(xpath="//section[contains(@class,' ng-star-inserted')]/button/span")
 List<WebElement> selectCountryDropdown;
 
 @FindBy(xpath="//div[contains(@class,'actions')]/a")
	WebElement placeOrderBtn;
 
 
 public void countryInput(String country) {
	 inputBoxCountry.sendKeys(country);
 }

 public void clickOnCountry() {

		for(WebElement k:selectCountryDropdown) {
			if(k.getText().equalsIgnoreCase("India")) {
				k.click();
				break;
			}
		}
 }
 
 public ConfirmationPage placeOrder() throws InterruptedException {
	 Thread.sleep(2000);
	 placeOrderBtn.click();
	 ConfirmationPage co=new ConfirmationPage(driver);
	 return co;
 }
 
 
 
 
 
 
 
 
}
