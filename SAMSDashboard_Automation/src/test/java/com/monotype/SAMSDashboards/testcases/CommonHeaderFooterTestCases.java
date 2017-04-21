package com.monotype.SAMSDashboards.testcases;



import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.monotype.SAMSDashboards.BaseTest;
import com.monotype.SAMSDashboards.pages.CommonHeaderFooter.CommonHeaderFooterMethods;



public class CommonHeaderFooterTestCases extends BaseTest{
	
	String URL = "https://sams-staging.swyftmedia.com";
	String timeStamp = String.valueOf(System.currentTimeMillis());
	
	
	

	@BeforeMethod
	public void atBeforeMethod()
	{
		getBaseURL(driver, URL);
		loginPage.enterLoginDetails(getXLSXValue("email"), getXLSXValue("password"));
		loginPage.submitLoginDetails();
		Assert.assertTrue(loginPage.isLoginSuccessful());
		commonHeaderFooterMethods = PageFactory.initElements(driver, CommonHeaderFooterMethods.class);
		commonHeaderFooterMethods.clickNewLink();
	}
	
	/*@Test
	public void createNewPublisher()
	{
		commonHeaderFooterMethods.clickNewPublisherLink();		
		commonHeaderFooterMethods.enterNewPublisherValues(getXLSXValue("PublisherName")+timeStamp, getXLSXValue("PublisherType"), getXLSXValue("DashboardID"), getXLSXValue("KeyContactName"), getXLSXValue("KeyContactEmail"), getXLSXValue("DesignSpecifications"), getXLSXValue("AndroidVersion"), getXLSXValue("iOSVersion"));
		commonHeaderFooterMethods.clickCreate();
		Assert.assertTrue(commonHeaderFooterMethods.verifyGrowlMessage(getXLSXValue("newPublisherGrowl1")+getXLSXValue("PublisherName")+timeStamp+getXLSXValue("newPublisherGrowl2")));
	}*/
	
	@Test
	public void createNewBrand()
	{
		commonHeaderFooterMethods.clickNewBrandLink();
		commonHeaderFooterMethods.enterNewBrandValues(getXLSXValue("brandName")+timeStamp, getXLSXValue("brandEmail1")+timeStamp+getXLSXValue("brandEmail2"), getXLSXValue("brandManager"));
		commonHeaderFooterMethods.clickCreate();
		Assert.assertTrue(commonHeaderFooterMethods.verifyGrowlMessage(getXLSXValue("newBrandGrowl1")+getXLSXValue("brandName")+timeStamp+getXLSXValue("newBrandGrowl2")));
	}
	
	/*
	 	@Test
	public void createNewPack()
	{
		commonHeaderFooterMethods.clickNewPackLink();
		//commonHeaderFooterMethods.enterNewPackValues(packName, packDistributionType, packRevenueType, packPrice, brandName, tags, category, shortDescription, longDescription, legalLines);
		commonHeaderFooterMethods.clickCreate();
		Assert.assertTrue(true);
	}
	
	@Test
	public void createNewCampaign()
	{
		commonHeaderFooterMethods.clickNewCampaignLink();
		//commonHeaderFooterMethods.enterNewCampaignValues(campaignName, brandName);
		commonHeaderFooterMethods.clickCreate();
		Assert.assertTrue(true);
	}*/
	
	@AfterMethod
	public void atAfterMethod()
	{
		logout(driver);
		Assert.assertTrue(loginPage.isLogoutSuccessful());
	}
	
}
