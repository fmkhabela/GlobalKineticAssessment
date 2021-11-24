package com.globalkinetic.SwagLab;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TestScript.BaseClass;

public class ProductsPage extends BaseClass{
WebDriver driver;
	
	public ProductsPage(WebDriver _driver) {
		driver = _driver;
		
		PageFactory.initElements(_driver, this);
		}
		@FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
		@CacheLookup // is used to improve the performance 
		WebElement clickSauceLabsBackpack;
		
		@FindBy(id = "add-to-cart-sauce-labs-backpack")
		@CacheLookup // is used to improve the performance 
		WebElement clickaddtocart; 
		
		@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
		@CacheLookup // is used to improve the performance 
		WebElement clickShoppingCart;
		
		@FindBy(xpath = "//*[@id=\"checkout\"]")
		@CacheLookup // is used to improve the performance 
		WebElement clickCheckout;
		
		@FindBy(id = "first-name]")
		@CacheLookup // is used to improve the performance 
		WebElement txtFirstName;	
		
		@FindBy(css = "#last-name")
		@CacheLookup // is used to improve the performance 
		WebElement txtLastname;
		
		@FindBy(xpath = "//*[@id=\"postal-code\"]")
		@CacheLookup // is used to improve the performance 
		WebElement txtPostalCode;
		
		@FindBy(xpath = "//*[@id=\"continue\"]")
		@CacheLookup // is used to improve the performance 
		WebElement btnContinue;
		
		@FindBy(xpath = "//*[@id=\"finish\"]")
		@CacheLookup // is used to improve the performance 
		WebElement btnFinish;
		
		
			
		
		

//verify page title after log in 
	public void VerifyProductsTitlePageObject() throws IOException {
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Products";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.print(ExpectedTitle);
		
	
		}

//Purchase a product 
   public void ProductsPageObject() throws IOException {
			 try {
					JavascriptExecutor js = (JavascriptExecutor) driver;
			    	Thread.sleep(10000);
			 
			        js.executeScript("arguments[0].click();", clickSauceLabsBackpack);
			    	Thread.sleep(2000);
			        js.executeScript("arguments[0].click();", clickaddtocart);
			    	Thread.sleep(5000);
			    	js.executeScript("arguments[0].click();", clickShoppingCart);
				    Thread.sleep(5000);
					js.executeScript("arguments[0].click();", clickCheckout);
				    Thread.sleep(5000);
				    
			
					
			 }
			 catch (Exception e) {
					System.out.print("inside catch");
   
			 }

   }
}
					
					 
			 
   
   



		 
		