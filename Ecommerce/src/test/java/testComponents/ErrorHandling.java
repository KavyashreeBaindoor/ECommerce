package testComponents;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumProject.pageObjects.CartPage;
import seleniumProject.pageObjects.CheckOutPage;
import seleniumProject.pageObjects.ConfirmationPage;
import seleniumProject.pageObjects.ProductPage;

public class ErrorHandling extends BaseTest{
	static String prod="ZARA COAT 3";

	@Test(retryAnalyzer=ReRunFaliedTests.class)
	public void loginErrorHandling() throws IOException, InterruptedException {
		
		lo.login("1995@gmail.com", "A123");
		
String mssg=lo.getErrorMssg();
Assert.assertEquals(mssg, "Incorrect email or password.");
		
	
	
	
		
		
	
	}
	
	
	@Test
	public void productCartErrorHandling() throws IOException, InterruptedException {
		
		ProductPage p=lo.login("1999@gmail.com", "Admin321");
		//prod page
		p.selectProduct(prod);
		Thread.sleep(2000);
		CartPage c=p.clickOnCartBtn();
		
		Thread.sleep(3000);
		
		//cart page
	  //   Boolean res=c.contianer_cart_prods.stream().anyMatch(s->s.getText().contains(prod));
		Boolean res=c.checkProdIncart(prod);
		Assert.assertTrue(res);		
		
	
	}

}
