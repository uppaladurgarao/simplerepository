package com.ranford.utilites;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Util {
	
	 /**********************************************************
	  * Method Name
	  * Method for
	  * Created On
	  * Created By
	  * Reviewed On
	  * Reviewed By
	  *********************************************************/
	
	//verify text Available
	public static boolean verifyText(WebDriver driver,String expectedText)
	{
		try{
		driver.getPageSource().contains(expectedText);
		return true;
		}
		catch(Exception e)
		{
		    e.printStackTrace(); 
			return false;
		}
	}

	 /**********************************************************
	  * Method Name
	  * Method for
	  * Created On
	  * Created By
	  * Reviewed On
	  * Reviewed By
	  *********************************************************/

	//objectExistance
	
	public static boolean verifyObjectExistance(WebDriver driver,By prop)
	{
		try{
		driver.findElement(prop).isDisplayed();
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}		

	 /**********************************************************
	  * Method Name
	  * Method for
	  * Created On
	  * Created By
	  * Reviewed On
	  * Reviewed By
	  *********************************************************/
		
		//screeen shot
		public static boolean getScreenShot(WebDriver driver,String fileName)
		{
			try{
			
				Date date=new Date();
				DateFormat  formate=new SimpleDateFormat("DD:MM:YYYY");
				 String  dat=formate.format(date);
		
				
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(srcFile, new File("D:\\screenshot"+dat+fileName+".png"));
				
				
			return true;
			}
			catch(Exception e)
			{
				return false;
			}
		
	}
	
//verify attribute text 
		public static boolean verifyTextBoxValue(WebDriver driver,By prop)
		{
			    String value=driver.findElement(prop).getAttribute("value");
			    
			    if(!value.matches(""))
			    {
			    	return true;
			    }
			    else
			    {
			    return false;
			    }
		}
	
		//verify alert existance
				public static boolean isAlertPresent(WebDriver driver)
				{
					try{
					   driver.switchTo().alert();
					    
					   return true;
					}catch(Exception e)
					{
						return false;
					}					   
				}
				//get Text from alert
				public static String getAlertText(WebDriver driver)
				{
					try{
					 return  driver.switchTo().alert().getText();
					 
					}catch(Exception e)
					{
						return null;
					}					   
				}
	
	
				//handle alert
				public static boolean handleAlert(WebDriver driver)
				{
					try{
						driver.switchTo().alert().accept();
					 return true;
							 					 
					}catch(Exception e)
					{
						return false;
					}					   
				}
	
	
	
}
