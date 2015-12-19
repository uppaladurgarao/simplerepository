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

public class BP_TS7_validateBranchesEntrySubmit {

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
		 
		 //Configuration 
		 Excel.setExcelConnection("admin_branches_testdata.xls");//setting connection to readable wb
		 Excel.selectSheet("newBranch");//selecting sheet to read
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

			 String sBranchName=Excel.getCellData(0,iRowCount);
			 String sAddress1=Excel.getCellData(1,iRowCount);
			 String sZipCode=Excel.getCellData(2,iRowCount);
			 String sCountry=Excel.getCellData(3,iRowCount);
			 String sState=Excel.getCellData(4,iRowCount);
			 String sCity=Excel.getCellData(5,iRowCount);
			 
		 bStatus=AppFunctions.NewBranchEntry(driver, sBranchName, sAddress1, sZipCode, sCountry, sState, sCity);
		 
		 if(bStatus)
		 {
			 Reporter.log("branch Details entered sucessfully",true);
			 Excel.writeToCell(6, iRowCount, "PASS");
		 }
		 else
		 {
			 Reporter.log("branch Details entered not sucessfully",true);
			 Excel.writeToCell(6, iRowCount, "FAIL");
		 }			 
		 
		 
		 Thread.sleep(2000);
		 
		 AppFunctions.NewBranchesSubmitButton(driver);
		 bStatus=Util.isAlertPresent(driver);
		 if(bStatus)
		 {
			 Reporter.log("Alert text is present", true);
			 String text=Util.getAlertText(driver);
			 Reporter.log(text, true);
			 Util.handleAlert(driver);
			 
		 }
		 else
		 {
			 Reporter.log("Alert is not present", true);
		 }
		 
		 
		 }//data driven ending
	 }
	 
	 @AfterMethod
		public void postCondition() throws InterruptedException 
		{
			Thread.sleep(3000);
			Excel.saveWorkBook();
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
