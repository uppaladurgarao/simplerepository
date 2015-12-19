package com.ranford.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ranford.locators.Locators;

public class PageObjects {
	
	public static class GlobalPageObjects
	{
		//Admin Branches Link page object
		public static WebElement imgBranches(WebDriver driver)
		{
			return driver.findElement(Locators.GlobalLocators.lnkBranches);
		}
		
		//Admin Roles Link page object
		public static WebElement imgRoles(WebDriver driver)
		{
			return driver.findElement(Locators.GlobalLocators.lnkRoles);
		}
				
		//Admin Users Link page object
		public static WebElement imgUsers(WebDriver driver)
		{
			return driver.findElement(Locators.GlobalLocators.lnkUsers);
		}
				
		//Admin Employee Link page object
		public static WebElement imgEmployee(WebDriver driver)
		{
			return driver.findElement(Locators.GlobalLocators.lnkEmployee);
		}
		
		//Admin Home Image Page Element
		public static WebElement imgHome(WebDriver driver)
		{
			return driver.findElement(Locators.GlobalLocators.imgHome);
		}
		
		//Admin Logout Image Page Element
		public static WebElement imgLogout(WebDriver driver)
		{
			return driver.findElement(Locators.GlobalLocators.imgLogout);
		}
				
		//Admin Submit Image Page Element
		public static WebElement imgSubmit(WebDriver driver)
		{
			return driver.findElement(Locators.GlobalLocators.imgSubmit);
		}
				
		//Admin Reset Image Page Element
		public static WebElement imgReset(WebDriver driver)
		{
			return driver.findElement(Locators.GlobalLocators.imgReset);
		}
				
		//Admin Cancel Image Page Element
		public static WebElement imgCancel(WebDriver driver)
		{
			return driver.findElement(Locators.GlobalLocators.imgCancel);
		}
	}
	
	//Ranford homePage Visitor links Page objects
  public static class RanfordHomePage
  {
		//BranchName listbox Page element 
		public static WebElement lstBranchName(WebDriver driver)
		 {
			 return driver.findElement(Locators.RanfordHomepage.lstBranchName);
		 }
		 
		//UserName textbox page object
		public static WebElement txtUserName(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.txtUserName);
		}
		
