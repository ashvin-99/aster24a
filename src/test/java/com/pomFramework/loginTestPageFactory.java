package com.pomFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class loginTestPageFactory 
{
	WebDriver driver;
	
  //- create constructor
	
	loginTestPageFactory(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	// locators
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement clickOne;
	
	//- Action Methods
	void tUserName(String user)
	{
		username.sendKeys(user);
	}
	void tPassword(String pass)
	{
		password.sendKeys(pass);
	}
	void tClick()
	{
		clickOne.click();
	}
	
}
