package com.monotype.automation.SAMSDashboards;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.monotype.automation.SAMSDashboards.pages.LoginPage.LoginPageMethods;

import utils.OpenBrowser;

public class BaseTest {

	public static WebDriver driver;
	public LoginPageMethods loginPage;
	
	public static void getBaseURL(WebDriver driver, String url)
	{
		driver.get(url);
	}
	
	@BeforeSuite
	public void atBeforeSuite()
	{
		OpenBrowser.chooseBrowser("chrome");
		OpenBrowser.maximizeWindow();
	}
	
	@BeforeTest
	public void atBeforeTest()
	{
		loginPage = PageFactory.initElements(OpenBrowser.driver, LoginPageMethods.class);
	}
}
