package com.frameworkTests;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class parellelTesting 
{
	WebDriver driver;
	
	@BeforeClass
  void setUp()
  {
	
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
  }
	@Test(priority=1)
  void testLogo()
  {
		Boolean logo=driver.findElement(By.xpath("//img[@alt=\"Practice Test Automation\"]")).isDisplayed();
		Assert.assertTrue(logo, "Logo is not displayed on the page.");
  }
	@Test(priority=2)
  void testTitle()
  {
		String title=driver.getTitle();
		Assert.assertEquals(title, "Test Login | Practice Test Automation");
  }
	@Test(priority=3)
  void testUrl()
  {
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://practicetestautomation.com/practice-test-login/");
  }
  @AfterClass
  void tearDown()
  {
	  driver.quit();
  }
}
