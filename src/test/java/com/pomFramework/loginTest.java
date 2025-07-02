package com.pomFramework;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class loginTest
{
	WebDriver driver;
	
	@BeforeClass
    void setUp()
    {
    	driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://www.saucedemo.com/");
    	driver.manage().window().maximize();
    }
	@Test
	void loginTest()
	{
		loginTestPageFactory pg=new loginTestPageFactory(driver);
		pg.tUserName("problem_user");
		pg.tPassword("secret_sauce");
		pg.tClick();
				
	}
	@AfterClass
    void tearDown()
    {
    	driver.quit();
    }
 
}
