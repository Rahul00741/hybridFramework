package com.hybriFrameWok.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogiinPage 
{
	WebDriver driver;
	@FindBy(xpath = "//input[@type='text']")
	WebElement txtusername;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement btnlogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement lnkLogout;
	
	
	

	public LogiinPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void setTxtUserName(String uname)
	{
		txtusername.sendKeys("");
	}
	
	public void setPassword(String pass)
	{
		txtpassword.sendKeys("");
	}
	
	public void clickLoginButton()
	{
		btnlogin.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
