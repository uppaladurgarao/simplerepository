package com.ranford.RABP.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.RABP.appfunctions.AppFunctions;

public class BP_TS11_validateNewBranchesLogOut {

	WebDriver driver;

	 @BeforeMethod
	 public void preCondition() 
	 {
		 driver= AppFunctions.LaunchApplication();
		 AppFunctions.AdminLogin(driver);
		 AppFunctions.Branches(driver);
	 }
	 
	 @Test
	 public void testdata() throws InterruptedException
	 {
		 AppFunctions.NewBranch(driver);
		 Thread.sleep(2000);
		 AppFunctions.NewBranchesLogoutButton(driver);
	 }
	 
	 @AfterMethod
		public void postCondition() throws InterruptedException 
		{
			Thread.sleep(4000);
			AppFunctions.BrowserClose(driver);
		}
}
