package com.globalkinetic.SwagLab;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TestScript.BaseClass;


public class LandingPageTitle extends BaseClass{
	
	WebDriver driver;
	
	public LandingPageTitle(WebDriver _driver) {
		driver = _driver;
		
		PageFactory.initElements(_driver, this);
	}

//Navigates to LandingPage and verify page title
	
	public void VerifyTitlePageObject() throws IOException {
	
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Swag Labs";
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			System.out.print(ExpectedTitle);
			}
			
		
		
		
		
		

	}

