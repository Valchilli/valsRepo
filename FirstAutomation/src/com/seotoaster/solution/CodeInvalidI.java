package com.seotoaster.solution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CodeInvalidI {
	
	private String url =  "http://free-ecommerce-solution.seotoaster.com/";
	private String username = "demo@seotoasterrr.com";
	private String passwd = "demo";
	private WebDriver driver;
	
	public CodeInvalidI(WebDriver driver){
		this.driver = driver;
	}
	
	public void userLoginWithInvalidUsername(){
		driver.findElement(By.xpath("//*[@id='container']/footer/div[1]/ul/li[1]/a/span")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(passwd);
		driver.findElement(By.id("submit")).click();
	
	}

}
