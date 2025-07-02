package com.framework.listeners;
import org.testng.*;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class myListener implements ITestListener{
	
	
	public void onStart(ITestContext context)
	{
      System.out.println("Test Execution is Started:");	
    }
	public void onTestStart(ITestResult result)
	{
	    System.out.println("Test Start:");
	  }
	public void onTestSuccess(ITestResult result)
	{
	    System.out.println("Test Passed:");
	  }
	public void onTestFailure(ITestResult result)
	{
	    System.out.println("Test Failed:");
	  }
	public void onTestSkipped(ITestResult result) 
	{
	    System.out.println("Test Skipped:");
	  }
	public void onFinish(ITestContext context) 
	{
	    System.out.println("");
	  }
}
