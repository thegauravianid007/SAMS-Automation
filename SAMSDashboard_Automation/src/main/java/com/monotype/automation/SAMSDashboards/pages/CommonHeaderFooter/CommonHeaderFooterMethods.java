package com.monotype.automation.SAMSDashboards.pages.CommonHeaderFooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.monotype.automation.SAMSDashboards.pages.BasePage;

import utils.CommonMethods;



public class CommonHeaderFooterMethods extends CommonHeaderFooterLocators{

	
	WebDriver driver;
	BasePage basePage = new BasePage();
	//String timeStamp = String.valueOf(System.currentTimeMillis());
	
	String growlNotificationXPath1 = "//div[contains(text(),'";
	String growlNotificationXPath2 = "')]";
	
	public CommonHeaderFooterMethods(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void clickNewPackLink(){
		basePage.waitAndClickALink(driver,super.getNewPackButton());
	}
	
	public void clickNewBrandLink(){
		basePage.waitAndClickALink(driver,super.getNewBrandButton());
	}

	public void clickNewPublisherLink(){
		basePage.waitAndClickALink(driver,super.getNewPublisherButton());
	}
	
	public void clickNewCampaignLink(){
		basePage.waitAndClickALink(driver,super.getNewCampaignButton());
	}
	
	public void clickActivitiesLink(){
		basePage.waitAndClickALink(driver,super.getActivityLink());
	}
	
	public void clickSettingsLink() {
		basePage.waitAndClickALink(driver,super.getSettingsButton());
	}
	
	public void clickNewLink(){
		basePage.waitAndClickALink(driver,super.getNewButton());
	}
	
	public void clickProfileButtonLink(){
		basePage.waitAndClickALink(driver,super.getProfileButton());
	}
	
	
	public void clickProfileIconLink(){
		basePage.waitAndClickALink(driver,super.getProfileIcon());
	}
	
	
	public void clickLogout(){
		basePage.waitAndClickALink(driver,super.getLogoutButton());
	}
	
	public void clickSwyftLink()
	{
		basePage.waitAndClickALink(driver,super.getSwyftLink());
	}
	
	public void logout()
	{
		clickProfileIconLink();
		clickLogout();
	}
	
	public void enterNewBrandValues(String brandName, String brandEmail, String [] brandManager)
	{
		
	}
	
	public void enterNewCampaignValues(String campaignName, String brandName)
	{
		
	}

	public void enterNewPackValues(String packName, String packDistributionType, String packRevenueType, String packPrice, String brandName, String [] tags, String category, String shortDescription, String longDescription, String legalLines)
	{
		
	}
	
	public void enterNewPublisherValues(String publisherName, String publishType, String dashboardId, String keyContactName, String keyContactEmail, String designSpecifications, String androidVersion, String iOSVersion)
	{
		basePage.waitAndEnterText(driver,super.getPublisherName(), publisherName);
		basePage.enterText(super.getKeyContactName(), keyContactName);
		basePage.enterText(super.getKeyContactEmail(), keyContactEmail);
		basePage.enterText(super.getDesignSpecifications(), designSpecifications);
		basePage.enterText(super.getAndroidVersion(), androidVersion);
		basePage.enterText(super.getIosVersion(), iOSVersion);
		basePage.waitAndClickALink(driver, super.getPublishType());
		basePage.selectFromDropdownByVisibleText(super.getPublishType(), publishType);
		basePage.waitAndClickALink(driver, super.getDashboardId());
		basePage.selectFromDropdownByVisibleText(super.getDashboardId(), dashboardId);
	}
	
	public void clickCreate()
	{
		basePage.waitAndClickALink(driver, super.getCreateButton());
	}
	
	public void clickCancel()
	{
		basePage.waitAndClickALink(driver, super.getCancelButton());
	}
	
	public boolean verifyGrowlMessage(String message)
	{
		CommonMethods.waitForElementToBeVisible(driver, By.xpath(growlNotificationXPath1+message+growlNotificationXPath2));
		WebElement element = driver.findElement(By.xpath(growlNotificationXPath1+message+growlNotificationXPath2));
		return CommonMethods.isElementPresent(driver, element);
	}
	
}
