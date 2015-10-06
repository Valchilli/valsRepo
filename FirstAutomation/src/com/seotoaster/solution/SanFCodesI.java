package com.seotoaster.solution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SanFCodesI {

	private String url =  "http://free-ecommerce-solution.seotoaster.com/";
	private String username = "demo@seotoaster.com";
	private String passwd = "demo";
	private WebDriver driver;
	
	public SanFCodesI(WebDriver driver){
		this.driver = driver;
	}
	
	public void maximizeBrowser(){
		driver.manage().window().maximize();
	}
	
	public void openWebAddress(){
		driver.navigate().to(url);	
		}
	
	public void userLogin(){
		driver.findElement(By.xpath("//*[@id='container']/footer/div[1]/ul/li[1]/a/span")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(passwd);
		driver.findElement(By.id("submit")).click();
	}
	
	public void verifyPage(){
		String loginUrl = driver.getCurrentUrl();
		
		if(loginUrl.contains("user")){
			System.out.println("The test passed!!!");
		}else{
			System.out.println("The test failed");
		}		}
	
	public void tearDownBrowser(){
		driver.quit();
	}
}

