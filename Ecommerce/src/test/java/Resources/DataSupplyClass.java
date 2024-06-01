package Resources;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataSupplyClass {
	
	//old way
	
	//@DataProvider()
	/*
	 * public Object[][] datasupply() {
	 * 
	 * Object[][] obj= new String[2][3]; 
	 * obj[0][0]="1995@gmail.com";
	 * obj[0][1]="Admin123"; 
	 * obj[0][2]="ZARA COAT 3";
	 *  obj[1][0]="1999@gmail.com";
	 * obj[1][1]="Admin321"; 
	 * obj[1][2]="IPHONE 13 PRO";
	 * 
	 *  return obj;
	 * 
	 * }
	 */
	
	
	
	//new
	@DataProvider()
	public Object[][] datasupply() {
		
		
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("username", "1995@gmail.com");
		h.put("pass", "Admin123");
		h.put("prod", "ZARA COAT 3");
		
		HashMap<String,String> h1=new HashMap<String,String>();
		h1.put("username", "1999@gmail.com");
		h1.put("pass", "Admin321");
		h1.put("prod", "IPHONE 13 PRO");
		
		
		
		return new Object[][] {{h},{h1}};
		
		
		
	}
	
	
	//json file data
	//new
	@DataProvider()
	public Object[][] datasupply3() throws IOException {
	
		String jsondata=FileUtils.readFileToString(new File(System.getProperty("user.dir")+"//src//test//java//Resources//data.json"),StandardCharsets.UTF_8);
		// string to hashmap  --jackson api
		ObjectMapper map=new ObjectMapper();
		
		List<HashMap<String,String>> data=map.readValue(jsondata, new TypeReference<List<HashMap<String,String>>>(){});
			
		return new Object[][] {{data.get(0)},{data.get(1)}}	;
			
				
		
	}
	

}
