package seleniumProject.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Utility;

public class ProductPage extends Utility {
	
	WebDriver driver;

	public ProductPage(WebDriver d) {
		super(d);
		this.driver = d;
		PageFactory.initElements(d, this);
	}
	
	
	@FindBy(css=".mb-3")
	List<WebElement> card;
	

	
	
	
	
	By productAddedPopup=By.xpath("//div[@aria-label='Product Added To Cart']");
	
	@FindBy(xpath="(//button[@class='btn btn-custom'])[3]")
	WebElement cartBtn;
	
			
	
	
	
	//actions methods
	
	public void selectProduct(String prod) throws InterruptedException {
		
		System.out.println(card.size());  //3
		
		for(WebElement a:card) {
			
			System.out.println(prod);
			
			System.out.println(a.findElement(By.cssSelector("b")).getText());
			
			
			
			if(	a.findElement(By.cssSelector("b")).getText().contains(prod)){
				//System.out.println(card.get(i).findElement(By.xpath("//h5/b")).getText());
				//System.out.println(prod);
		
		Thread.sleep(2000);
		//waitforElementtoappear(b.findElement(By.xpath("//button[@class='btn w-10 rounded']")));
		
		
		a.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		break;
				}
			}
		
		waitforElementtobeVisible(productAddedPopup);
		
		
	}
	

	public CartPage clickOnCartBtn() throws InterruptedException {
		System.out.println("prod page");
		cartBtn.click();
		Thread.sleep(2000);
		CartPage c=new CartPage(driver);
		
		return c;
	}
			
	
	
	
	

}