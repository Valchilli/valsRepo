package com.blackcircles.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		}
	
	
	public void openMyAccount(){
		driver.findElement(By.partialLinkText("My Account")).click();
		
	}
	


}
