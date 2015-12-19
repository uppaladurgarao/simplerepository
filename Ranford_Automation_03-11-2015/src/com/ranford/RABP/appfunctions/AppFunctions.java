package com.ranford.RABP.appfunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.ranford.configure.Config;
import com.ranford.pageobjects.PageObjects;
import com.ranford.testdata.TestData;
import com.ranford.utilites.Util;

public class AppFunctions {

	     /***********************************************************
	      * Method Name    : LaunchApplication
	      * Method For     : It launches the application in the browser
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	      * @return
	      ************************************************************/
	
	     public static WebDriver LaunchApplication()
	     {
	    	 WebDriver driver = null;
	    	 
	    	 switch(Config.sBrowser)
	    	 {
	    	 
	    	 //selecting the firefox driver
	    	 case "Firefox":
	    	 {
	    		 driver=new FirefoxDriver();
	    		 break;
	    	 }
	    	 
	    	 //selecting chrome driver
	    	 case "Chrome":
	    	 {
	    		 System.setProperty("WebDriver.chrome.driver", "chrome.exe path");
	    		 driver=new ChromeDriver();
	    		 break;
	    	 }
	    	 }
	    	 
	    	 //get the URL
	    	 driver.get(Config.sURL2);
	    	 driver.manage().window().maximize();
	    	 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	    	 
	    	 return driver;
	     }
	     
	     /***********************************************************
	      * Method Name    : AdminLogin
	      * Method For     : It navigates to admin home page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	      * @return
	      ************************************************************/
	     
