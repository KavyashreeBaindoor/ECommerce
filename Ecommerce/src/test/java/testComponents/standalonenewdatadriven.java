package testComponents;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.DataSupplyClass;
import seleniumProject.pageObjects.CartPage;
import seleniumProject.pageObjects.CheckOutPage;
import seleniumProject.pageObjects.ConfirmationPage;
import seleniumProject.pageObjects.OrdersPage;
import seleniumProject.pageObjects.ProductPage;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.*;

public class standalonenewdatadriven extends BaseTest{
	
	static String prod="ZARA COAT 3";
	static String orderid;

	@Test(dataProvider="datasupply",dataProviderClass=DataSupplyClass.class,groups= {"datadriven2"})
	public void endToEnd(HashMap<String,String> input) throws IOException, InterruptedException {
		
		ProductPage p=lo.login(input.get("username"), input.get("pass"));
	
		//prod page
	p.selectProduct(input.get("prod"));
	Thread.sleep(2000);
	CartPage c=p.clickOnCartBtn();
	
	Thread.sleep(3000);
	
	//cart page
   //  Boolean res=c.contianer_cart_prods.stream().anyMatch(s->s.getText().contains(input.get("prod")));
	
	Boolean res=c.checkProdIncart(prod);
	Assert.assertTrue(res);	
	c.scrollup();
	CheckOutPage ch  = c.clickOnCheckoutBtn();
	
	//checkhout page
	ch.countryInput("Ind");
	ch.clickOnCountry();
	ch.scrollup();
	
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(@class,'actions')]/a"))));
	ConfirmationPage co=ch.placeOrder();
	
	
	//confirmation page
	
	
	String confirm=co.mssg();
	Assert.assertEquals(confirm, "THANKYOU FOR THE ORDER.");
	
	orderid=co.orderid();
	
	 System.out.println(orderid);
	
	
		
	
	}
	
	@Test(dependsOnMethods = {"endToEnd"})
	public void checkOrderHistory() throws IOException, InterruptedException {
		lo.login("1995@gmail.com", "Admin123");
		OrdersPage o=new OrdersPage(driver);
		o.clickOnOrdersBtn();
		
		Boolean flag=o.verifyOrderHistory(orderid);
		
		Assert.assertTrue(flag);
		
		
			
		
	
	}
	
	
	


	
}
