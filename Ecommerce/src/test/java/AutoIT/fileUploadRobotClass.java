package AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.StringSelection;

public class fileUploadRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.ilovepdf.com/pdf_to_word");
		
		d.findElement(By.xpath("//div[@class='uploader']/a")).click();
		Thread.sleep(1000);
		
		//java.awt package Robot Class and stringselection class
		
		
		String path="F:\\2024\\Assignment_manual.pdf";
		StringSelection stringSelection = new StringSelection(path);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		   //copy path  in clipboard
		
		Robot r = new Robot();
		
		
		//paste the file path FROM CLIPBOARD  in file text box  ---press and release ctrl+v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
		 
		 
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		
		

	}

}
