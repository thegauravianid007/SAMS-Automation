package com.monotype.SAMSDashboards.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.monotype.SAMSDashboards.pages.BasePage;
import com.monotype.SAMSDashboards.pages.CommonHeaderFooter.CommonHeaderFooterMethods;

public class LoginPageMethods extends BasePage implements LoginPageConstants{

	WebDriver driver;
	//BasePage basePage = new BasePage();
	CommonHeaderFooterMethods commonHeaderFooterMethods = new CommonHeaderFooterMethods(driver);
	
	
	
	//------------------------- CREATE ELEMENTS FROM LOCATORS------------------------------------
	
	
	@FindBy(css = USERNAME_CSS)
	private WebElement userName;

	protected WebElement getUserName() {
		return userName;
	}
	
	@FindBy(css = PASSWORD_CSS)
	private WebElement password;

	protected WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath = SUBMIT_BUTTON_XPATH)
	private WebElement submitButton;

	protected WebElement getSubmitButton() {
		return submitButton;
	}
	
	@FindBy(xpath = RESET_PASSWORD_BUTTON_XPATH)
	private WebElement resetPasswordButton;

	protected WebElement getResetPasswordButton() {
		return resetPasswordButton;
	}
	
	@FindBy(xpath = WELCOME_TEXT_XPATH)
	private WebElement welcomeText;

	protected WebElement getWelcomeText() {
		return welcomeText;
	}
	
	@FindBy(css = PROFILE_BUTTON_CSS)
	private WebElement profileButton;

	protected WebElement getProfileButton() {
		return profileButton;
	}
	
	@FindBy(css = LOGOUT_BUTTON_CSS)
	private WebElement logoutButton;

	protected WebElement getLogoutButton() {
		return logoutButton;
	}
	
	@FindBy(xpath = LOGOUT_TEXT_XPATH)
	private WebElement logoutText;

	protected WebElement getLogoutText() {
		return logoutText;
	}
	
	//------------------------- END OF CREATION OF ELEMENTS--------------------------------------

	
	
	public LoginPageMethods(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterLoginDetails(String user_name, String password)
	{
		enterText(getUserName(), user_name);
		enterText(getPassword(), password);
	}
	
	public void submitLoginDetails()
	{
		getSubmitButton().click();
	}
	
	public boolean isLoginSuccessful()
	{
		return isElementPresent(driver, getWelcomeText());
	}
	
	public boolean isLogoutSuccessful()
	{
		return isElementPresent(driver, getLogoutText());
	}
	
	
	
	
}
