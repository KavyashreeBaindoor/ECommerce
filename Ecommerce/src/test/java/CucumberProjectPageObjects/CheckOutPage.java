package CucumberProjectPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
public WebDriver driver;
	
	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By plusBtn=By.className("increment");
	By addToCartBtn=By.xpath("//button[contains(text(),'ADD TO CART')]");
By cartIcon=By.className("cart-icon");
By checkoutBtn=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
By prodName=By.xpath("//p[@class='product-name']");
public By applyBtn=By.xpath("//button[contains(.,'Apply')]");
public By placeOrderBtn=By.xpath("//button[contains(.,'Place Order')]");

public void clickOnPlusIcon(int n) {
	
	while(n>0) {
		driver.findElement(plusBtn).click();
		n--;
	}
}


public void checkout() {
	driver.findElement(addToCartBtn).click();
	driver.findElement(cartIcon).click();
	driver.findElement(checkoutBtn).click();
}

public String getProdName() {
	return driver.findElement(prodName).getText();
}


	

}
