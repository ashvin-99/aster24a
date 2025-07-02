package com.framework.listeners;
import org.testng.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class listenerDemo {
	
	WebDriver driver;
	@BeforeClass
	public void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		
	}
	@Test(priority=1)
	void verifyLogo()
	{
		Boolean status=driver.findElement(By.xpath("//img[@alt=\"Practice Test Automation\"]")).isDisplayed();
		Assert.assertTrue(status, "Logo is not Displayed:");
	}
	@Test(priority=2)
	void verifyUrl()
	{
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://practicetestest-login/");
	}
	@Test(priority=3, dependsOnMethods= {"verifyUrl"})   
	void verifyTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Test Login | Practice Test Automation");
	
	}
	@AfterMethod
	public void sshandle(ITestResult result ) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			TakesScreenshot ss=(TakesScreenshot)driver;
			File src=ss.getScreenshotAs(OutputType.FILE);
			File trg=new File("C:\\TrainingWorkplace\\aster25A\\FailedScreenshots\\f1.png");
			
			FileUtils.copyFile(src, trg);
		}
	}

	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
