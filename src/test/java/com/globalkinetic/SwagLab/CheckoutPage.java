package com.globalkinetic.SwagLab;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TestScript.BaseClass;

public class CheckoutPage extends BaseClass {
	//verify  Checkout information 
	public CheckoutPage(WebDriver _driver) {
		driver = _driver;
		
		PageFactory.initElements(_driver, this);
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Checkout:Your Information";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.print(ExpectedTitle);
		}
		@FindBy(xpath = "//*[@id=\"first-name\"]")
		@CacheLookup // is used to improve the performance 
		WebElement txtFirstname;
		
		@FindBy(xpath = "//*[@id=\"last-name\"]")
		@CacheLookup // is used to improve the performance 
		WebElement txtLastname;
		
		@FindBy(name = "postal-code")
		@CacheLookup // is used to improve the performance 
		WebElement txtPostalCode; 
		
		@FindBy(css = "#continue")
		@CacheLookup // is used to improve the performance 
		WebElement btnContinue;
			


//used tets data file to  populated customer information
public void CheckoutPageObject(String firstname, String lastname,String postalcode) throws IOException {
	 try {

	    	
	    	/*driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Tester123");
	    	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Doe");
	    	driver.findElement(By.name("postal-code")).click();
	    	driver.findElement(By.cssSelector("#continue")).click();
	    	Thread.sleep(15000);*/
	    	
		    
		    txtFirstname.sendKeys(firstname);
	    	Thread.sleep(1000);
			txtLastname.sendKeys(lastname);
	    	Thread.sleep(1000);
	    	txtPostalCode.sendKeys(postalcode);
	    	Thread.sleep(1000);
	    	btnContinue.click();
	    	
	 }
	    

			
	    	 catch (Exception e) {
					System.out.print("inside catch");

	 
	 
}
}
}


