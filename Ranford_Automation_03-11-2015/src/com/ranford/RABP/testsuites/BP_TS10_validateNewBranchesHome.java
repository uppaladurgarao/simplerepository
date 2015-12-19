package com.ranford.RABP.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.RABP.appfunctions.AppFunctions;
import com.ranford.locators.Locators;
import com.ranford.utilites.Util;

public class BP_TS10_validateNewBranchesHome {

	WebDriver driver;
	Boolean bStatus;

	 @BeforeMethod
	 public void preCondition() 
	 {
		 driver= AppFunctions.LaunchApplication();
		 bStatus=Util.verifyText(driver, "Banker Login");
		 if(bStatus)
		 {
			 Reporter.log("Browser launched successfully", true);
		 }
		 else
		 {
			 Reporter.log("Browser is not launched successfully", true);
		 }
		 bStatus=AppFunctions.AdminLogin(driver);
		 if(bStatus)
		 {
			 Reporter.log("Admin login successful", true);
			 if(Util.verifyText(driver, "Welcome to Admin"))
			  Reporter.log("Welcome to Admin verified", true);
			 else
				 Reporter.log("Welcome to Admin not Verified", true);
		 }
		 else
		 {
			 Reporter.log("Admin login unsuccessful", true);
		 }
		 
		 bStatus=AppFunctions.Branches(driver);
		 if(bStatus)
		 {
			 Reporter.log("Branches home page opened successfully", true);
			 if(Util.verifyObjectExistance(driver,Locators.Branchespage.imgNewBranch)) 
				 Reporter.log("New Branch is verified", true);
			 else
				 Reporter.log("New branch not verified", true);
		 }
		 else
		 {
			 Reporter.log("Branches home page not opened", true);
		 }
	 }
	 
	 @Test
	 public void testdata() throws InterruptedException
	 {
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
		 Thread.sleep(2000);
		 
		 bStatus=AppFunctions.NewBranchesHomeButton(driver);
		 if(bStatus)
		 {
			 Reporter.log("Admin home page opened successfully", true);
			 if(Util.verifyText(driver, "Welcome to Admin"))
				 Reporter.log("Welcome to Admin is verified", true);
			 else
				 Reporter.log("Welcome to Admin is not verified", true);
		 }
		 else
		 {
			 Reporter.log("Admin home page not opened successfully", true);
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
