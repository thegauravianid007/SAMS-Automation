package com.monotype.automation.SAMSDashboards.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import com.monotype.automation.SAMSDashboards.pages.BasePage;
import com.monotype.automation.SAMSDashboards.pages.CommonHeaderFooter.CommonHeaderFooterMethods;

public class LoginPageMethods extends LoginPageLocators{

	WebDriver driver;
	BasePage basePage = new BasePage();
	CommonHeaderFooterMethods commonHeaderFooterMethods = new CommonHeaderFooterMethods(driver);
	
	public LoginPageMethods(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterLoginDetails(String user_name, String password)
	{
		basePage.enterText(super.getUserName(), "gaurav.sharma@monotype.com");
		basePage.enterText(super.getPassword(), "Monotype123#");
	}
	
	public void submitLoginDetails()
	{
		super.getSubmitButton().click();
	}
	
	public boolean isLoginSuccessful()
	{
		return basePage.isElementPresent(driver, super.getWelcomeText());
	}
	
	public boolean isLogoutSuccessful()
	{
		return basePage.isElementPresent(driver, super.getLogoutText());
	}
	
	
	
	
}
