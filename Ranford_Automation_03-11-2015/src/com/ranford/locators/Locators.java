package com.ranford.locators;

import org.openqa.selenium.By;

public class Locators {
	
	public static class GlobalLocators
	{
	    //Admin Branches link Locator
		public static By lnkBranches = By.xpath("//img[@src='images/Branches_but.jpg']");
		//Admin Roles Link Locator
		public static By lnkRoles = By.xpath("//img[@src='images/Roles_but.jpg']");
		//Admin Users Link Locator
		public static By lnkUsers = By.xpath("//img[@src='images/Users_but.jpg']");
		//Admin Employee Link Locator
		public static By lnkEmployee = By.xpath("//img[@src='images/emp_btn.jpg']");
		//Admin Home Image Locator
		public static By imgHome = By.xpath("//img[@src='images/admin_but_01.jpg']");
		//Admin Logout Button
		public static By imgLogout = By.xpath("//img[@src='images/admin_but_03.jpg']");
		//Admin Submit Button Locator
		public static By imgSubmit = By.xpath("//input[@name='btn_insert' or @name= 'btninsert' or @name='BtnSubmit']");
		//Admin Reset Button Locator
		public static By imgReset = By.xpath("//input[@name='Btn_Reset' or @name='btnreset']");
		//Admin Cancel Button Locator
		public static By imgCancel = By.xpath("//input[@name='Btn_cancel' or @name='btnCancel']");
		
	}
	
	// Admin Homepage visitor links locators
	public static class RanfordHomepage
	{
		//Branch Name Locator
		public static By lstBranchName = By.id("drlist");
        //User Name Textbox Locator
		public static By txtUserName = By.id("txtuId");
	    //Password Textbox Locator
		public static By txtPassword = By.id("txtPword");
		//Login Image Locator
		public static By imgLogin = By.id("login");
		//Ranford Home Image Locator
		public static By imgHome = By.xpath(".//*[@id='Table_07']/tbody/tr/td[2]/a/img");
		//Personal Banking Image Locator
		public static By imgPersonalBanking = By.xpath(".//*[@id='IMG3']");
		//Corporate Banking Image Locator
		public static By imgCorporateBanking = By.xpath(".//*[@id='Table_07']/tbody/tr/td[4]/a/img");
		//International Banking Image Locator
		public static By imgInternationalBanking = By.xpath(".//*[@id='Table_07']/tbody/tr/td[5]/a/img");
		//About Us Image Locator
		public static By imgAboutUs = By.xpath(".//*[@id='Table_07']/tbody/tr/td[6]/a/img");
		//Customer Service Link Locator
		public static By lnkCustomerService = By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[1]/td/div/span/a[1]");
		//Internet Banking FAQs Link Locator
		public static By lnkInternetBankingFAQs = By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[1]/td/div/span/a[2]");
		//Privacy Link Locator
		public static By lnkPrivacy = By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[1]/td/div/span/a[3]");
		//Terms and Conditions Link Locator
		public static By lnkTermsandConditions = By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[1]/td/div/span/a[4]");
		//Disclaimer Link Locator
		public static By lnkDisclaimer = By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[1]/td/div/span/a[5]");
		//Site Map Link Locator
		public static By lnkSiteMap = By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[1]/td/div/span/a[6]");
		//Personal Link Locator
		public static By imgPersonal = By.id("personal");
		//Corporate Link Locator
		public static By imgCorporate = By.id("corporate");
		//International Link Locator
		public static By imgInternational = By.id("NRI");
		
	}
	
	// Branches Page Objects Locators
	public static class Branchespage
	{
		//New Branch link Locator
		public static By imgNewBranch = By.xpath(".//*[@id='BtnNewBR']");
		//Country Listbox Locator
		public static By lstCountry = By.id("lst_countryS");
		//State Listbox Locator
		public static By lstState = By.id("lst_stateS");
		//City Listbox Locator
		public static By lstCity = By.id("lst_cityS");
		//Search Button Locator
		public static By imgSearch = By.id("btn_search");
		//Clear Button Locator
		public static By imgClear = By.id("btn_clsearch");
		
	}
	
	// New Branch Page Objects Locators
	public static class NewBranchPage
	{
		//Branch Name Textbox locator
		public static By txtBranchName = By.id("txtbName");
		//Address1 Textbox locator
		public static By txtAddress1 = By.id("txtAdd1");
		//Address2 Textbox locator
		public static By txtAddress2 = By.id("Txtadd2");
		//Address3 Textbox locator
		public static By txtAddress3 = By.id("txtadd3");
		// Area Textbox Locator
		public static By txtArea = By.id("txtArea");
		// ZipCode Textbox Locator
		public static By txtZipCode = By.id("txtZip");
		// Country Listbox locator
		public static By lstCountry = By.id("lst_counrtyU");
		// State Listbox locator
		public static By lstState = By.id("lst_stateI");
		// City Listbox locator
		public static By lstCity = By.id("lst_cityI");
		
	}
	
	// Roles Page Objects Locators
	public static class RolesPage
	{
		// NewRole Image Locator
		public static By imgNewRole = By.xpath(".//*[@id='btnRoles']");
	}
	
	// New Role Page Objects Locators
	public static class NewRolePage
	{
		//Role Name Textbox Locator
		public static By txtRoleName = By.id("txtRname");
		//Role Description Textbox Locator
		public static By txtRoleDescription = By.id("txtRDesc");
		//Role Type Listbox Locator
		public static By lstRoleType = By.id("lstRtypeN");
	}
	
	// Users Page Object Locators
	public static class UsersPage
	{
		// Branch Listbox Locator
		public static By lstBranch = By.id("lst_branchS") ;
		// Roles Listbox Locator
		public static By lstRoles = By.id("lst_rolesS");
		// Search Button Locator
		public static By imgSearch = By.id("btn_search");
		// Clear Button Locator
		public static By imgClear = By.id("btn_clear");
		// New User Button Locator
		public static By imgNewUser = By.id("Btnuser");
		
	}
	
	// New User Page Object Locators
	public static class NewUserPage
	{
		//Role Listbox Locator
		public static By lstRole = By.id("lst_Roles");
		//Branch Listbox Locator
		public static By lstBranch = By.id("lst_Branch");
		//CustomerID Listbox Locator
		public static By lstCustomerID = By.id("DrCName");
		//Customer Name Textbox Locator
		public static By txtCustomerName = By.id("Lbc_name");
		//User Name Textbox Locator
		public static By txtUserName = By.id("txtUname");
		//Login Password Textbox Locator
		public static By txtLoginPwd = By.id("txtLpwd");
		//Transaction Password Textbox Locator
		public static By txtTransactionPwd = By.id("txtTpwd");
	}
	
	// Employee Page Object Locators
	public static class EmployeePage
	{
		// New Employee Image Locator
		public static By imgNewEmployee = By.xpath(".//*[@id='BtnNew']");
	}
	
	// New Employee Page Object Locators
	public static class NewEmployeePage
	{
		// Employer Name Textbox Locator
		public static By txtEmployerName = By.id("txtUname");
		// Login Password Textbox Locator
		public static By txtLoginPwd = By.id("txtLpwd");
		// Role Listbox Locator
		public static By lstRole = By.id("lst_Roles");
		// Branch Listbox Locator
		public static By lstBranch = By.id("lst_Branch");
	}
}
