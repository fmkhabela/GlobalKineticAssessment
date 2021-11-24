package TestScript;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseClass {
	public WebDriver driver;
	
	public void BrowserSetup(String browserType) {
		
		//runs test on different browsers 
			
			if(browserType.equalsIgnoreCase("chrome")) {

				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
				driver =  new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.saucedemo.com/");
				

				
			}else {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
				driver =  new FirefoxDriver();
				driver.get("https://www.saucedemo.com/");

			}
			
			
		}
	
	
	public static String ReadDataFromCSV(String datatoberead, String datafilepath) {
		
		String line = "";  
		String splitBy = ",";  
		String datatobereturned = "";
		try
		{			
			BufferedReader br = new BufferedReader(new FileReader(datafilepath));  
			
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
			String[] customer = line.split(splitBy);    // use comma as separator 
			
				if(customer[0].equals(datatoberead)) {
					//Column that you want to 
					datatobereturned = customer[1];  
				}	
			}  
			
			return datatobereturned;
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			return "";
		}
		
	}	




	public void BrowserClose() {
		
		driver.close();
	}
			

}
