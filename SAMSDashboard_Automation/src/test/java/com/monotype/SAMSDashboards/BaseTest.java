package com.monotype.SAMSDashboards;


import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.monotype.SAMSDashboards.pages.CommonHeaderFooter.CommonHeaderFooterMethods;
import com.monotype.SAMSDashboards.pages.LoginPage.LoginPageMethods;

import utils.DecodeXLData;
import utils.OpenBrowser;

public class BaseTest {

	public static WebDriver driver;
	public LoginPageMethods loginPage;
	public CommonHeaderFooterMethods commonHeaderFooterMethods = new CommonHeaderFooterMethods(driver); 
	
	String sheetName = "Sheet1";
	String pathToXLSX = ".\\SAMS_Dashboard_Data.xlsx";
	HashMap<String,String> importXLSXData;
	

	
	public  void getBaseURL(WebDriver driver, String url)
	{
		driver.get(url);
	}
	
	public String getXLSXValue(String key)
	{
		return importXLSXData.get(key);
	}
	
	
	public  void logout(WebDriver driver)
	{
		commonHeaderFooterMethods.logout();
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
		driver = OpenBrowser.driver;
		loginPage = PageFactory.initElements(driver, LoginPageMethods.class);
		importXLSXData= DecodeXLData.getXLSXData(sheetName, pathToXLSX);
		
	}
}
