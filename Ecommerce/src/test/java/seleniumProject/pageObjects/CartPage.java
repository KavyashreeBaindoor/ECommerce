package seleniumProject.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility;

public class CartPage extends Utility{
	WebDriver driver;

	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//div[@class='cartSection']/h3")
	public
	List<WebElement> contianer_cart_prods;
	
	
	
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkoutBtn;
	
	
	public Boolean checkProdIncart(String prod) {
		
		Boolean flag=false;
		for(WebElement s:contianer_cart_prods) {
			
			if(s.getText().contains(prod)) {
			flag=true;
			}
			
		}
		
		return flag;
	}
	
	public CheckOutPage clickOnCheckoutBtn() {
		checkoutBtn.click();
		CheckOutPage ch=new CheckOutPage(driver);
		return ch;
	}
	
	
	
	
	
	

}
