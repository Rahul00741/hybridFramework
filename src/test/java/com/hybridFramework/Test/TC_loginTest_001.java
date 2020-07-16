package com.hybridFramework.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.hybriFrameWok.pageObjects.LogiinPage;

import junit.framework.Assert;

public class TC_loginTest_001 extends BaseClass 
{
	
	//WebDriver driver;
	@Test
	public void loginTest()
	{
		driver.get(baseurl);
		logger.info("url is entered");
		
		LogiinPage lp = new LogiinPage(driver);
		
		lp.setTxtUserName(username);
		logger.info("username is entered");
		
		lp.setPassword(passward);
		logger.info("password is entered");
		
		lp.clickLoginButton();
		logger.info("click on login Button");
		
//		String title = driver.getTitle();
//		System.out.println(title);
		
		
		if(driver.getTitle().equals("Guru99 Bank Home Page"))
		{
			Assert.assertTrue(true);
			logger.info("title verified");
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
