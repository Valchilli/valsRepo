package com.blackcircles.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
	
	
	private WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		}

	public void loginWith(String username,String password){
		driver.findElement(By.name("Email")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		}
	
	

}


