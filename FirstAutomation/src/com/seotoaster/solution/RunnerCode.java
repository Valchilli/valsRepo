package com.seotoaster.solution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunnerCode {

	WebDriver driver;
	SanFCodesI code;
	CodeInvalid code1;
	CodeInvalidI code2;
	
	@Before
	public void setUp(){
		 driver = new FirefoxDriver();
		 code = new SanFCodesI(driver);
		 code1 = new CodeInvalid(driver);
		 code2 = new CodeInvalidI(driver);
		 code.maximizeBrowser();	
		 code.openWebAddress();
	}
	
	@After
	public void closeDownBrowser(){
		code.tearDownBrowser();	
		
	}
	@Test

	public void testInvalidUsernameLogin(){
		code2.userLoginWithInvalidUsername();
		code.verifyPage();

	}
	
		
	
	
	@Test
	public void testUserLogin(){
		code.userLogin();
		code.verifyPage();
		
	}
	
	@Test

	public void testInvalidPasswordLogin(){
		code1.userLoginWithInvalidPassword();
		code.verifyPage();
		
		
	}
	
	
}

