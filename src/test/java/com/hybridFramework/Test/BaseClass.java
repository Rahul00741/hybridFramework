package com.hybridFramework.Test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseurl = "http://demo.guru99.com/v4/index.php";
	public String username ="mngr246602";
	public String passward = "EvUnane";
	public static WebDriver driver;
	public static Logger logger;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		logger = Logger.getLogger("hybridFramework");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
