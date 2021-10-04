package com.inetbanking.pageobjects;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;


public class BaseClass {

	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public  WebDriver driver;
    public static Logger logger;
	
	
  @Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{
	
		
		logger = Logger.getLogger("BaseClass");
		
		PropertyConfigurator.configure("Log4j.properties");
if(br.equals("chrome"))		{
		
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver = new ChromeDriver();
		
	}
	
  
else if(br.equals("ie"))	{	
		
		System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
		driver = new EdgeDriver();
		
	}  
else if(br.equals("firefox"))	{	
	
	System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
	driver = new FirefoxDriver();
	
}  

driver.get(baseURL);
System.out.println("driver is " +baseURL);
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
