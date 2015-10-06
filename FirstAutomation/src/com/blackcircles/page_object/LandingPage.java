package com.blackcircles.page_object;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPage {
	
	private WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		}

	
	
	
	public void verifyPage(String message1, String message2){
		boolean result = driver.getPageSource().contains(message1);
		Assert.assertTrue(result,"this page does not contain"+ message1);
		boolean result2 = driver.getPageSource().contains(message2);
		Assert.assertTrue(result2,"this page does not contains"+ message2);
		
		}
		

}
