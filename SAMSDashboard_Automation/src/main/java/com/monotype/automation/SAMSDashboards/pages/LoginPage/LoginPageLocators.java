package com.monotype.automation.SAMSDashboards.pages.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators implements LoginPageConstants{

	
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
	
}
