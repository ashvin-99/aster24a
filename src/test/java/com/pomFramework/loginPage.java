package com.pomFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage 
{
	WebDriver driver;
	
// make Constructor
	loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	// store all locators
	
	By username=By.xpath("//input[@id='user-name']");
	By password=By.xpath("//input[@id='password']");
	By submit=By.xpath("//input[@id='login-button']");
	
	public void tusername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	public void t1password(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void tclick()
	{
		driver.findElement(password).click();
	}
}
