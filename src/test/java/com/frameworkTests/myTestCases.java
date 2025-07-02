package com.frameworkTests;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class myTestCases 
{
	@Test
	   public  void firstOne()
	   {
		   System.out.println("Test:");
		   
	   }
@BeforeSuite
public  void t1()
{
	   System.out.println("BeforeSuite:");
	   
}
@AfterSuite
public  void t2()
{
	   System.out.println("AfterSuite:");
	   
}
@BeforeTest
public  void t3()
{
	   System.out.println("BeforeTest:");
	   
}
@AfterTest
public  void t4()
{
	   System.out.println("AfterTest:");
	   
}
@BeforeClass
public  void t5()
{
	   System.out.println("BeforeClass:");
	   
}
@AfterClass
public  void t6()
{
	   System.out.println("AfterClass:");
	   
}
@BeforeMethod
public  void t7()
{
	   System.out.println("BeforeMethod:");
	   
}
@AfterMethod
public  void t8()
{
	   System.out.println("AfterMethod:");
	   
}
}
