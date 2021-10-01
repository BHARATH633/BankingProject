package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.BaseClass;
import com.inetbanking.pageobjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass   {

	

	@Test
	public void loginTest() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.get(baseURL);
		System.out.println("driver is " +baseURL);
		
logger.info("Url is opened");
		
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(5000);
	     lp.setUserName(username);
	     
logger.info("entered username");
        Thread.sleep(5000);
	     lp.setPassword(password);
	     
logger.info("entered password");

	     lp.clickSubmit();
	     
logger.info("entered into home page");    
	     
	     if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	     {
	    	 Assert.assertTrue(true);
	     }
	     
	     else
	     {
	    	 Assert.assertTrue(false);
	    	 
		}
		
	}
	
	
	
	
}
