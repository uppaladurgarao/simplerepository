package com.ranford.RABP.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.RABP.appfunctions.AppFunctions;
import com.ranford.locators.Locators;
import com.ranford.utilites.Util;

public class BP_TS2_ValidateNewBranches {
	  
WebDriver driver;
Boolean bStatus;

	 @BeforeMethod
	 public void preCondition() 
	 {
		 //launching application and verifying Banker login text
		 driver= AppFunctions.LaunchApplication();
		 bStatus=Util.verifyText(driver, "Banker Login");
		 if(bStatus)
		 {
			 Reporter.log("Browser launched successfully", true);
		 }
		 else
		 {
			 Reporter.log("Browser not launched successfully", true);
		 }
		 
		//Admin login and verifying Welcome to Admin text
		 bStatus=AppFunctions.AdminLogin(driver);
		 if(bStatus)
		 {
			 Reporter.log("Admin Login successful", true);
			 if(Util.verifyText(driver,"Welcome to Admin"))        	
        	     Reporter.log("verifed welcome to admin",true);
        	else
        		Reporter.log("welcome to admin is not verified");
		 }
		 else
		 {
			 Reporter.log("Admin login unsuccessful", true);
		 }
	 }
	
	@Test
    public void testCase() 
	{
		//opening and verfying branches page
		bStatus=AppFunctions.Branches(driver);
		if(bStatus)
        {
        	Reporter.log("branches home page opend successfully", true);
        	if(Util.verifyObjectExistance(driver,Locators.Branchespage.imgNewBranch))         	
       	     Reporter.log("New Branch Text is verified",true);
         	else
       		Reporter.log("New Branch is not verified");
        	
        }
        else
        {
        	Util.getScreenShot(driver,"Branches");
        	Reporter.log("failed to login to Branches page", true);
        }
		
		//opening and verifying new branches page
		bStatus=AppFunctions.NewBranch(driver);
		if(bStatus)
		 {
			 Reporter.log("New Branch Page opened successfully", true);
			 if(Util.verifyText(driver, "New Branch"))
				 Reporter.log("New Branch Entry is verified", true);
			 else
				 Reporter.log("New Branch Entry is not verified", true);
		 }
		 else
		 {
			 Reporter.log("New Branch page not opened", true);
		 }
		
    }


	@AfterMethod
	public void postCondition() throws InterruptedException 
	{
		Thread.sleep(4000);
        bStatus=AppFunctions.BrowserClose(driver);
        if(bStatus)
        {
        	Reporter.log("close the browser", true);
        }
        else
        {
        	Reporter.log("browser is not closed", true);
        }
	}
}