		//Password textbox page object
		public static WebElement txtPassword(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.txtPassword);
		}
		
		//Login Image page object
		public static WebElement imgLogin(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.imgLogin);
		}
		
		//Home Image page element
		public static WebElement imgHome(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.imgHome);
		}
		
		//Personal Banking Image page element
		public static WebElement imgPersonalBanking(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.imgPersonalBanking);
		}
		
		//Corporate Banking Image page element
		public static WebElement imgCorporateBanking(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.imgCorporateBanking);
		}
		
		//International Banking Image page element
		public static WebElement imgInternationalBanking(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.imgInternationalBanking);
		}
		
		//AboutUs Image page element
		public static WebElement imgAboutUs(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.imgAboutUs);
		}
		
		//Customer Service link page object
		public static WebElement lnkCustomerService(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.lnkCustomerService);
		}
		
		//InternetBankingFAQs link page object
		public static WebElement lnkInternetBankingFAQs(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.lnkInternetBankingFAQs);
		}
		
		//Privacy link page object
		public static WebElement lnkPrivacy(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.lnkPrivacy);
		}
				
		//TermsandConditions link page object
		public static WebElement lnkTermsandConditions(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.lnkTermsandConditions);
		}
				
		//Disclaimer link page object
		public static WebElement lnkDisclaimer(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.lnkDisclaimer);
		}
				
		//SiteMap link page object
		public static WebElement lnkSiteMap(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.lnkSiteMap);
		}
		
		//Personal Image page element
		public static WebElement imgPersonal(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.imgPersonal);
		}
					
		//CorporateImage page element
		public static WebElement imgCorporate(WebDriver driver)
		{
			return driver.findElement(Locators.RanfordHomepage.imgCorporate);
		}
						
		//International Image page element
		public static WebElement imgInternational(WebDriver driver)
		{
		    return driver.findElement(Locators.RanfordHomepage.imgInternational);
	    }
  }
   public static class BranchesPage
    {
		 //New Branch image page object
		public static WebElement imgNewBranch(WebDriver driver)
		 {
			 return driver.findElement(Locators.Branchespage.imgNewBranch);
		 }
		
	    //Country listbox page object
	    public static Select lstCountry(WebDriver driver)
		 {
			 return new Select(driver.findElement(Locators.Branchespage.lstCountry));
		 }
	    
	  //State listbox page object
	    public static Select lstState(WebDriver driver)
		 {
			 return new Select(driver.findElement(Locators.Branchespage.lstState));
		 }
	    
	  //City listbox page object
	    public static Select lstCity(WebDriver driver)
		 {
			 return new Select(driver.findElement(Locators.Branchespage.lstCity));
		 }
	    
	    //Search image page object
	    public static WebElement imgSearch(WebDriver driver)
	    {
	    	return driver.findElement(Locators.Branchespage.imgSearch);
	    }
	    
	  //Clear image page object
	    public static WebElement imgClear(WebDriver driver)
	    {
	    	return driver.findElement(Locators.Branchespage.imgClear);
	    }
	}
	
	// New Branch Page Objects 
		public static class NewBranchPage
		{
			//Branch Name Textbox Page object
			public static WebElement txtBranchName(WebDriver driver)
			{
				return driver.findElement(Locators.NewBranchPage.txtBranchName);
			}
			
			//Address1 Textbox Page object
			public static WebElement txtAddress1(WebDriver driver)
			{
				return driver.findElement(Locators.NewBranchPage.txtAddress1);
			}
			
			//Address2 Textbox Page object
			public static WebElement txtAddress2(WebDriver driver)
			{
				return driver.findElement(Locators.NewBranchPage.txtAddress2);
			}
			
			//Address3 Textbox Page object
			public static WebElement txtAddress3(WebDriver driver)
			{
				return driver.findElement(Locators.NewBranchPage.txtAddress3);
			}
			
			//Area Textbox Page object
			public static WebElement txtArea(WebDriver driver)
			{
				return driver.findElement(Locators.NewBranchPage.txtArea);
			}
			
			//Country listbox Page object
			public static Select lstCountry(WebDriver driver)
			{
				return new Select(driver.findElement(Locators.NewBranchPage.lstCountry));
			}
			
			//State listbox Page object
			public static Select lstState(WebDriver driver)
			{
				return new Select(driver.findElement(Locators.NewBranchPage.lstState));
			}
			
			//City listbox Page object
			public static Select lstCity(WebDriver driver)
			{
				return new Select(driver.findElement(Locators.NewBranchPage.lstCity));
			}
			
			//ZipCodeTextbox Page object
			public static WebElement txtZipCode(WebDriver driver)
			{
				return driver.findElement(Locators.NewBranchPage.txtZipCode);
			}
		}
		
		// Roles Page Objects Locators
		public static class RolesPage
		{
			public static WebElement imgNewRole(WebDriver driver)
			{
				return driver.findElement(Locators.RolesPage.imgNewRole);
			}
		}
		
		// New Role Page Objects Locators
		public static class NewRolePage
		{
			// Role Name textbox page element
			public static WebElement txtRoleName(WebDriver driver) 
			{
			    return driver.findElement(Locators.NewRolePage.txtRoleName);
			}
			
			//Role Description Textbox page element
			public static WebElement txtRoleDescription(WebDriver driver) 
			{
			    return driver.findElement(Locators.NewRolePage.txtRoleDescription);
			}
			
			//Role Type listbox page object
		    public static Select lstRoleType(WebDriver driver)
			 {
				 return new Select(driver.findElement(Locators.NewRolePage.lstRoleType));
			 }
		}
		
		// Users Page Object Locators
		public static class UsersPage
		{
			//Branch listbox page element 
			public static Select lstBranch(WebDriver driver)
			{
				return new Select(driver.findElement(Locators.UsersPage.lstBranch));
			}
			
			//Role listbox page element 
			public static Select lstRoles(WebDriver driver)
			{
				return new Select(driver.findElement(Locators.UsersPage.lstRoles));
			}
			
			//Search image page object
			public static WebElement imgSearch(WebDriver driver)
			{
				return driver.findElement(Locators.UsersPage.imgSearch);
			}
			
			//Clear image page object
			public static WebElement imgClear(WebDriver driver)
			{
				return driver.findElement(Locators.UsersPage.imgClear);
			}
			
			//New User image page object
			public static WebElement imgNewUser(WebDriver driver)
			{
				return driver.findElement(Locators.UsersPage.imgNewUser);
			}
		}
	
		// New User Page Object Locators
		public static class NewUserPage
		{
			//New User listbox page object
			public static Select lstRole(WebDriver driver)
			{
				return new Select(driver.findElement(Locators.NewUserPage.lstRole));
			}
			
			//Branch listbox page object
			public static Select lstBranch(WebDriver driver)
			{
				return new Select(driver.findElement(Locators.NewUserPage.lstBranch));
			}
			
			//CustomerID listbox page object
			public static Select lstCustomerID(WebDriver driver)
			{
				return new Select(driver.findElement(Locators.NewUserPage.lstCustomerID));
			}
			
			//CustomerName page object
			public static WebElement txtCustomerName(WebDriver driver)
			{
				return driver.findElement(Locators.NewUserPage.txtCustomerName);
			}
			
			//UserName page object
			public static WebElement txtUserName(WebDriver driver)
			{
				return driver.findElement(Locators.NewUserPage.txtUserName);
			}
			
			//LoginPwd page object
			public static WebElement txtLoginPwd(WebDriver driver)
			{
				return driver.findElement(Locators.NewUserPage.txtLoginPwd);
			}
			
			//TransactionPwd page object
			public static WebElement txtTransactionPwd(WebDriver driver)
			{
				return driver.findElement(Locators.NewUserPage.txtTransactionPwd);
			}
		}
		
		// Employee Page Object Locators
		public static class EmployeePage
		{
			//New Employee image page object
			public static WebElement imgNewEmployee(WebDriver driver)
			{
				return driver.findElement(Locators.EmployeePage.imgNewEmployee);
			}
		}
		

		// New Employee Page Object Locators
		public static class NewEmployeePage
		{
			// New Employee textbox page object
			public static WebElement txtEmployerName(WebDriver driver)
			{
				return driver.findElement(Locators.NewEmployeePage.txtEmployerName);
			}
			
			//Employer Name textbox Page object
			public static WebElement txtLoginPwd(WebDriver driver)
			{
				return driver.findElement(Locators.NewEmployeePage.txtEmployerName);
			}
			
			//Role listbox Page object
			public static Select lstRole(WebDriver driver)
			{
				return new Select(driver.findElement(Locators.NewEmployeePage.lstRole));
			}
			
			//Branch listbox Page object
			public static Select lstBranch(WebDriver driver)
			{
				return new Select(driver.findElement(Locators.NewEmployeePage.lstBranch));
			}
		}
		
		
}

	
	

