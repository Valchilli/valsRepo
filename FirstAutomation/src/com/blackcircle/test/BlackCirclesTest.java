package com.blackcircle.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.blackcircles.page_object.HomePage;
import com.blackcircles.page_object.LandingPage;
import com.blackcircles.page_object.MyAccountPage;



public class BlackCirclesTest {
 private WebDriver driver;
 private String webUrl = "http://www.blackcircles.com";
 private HomePage homePage;
 private LandingPage landingPage;
 private MyAccountPage myAccountPage;
 
 
 
 @Before
 public void setUp(){
   driver = new FirefoxDriver();
   driver.manage().window().maximize();
   driver.navigate().to(webUrl);
   homePage = new HomePage(driver);
   myAccountPage = new MyAccountPage(driver);
   landingPage = new LandingPage(driver);
 }
 
@After
public void tearDown(){
  driver.quit();
}


//test with valid username and valid password
@Test
public void loginWithValidUsernameAndValidPassword(){
 String username = "234dotus@gmail.com";
 String password = "password123";
 String message1 = "Log Out";
 String message2 = "My Account";
 homePage.openMyAccount();
 myAccountPage.loginWith(username, password);
 landingPage.verifyPage(message1, message2);
}

//test with valid username and invalid password
@Test
public void loginWithValidUsernameAndInvalidPassword(){
String username = "234dotus@gmail.com";
String password = "passwordd123";
String message1 = "Incorrect login details";
String message2 = "Forgotten Your Password";
homePage.openMyAccount();
myAccountPage.loginWith(username, password);
landingPage.verifyPage(message1, message2);}

//test with invalid username and invalid password
@Test
public void loginWithInvalidUsernameAndInvalidPassword(){
String username = "234ddotus@gmail.com";
String password = "passwordd123";
String message1 = "Incorrect login details";
String message2 = "Forgotten Your Password";
homePage.openMyAccount();
myAccountPage.loginWith(username, password);
landingPage.verifyPage(message1, message2);}

//test with invalid username and valid password
@Test
public void loginWithInvalidUsernameAndValidPassword(){
String username = "234ddotus@gmail.com";
String password = "password123";
String message1 = "Incorrect login details";
String message2 = "Forgotten Your Password";
homePage.openMyAccount();
myAccountPage.loginWith(username, password);
landingPage.verifyPage(message1, message2);}

//test with no username and valid password
@Test
public void loginWithNoUsernameAndValidPassword(){
String username = "";
String password = "password123";
String message1 = "My Account Login";
String message2 = "Forgotten Your Password";
homePage.openMyAccount();
myAccountPage.loginWith(username, password);
landingPage.verifyPage(message1, message2);}

//test with no username and invalid password
@Test
public void loginWithNoUsernameAndInvalidPassword(){
String username = "";
String password = "passwordd123";
String message1 = "My Account Login";
String message2 = "Forgotten Your Password";
homePage.openMyAccount();
myAccountPage.loginWith(username, password);
landingPage.verifyPage(message1, message2);}

//test with valid username and no password
@Test
public void loginWithValidUsernameAndNoPassword(){
String username = "234dotus@gmail.com";
String password = "";
String message1 = "My Account Login";
String message2 = "Forgotten Your Password";
homePage.openMyAccount();
myAccountPage.loginWith(username, password);
landingPage.verifyPage(message1, message2);}

///test with invalid username and no password
@Ignore@Test
public void loginWithInvalidUsernameAndNoPassword(){
String username = "234ddotus@gmail.com";
String password = "";
String message1 = "My Account Login";
String message2 = "Forgotten Your Password";
homePage.openMyAccount();
myAccountPage.loginWith(username, password);
landingPage.verifyPage(message1, message2);}



//test with no username and no password
@Test
public void loginWithNoUsernameAndNoPassword(){
String username = "";
String password = "";
String message1 = "My Account Login";
String message2 = "Forgotten Your Password";
homePage.openMyAccount();
myAccountPage.loginWith(username, password);
landingPage.verifyPage(message1, message2);}


}
