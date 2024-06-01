package seleniumProject.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility;

public class OrdersPage  extends Utility{
	
	WebDriver driver;

	public OrdersPage(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(d, this);
		
	}
	
	@FindBy(xpath="(//button[@class='btn btn-custom'])[2]")
	WebElement OrdersBtn;
	
	
	
	@FindBy(xpath ="//tbody/tr/th")
	List<WebElement> ordersContainer;
	
	
	
	
	

	public void clickOnOrdersBtn() {
		OrdersBtn.click();
		
	}

	
	public Boolean verifyOrderHistory(String id) {
		
		Boolean flag=false;
		
		for(WebElement k:ordersContainer) {
			System.out.println(k.getText());
			if(k.getText().contains(id)) {
				flag=true;
				break;
			}
			
		}
		return flag;
	
		
		
		//return ordersContainer.stream().anyMatch(s->s.getText().contains(id));
	}
}
