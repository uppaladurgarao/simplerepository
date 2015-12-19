package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ranford.RABP.appfunctions.AppFunctions;
import com.ranford.utilites.Util;

public class WebTable {
	WebDriver driver;
	Boolean bFlage=false;
  @Test
  public void f() throws Exception {
	  driver = AppFunctions.LaunchApplication();
	  
	  AppFunctions.AdminLogin(driver);
	  AppFunctions.Branches(driver);
	  
	  String totalTableCount = driver.findElement(By.xpath(".//*[@id='DG_bankdetails']/tbody/tr[7]/td")).getText(); //locatiing pages text with firebug
	                                                                                                                //and storing into string
	  String[] tableLinks = totalTableCount.split(" "); //spliting string and storing into array
	  
	  for(int iTableCount=1; iTableCount<tableLinks.length; iTableCount++)
	  {
		  //locating the table (xpath of table/tbody)since rows are in tbody
		  WebElement objTable = driver.findElement(By.xpath(".//*[@id='DG_bankdetails']/tbody"));
		  
		  //targetting the rows present in tbody
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
				  if(colText.contains("11"))
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
  }
}
