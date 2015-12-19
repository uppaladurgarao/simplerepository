package com.ranford.RABP.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.RABP.appfunctions.AppFunctions;
import com.ranford.locators.Locators;
import com.ranford.utilites.Util;

public class BP_TS4_ValidateBranchesLogOut {

	WebDriver driver;
	Boolean bStatus;

	@BeforeMethod
	 public void preCondition() 
	 {
		 //launching browser and verifying ranford home page
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
		 
		 //admin login and verifying it
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
		 
		 //opening and verifying branches page
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
	 }
	 
	 @Test
	 public void testcase()
	 {
		 //checking logout functionality and verifying logout
		 bStatus=AppFunctions.BranchesLogoutButton(driver);
		 if(bStatus)
		 {
			 Reporter.log("log out successful", true);
			 if(Util.verifyText(driver, "Banker Login"))
				 Reporter.log("Banker Login text is verified", true);
			 else
				 Reporter.log("Banker Login text is notverified", true); 
		 }
		 else
		 {
			 Reporter.log("log out unsuccessful", true);
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
