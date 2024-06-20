package CucumberProjectPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CucumberProjectUtility.testsetup;

public class landingPage {
	public WebDriver driver;
	
	
	public landingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	private By searchBox=By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	private By ProdName=By.tagName("h4");
	private By dealsTab=By.xpath("(//a[@class='cart-header-navlink'])[1]");
	
	
	public void searchProd(String name) {
		driver.findElement(searchBox).sendKeys(name);
	}

	
	public String getProdName() {
		return driver.findElement(ProdName).getText();
	}
	
	
	public void dealsTab() {
		driver.findElement(dealsTab).click();
	}
}
