package CucumberProjectPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CucumberProjectUtility.testsetup;

public class OffersPage {
	
public WebDriver driver;

	
	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}
	

	private By searchBox=By.id("search-field");
	private By prodName=By.xpath("//td[1]");
	
	By DealersTab=By.xpath("(//a[@class='cart-header-navlink'])[1]");
	
	
	public void search(String name) {
		driver.findElement(searchBox).sendKeys(name);
	}
	
	public String getText() {
		return driver.findElement(prodName).getText();
	}
	
	
	
	
	
}
