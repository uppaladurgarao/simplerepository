package com.ranford.RABP.testsuites;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ranford.RABP.appfunctions.AppFunctions;
import com.ranford.locators.Locators;
import com.ranford.utilites.Excel;
import com.ranford.utilites.Util;

public class BP_TS9_validateBranchesEntryCancle {

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
		 
		 Excel.setExcelConnection("admin_branches_testdata.xls");
		 Excel.selectSheet("newBranch");
		 Excel.setWritableWorkbook("admin_branches_testdata.xls");//setting connection to writable wb
		 Excel.selectWritableSheet("newBranch");//selecting sheet to write
	 }
	 
	 @Test
	 public void testdata() throws InterruptedException
	 {
		for(int iRowCount=1;iRowCount<Excel.getRowCount();iRowCount++)//datadriven starting
		{
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
		 Thread.sleep(2000);
		 

		 String sBranchName=Excel.getCellData(0, iRowCount);
		 String sAddress1=Excel.getCellData(1, iRowCount);
		 String sZipCode=Excel.getCellData(2,iRowCount);
		 String sCountry=Excel.getCellData(3,iRowCount);
		 String sState=Excel.getCellData(4,iRowCount);
		 String sCity=Excel.getCellData(5,iRowCount);
		 
		 
		 bStatus=AppFunctions.NewBranchEntry(driver, sBranchName, sAddress1, sZipCode, sCountry, sState, sCity);
		 if(bStatus)
		 {
			 Reporter.log("branch Details entered sucessfully",true);
			 Excel.writeToCell(8, iRowCount, "PASS");
		 }
		 else
		 {
			 Reporter.log("branch Details entered not sucessfully",true);
			 Excel.writeToCell(8, iRowCount, "FAIL");
		 }	
		 Thread.sleep(2000);
		 AppFunctions.NewBranchesCancelButton(driver);
	 }
	 }
	 
	 @AfterMethod
		public void postCondition() throws InterruptedException 
		{
			Thread.sleep(4000);
			Excel.saveWorkBook();
			AppFunctions.BrowserClose(driver);
		}
}
