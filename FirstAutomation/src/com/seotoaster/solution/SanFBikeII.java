package com.seotoaster.solution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SanFBikeII {
	
//	100%
	static String url =  "http://free-ecommerce-solution.seotoaster.com/";
	static String username = "demo@seotoaster.com";
	static String passwd = "demo";
	
	
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.findElement(By.xpath("//*[@id='container']/footer/div[1]/ul/li[1]/a/span")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(passwd);
		driver.findElement(By.id("submit")).click();
		

		String pageTitle = driver.getTitle();
		String loginUrl = driver.getCurrentUrl();
		
		if(loginUrl.contains("Edwin")){
			System.out.println("The test passed!!!");
		}else{
			System.out.println("The test failed");
		}

		driver.quit();


	}

}

	
	


