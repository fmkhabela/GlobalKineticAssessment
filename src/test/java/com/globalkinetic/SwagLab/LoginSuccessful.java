package com.globalkinetic.SwagLab;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestScript.BaseClass;

public class LoginSuccessful extends BaseClass {
	WebDriver driver;
	public  LoginSuccessful (WebDriver _driver) {
		driver = _driver;
		
		PageFactory.initElements(_driver, this);
	}
	
	
		@FindBy(id = "user-name")
		@CacheLookup // is used to improve the performance 
		WebElement txtUsername;
		
		@FindBy(xpath = "//*[@id=\"password\"]")
		@CacheLookup // is used to improve the performance 
		WebElement txtPassword;
		
		@FindBy(id = "login-button")
		@CacheLookup // is used to improve the performance 
		WebElement btnlogin;
		
		public void LoginPageObject(String username, String password) throws InterruptedException, IOException {
			
			try {
				//JavascriptExecutor js = (JavascriptExecutor) driver;
		    	//Thread.sleep(10000);
		    	
				txtUsername.sendKeys(username);
		    	Thread.sleep(1000);
				txtPassword.sendKeys(password);
		    	Thread.sleep(1000);
				btnlogin.click();
		    	Thread.sleep(15000);
		    	
		    	

			} catch (Exception e) {
				

}
		}
}
