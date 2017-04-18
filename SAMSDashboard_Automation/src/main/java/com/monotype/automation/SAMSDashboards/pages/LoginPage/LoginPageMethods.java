package com.monotype.automation.SAMSDashboards.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import com.monotype.automation.SAMSDashboards.pages.BasePage;

public class LoginPageMethods extends LoginPageLocators{

	WebDriver driver;
	BasePage basePage = new BasePage();
	
	public LoginPageMethods(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterLoginDetails(String user_name, String password)
	{
		basePage.enterText(driver, super.getUserName(), "gaurav.sharma@monotype.com");
		basePage.enterText(driver, super.getPassword(), "Monotype123#");
	}
	
	public void submitLoginDetails()
	{
		super.getSubmitButton().click();
	}
	
	
}
