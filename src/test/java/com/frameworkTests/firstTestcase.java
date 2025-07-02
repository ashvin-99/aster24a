package com.frameworkTests;
import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class firstTestcase {
	
	WebDriver driver;
	
	@BeforeClass
	public void starter()
	{
        driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://testphp.vulnweb.com/login.php");
	}
	
	@Test(priority=2)
	public void login()
	{
        
		driver.findElement(By.xpath("//input[@name=\"uname\"]")).sendKeys("test");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value=\"login\"]")).click();
		
		
	}
	@Test(priority=3)
	public void logOut()
	{
		driver.findElement(By.linkText("Logout test")).click();
	}
	@AfterClass
    public void tearDown()
    {
    	driver.quit();
    }
	public void extra()
	{
		System.out.println("WelCome:");
	}
}
