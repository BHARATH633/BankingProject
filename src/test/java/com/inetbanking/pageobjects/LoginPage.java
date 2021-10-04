package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	 public LoginPage(WebDriver rdriver)
	{
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(name="uid")
    WebElement txtUserName;
	
	@FindBy(name="password")
    WebElement txtPassword;
	
	@FindBy(name="btnLogin")
    WebElement btnLogin;
	
	
	public void setUserName(String uname) throws InterruptedException
	{
	//	Thread.sleep(5000);
		txtUserName.sendKeys(uname);
		
	}
	
	public void setPassword(String pwd) throws InterruptedException
	{
		//Thread.sleep(3000);
		
		txtPassword.sendKeys(pwd);
		
	}
	
	public void clickSubmit() throws InterruptedException
	{
		//Thread.sleep(3000);
		btnLogin.click();
	}
	
	
	
}
