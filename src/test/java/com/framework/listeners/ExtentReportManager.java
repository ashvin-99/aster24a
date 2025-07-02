package com.framework.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.openqa.selenium.*;
import org.testng.*;

public class ExtentReportManager implements ITestListener
{
  ExtentSparkReporter sparkReporter;
  ExtentReports extent;
  ExtentTest test;
  
  public void onStart(ITestContext context)
	{
	  sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/Reports/myReports.html");
	  sparkReporter.config().setDocumentTitle("Automation Report");
	  sparkReporter.config().setReportName("Fuctional Testing");
	  sparkReporter.config().setTheme(Theme.DARK);
	  
	  extent=new ExtentReports();
	  extent.attachReporter(sparkReporter);
	  
	  extent.setSystemInfo("Computer Name", "localHost");
	  extent.setSystemInfo("Environment", "QA");
	  extent.setSystemInfo("Tester Name", "Ashvin");
	  extent.setSystemInfo("OS", "Windows10");
	  extent.setSystemInfo("Browser Name", "Chrome");

	  
    }
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Test Case Passed is:" +result.getName());

	 }
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test Case Failed is:" +result.getName());
		test.log(Status.FAIL, "Test Case Failed Because:" +result.getName());
	}
	public void onTestSkipped(ITestResult result) 
	{
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Test Case Skiped :" +result.getName());
	}
	public void onFinish(ITestContext context) 
	{
		
     extent.flush();
     
    }
  
  
	
	
}