	     public static boolean AdminLogin(WebDriver driver)
	     {
	    	 try{
	    		 PageObjects.RanfordHomePage.txtUserName(driver).sendKeys(TestData.RanfordHomePage.sUserName);
	    	     PageObjects.RanfordHomePage.txtPassword(driver).sendKeys(TestData.RanfordHomePage.sPassword);
	    	     PageObjects.RanfordHomePage.imgLogin(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : Branches
	      * Method For     : It navigates to Branches page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	      ************************************************************/
	     public static boolean Branches(WebDriver driver)
	     {
	    	 try{
	    	     PageObjects.GlobalPageObjects.imgBranches(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : BrowserClose
	      * Method For     : It Closes the browser
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	      ************************************************************/
	     public static boolean BrowserClose(WebDriver driver)
	     {
	    	 try{
	    	     driver.quit();;
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranch
	      * Method For     : It navigates to new branch creation page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranch(WebDriver driver)
	     {
	    	 try{
	    	     PageObjects.BranchesPage.imgNewBranch(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : BranchesHomeButton
	      * Method For     : It navigates to admin home page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean BranchesHomeButton(WebDriver driver)
	     {
	    	 try{
	    	     PageObjects.GlobalPageObjects.imgHome(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : BranchesLogoutButton
	      * Method For     : It navigates to ranford home page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean BranchesLogoutButton(WebDriver driver)
	     {
	    	 try{
	    	     PageObjects.GlobalPageObjects.imgLogout(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : SelectBranchDetails
	      * Method For     : It displays the selected Country, State and City
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean SelectBranchDetails(WebDriver driver)
	     {
	    	 try{
	    	     PageObjects.BranchesPage.lstCountry(driver).selectByVisibleText(TestData.BranchesPage.sCountry);
	    	     PageObjects.BranchesPage.lstState(driver).selectByVisibleText(TestData.BranchesPage.sState);
	    	     PageObjects.BranchesPage.lstCity(driver).selectByVisibleText(TestData.BranchesPage.sCity);
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : BranchesSearchButton
	      * Method For     : It displays branches details based on the selected Country, State and City
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean BranchesSearchButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.BranchesPage.imgSearch(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : BranchesClearButton
	      * Method For     : It displays branches details based on the selected Country, State and City
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean BranchesClearButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.BranchesPage.imgClear(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranchEntry
	      * Method For     : It fills the fields in new branch entry page with given test data
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranchEntry(WebDriver driver, String sBranchName,String sAddress1,String sZipCode,String sCountry,String sState,String sCity)
	     {
	    	 try{
	    	    PageObjects.NewBranchPage.txtBranchName(driver).sendKeys(sBranchName);
	    	    PageObjects.NewBranchPage.txtAddress1(driver).sendKeys(sAddress1);
	    	    PageObjects.NewBranchPage.txtAddress2(driver).sendKeys(TestData.NewBranchPage.sAddress2);
	    	    PageObjects.NewBranchPage.txtAddress3(driver).sendKeys(TestData.NewBranchPage.sAddress3);
	    	    PageObjects.NewBranchPage.txtArea(driver).sendKeys(TestData.NewBranchPage.sArea);
	    	    PageObjects.NewBranchPage.txtZipCode(driver).sendKeys(sZipCode);
	    	    PageObjects.NewBranchPage.lstCountry(driver).selectByVisibleText(sCountry);
	    	    PageObjects.NewBranchPage.lstState(driver).selectByVisibleText(sState);
	    	    PageObjects.NewBranchPage.lstCity(driver).selectByVisibleText(sCity);
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranchesSubmitButton
	      * Method For     : It creates new branches page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranchesSubmitButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.GlobalPageObjects.imgSubmit(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranchesResetButton
	      * Method For     : It resets all the fields to default
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranchesResetButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.GlobalPageObjects.imgReset(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranchesCancelButton
	      * Method For     : It navigates to branch details page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranchesCancelButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.GlobalPageObjects.imgCancel(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranchesHomeButton
	      * Method For     : It navigates to admin home page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranchesHomeButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.GlobalPageObjects.imgHome(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     /***********************************************************
	      * Method Name    : NewBranchesLogoutButton
	      * Method For     : It navigates to ranford home page
	      * Created By     :
	      * Created On     :
	      * Reviewed By    :
	      * Reviewed On    :
	     * @return 
	      ************************************************************/
	     public static boolean NewBranchesLogoutButton(WebDriver driver)
	     {
	    	 try{
	    	    PageObjects.GlobalPageObjects.imgLogout(driver).click();
	    	     return true;
	    	 }catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	    	 
	     }
	     
	     
	     
	     //clicking edit button in branch details web table
	     
	     public static boolean editWebTable(WebDriver driver, String expectedtext) throws Exception
	     {
	    	 Boolean bFlage=false;
	    	 String totalTableCount = driver.findElement(By.xpath(".//*[@id='DG_bankdetails']/tbody/tr[7]/td")).getText(); //locatiing pages text with firebug
             //and storing into string
String[] tableLinks = totalTableCount.split(" "); //splitting string and storing into array

for(int iTableCount=1; iTableCount<tableLinks.length; iTableCount++)
{
//locating the table (xpath of table/tbody)since rows are in tbody
WebElement objTable = driver.findElement(By.xpath(".//*[@id='DG_bankdetails']/tbody"));

//targeting the rows present in tbody
List<WebElement> objRows = objTable.findElements(By.tagName("tr"));

//loop through each row
for(int iRowCount=1; iRowCount<objRows.size(); iRowCount++)
{
List<WebElement> objColumns = objRows.get(iRowCount).findElements(By.tagName("td"));

//loop through each column
for(int iColCount=0; iColCount<objColumns.size(); iColCount++)
{
String colText = objColumns.get(iColCount).getText();
System.out.println(colText);
if(colText.contains(expectedtext))
{
objColumns.get(6).findElement(By.tagName("a")).click();
driver.findElement(By.id("txtzipu")).sendKeys("23456");
driver.findElement(By.id("btnupdate")).click();

if(Util.isAlertPresent(driver))
{
Reporter.log(Util.getAlertText(driver), true);
//handling alert text
Util.handleAlert(driver);
}

bFlage=true;
break; //comes out of 3rd for loop
}

}
if(bFlage==true)
break;//comes out of 2nd for loop

}
if(bFlage==true)
break;//comes out of 1st for loop
else{
Thread.sleep(2000);
driver.findElement(By.linkText(tableLinks[iTableCount])).click();
}
}
return true;
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
}
