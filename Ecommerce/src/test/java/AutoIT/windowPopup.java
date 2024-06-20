package AutoIT;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class windowPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//window Auth popup
		
		WebDriver d=new ChromeDriver();
		
		
		//window popup authentication 
		
		//d.get("https://the-internet.herokuapp.com/");
		
		d.get("http://admin:admin@the-internet.herokuapp.com/");
		d.findElement(By.linkText("Basic Auth")).click();
		
		
		
		
		
		
		
		
	//file upload
		
		d.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@class='uploader']/a")).click();
		
		
		
		

	}

}
