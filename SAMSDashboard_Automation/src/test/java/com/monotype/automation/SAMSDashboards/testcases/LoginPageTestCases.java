package com.monotype.automation.SAMSDashboards.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.monotype.automation.SAMSDashboards.BaseTest;
import com.monotype.automation.SAMSDashboards.pages.CommonHeaderFooter.CommonHeaderFooterMethods;



public class LoginPageTestCases  extends BaseTest{

	String URL = "https://sams-staging.swyftmedia.com";

	@Test
	public void loginWithValidDetails() {
		getBaseURL(driver, URL);
		loginPage.enterLoginDetails(getXLSXValue("email"), getXLSXValue("password"));
		loginPage.submitLoginDetails();
		Assert.assertTrue(loginPage.isLoginSuccessful());
		commonHeaderFooterMethods = PageFactory.initElements(driver, CommonHeaderFooterMethods.class);		
		logout(driver);
		Assert.assertTrue(loginPage.isLogoutSuccessful());
	}
	
	
}
