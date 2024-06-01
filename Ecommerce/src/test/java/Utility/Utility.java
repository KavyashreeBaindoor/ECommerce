package Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumProject.pageObjects.OrdersPage;

public class Utility {
	
	WebDriver driver;
	
	
public Utility(WebDriver driver) {
	
		this.driver = driver;
		
	}




	

		public void waitforElementtobeVisible(By findBy) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(3000));
			wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
			
			
		}
		
		public void waitforElementtoappear(WebElement findBy) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(3000));
			wait.until(ExpectedConditions.visibilityOf(findBy));
			
			
		}

	
		public void scrollup() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,550)", "");
		}
		
		
		
}
