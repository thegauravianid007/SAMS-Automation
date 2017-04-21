package com.monotype.SAMSDashboards.pages.CommonHeaderFooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.monotype.SAMSDashboards.pages.BasePage;

import utils.CommonMethods;



public class CommonHeaderFooterMethods extends BasePage implements CommonHeaderFooterConstants{

	
	WebDriver driver;
	//BasePage basePage = new BasePage();
	//String timeStamp = String.valueOf(System.currentTimeMillis());
	
	String growlNotificationXPath1 = "//div[contains(text(),'";
	String growlNotificationXPath2 = "')]";
	
	
	//------------------------- CREATE ELEMENTS FROM LOCATORS------------------------------------
	
	@FindBy(css = PROFILE_ICON_CSS)
	private WebElement profileIcon;
	
	protected WebElement getProfileIcon() {
		return profileIcon;
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
	
	@FindBy(css = NEW_BUTTON_CSS)
	private WebElement newButton;
	
	protected WebElement getNewButton() {
		return newButton;
	}
	
	@FindBy(css = NEW_PUBLISHER_BUTTON_CSS)
	private WebElement newPublisherButton;
	
	protected WebElement getNewPublisherButton() {
		return newPublisherButton;
	}
	
	@FindBy(css = NEW_BRAND_BUTTON_CSS)
	private WebElement newBrandButton;
	
	protected WebElement getNewBrandButton() {
		return newBrandButton;
	}
	
	
	@FindBy(css = NEW_PACK_BUTTON_CSS)
	private WebElement newPackButton;
	
	protected WebElement getNewPackButton() {
		return newPackButton;
	}
	
	
	@FindBy(css = NEW_CAMPAIGN_BUTTON_CSS)
	private WebElement newCampaignButton;
	
	protected WebElement getNewCampaignButton() {
		return newCampaignButton;
	}
	
	@FindBy(css = SETTINGS_BUTTON_CSS)
	private WebElement settingsButton;
	
	protected WebElement getSettingsButton() {
		return settingsButton;
	}
	
	@FindBy(css = SWYFT_LINK_CSS)
	private WebElement swyftLink;
	
	protected WebElement getSwyftLink() {
		return swyftLink;
	}
	
	@FindBy(css = ACTIVITY_CSS)
	private WebElement activityLink;
	
	protected WebElement getActivityLink() {
		return activityLink;
	}
	
	
	@FindBy(css = CREATE_CSS)
	private WebElement createButton;
		
	protected WebElement getCreateButton() {
		return createButton;
	}
	
	@FindBy(css = CANCEL_CSS)
	private WebElement cancelButton;
		
	protected WebElement getCancelButton() {
		return cancelButton;
	}
	
	
	
	//----- Locators related to New Publisher------//
	@FindBy(css = PUBLISHER_NAME_CSS)
	private WebElement publisherName;
	
	protected WebElement getPublisherName() {
		return publisherName;
	}
	
	@FindBy(css = PUBLISH_TYPE_CSS)
	private WebElement publishType;
	
	protected WebElement getPublishType() {
		return publishType;
	}
	
	@FindBy(css = DASHBOARD_ID_CSS)
	private WebElement dashboardId;
	
	protected WebElement getDashboardId() {
		return dashboardId;
	}
	
	@FindBy(css = KEY_CONTACT_NAME_CSS)
	private WebElement keyContactName;
	
	protected WebElement getKeyContactName() {
		return keyContactName;
	}
	
	@FindBy(css = KEY_CONTACT_EMAIL_CSS)
	private WebElement keyContactEmail;
	
	protected WebElement getKeyContactEmail() {
		return keyContactEmail;
	}
	
	@FindBy(css = DESIGN_SPECIFICATIONS_CSS)
	private WebElement designSpecifications;
	
	protected WebElement getDesignSpecifications() {
		return designSpecifications;
	}
		
	@FindBy(css = ANDROID_VERSION_CSS)
	private WebElement androidVersion;
		
	protected WebElement getAndroidVersion() {
		return androidVersion;
	}
	
	@FindBy(css = IOS_VERSION_CSS)
	private WebElement iosVersion;
		
	protected WebElement getIosVersion() {
		return iosVersion;
	}
	
	
	//-----------------Locators related to New Brand---------------------------//
	@FindBy(css = BRAND_NAME_CSS)
	private WebElement brandName;
		
	protected WebElement getBrandName() {
		return brandName;
	}
	
	@FindBy(css = BRAND_EMAIL_CSS)
	private WebElement brandEmail;
		
	protected WebElement getBrandEmail() {
		return brandEmail;
	}
	
	@FindBy(css = BRAND_MANAGER_CSS)
	private WebElement brandManager;
		
	protected WebElement getBrandManager() {
		return brandManager;
	}
	

/*	@FindBy(css = SELECT_BRAND_MANAGER_CSS1 + + SELECT_BRAND_MANAGER_CSS2)
	private WebElement selectBrandManagerCss1;
		
	protected WebElement getSelectBrandManagerCss1() {
		return selectBrandManagerCss1;
	}
	

	@FindBy(css = SELECT_BRAND_MANAGER_CSS2)
	private WebElement selectBrandManagerCss2;
*/		
	protected WebElement getSelectBrandManagerCss(String text) {
		return driver.findElement(By.xpath(SELECT_BRAND_MANAGER_XPATH1+ text + SELECT_BRAND_MANAGER_XPATH2));
	}
	
	@FindBy(css = BRAND_MANAGER_SEARCH_CSS)
	private WebElement searchBrandManager;
		
	protected WebElement getSearchBrandManager() {
		return searchBrandManager;
	}
	
	
	
	
	
	
	//-----------------Locators related to New Pack---------------------------//
	
	@FindBy(css = PACK_NAME_CSS)
	private WebElement packName;
		
	protected WebElement getPackName() {
		return packName;
	}
	
	@FindBy(css = PACK_DISTRIBUTION_TYPE_CSS)
	private WebElement packDistributionType;
		
	protected WebElement getPackDistributionType() {
		return packDistributionType;
	}
	
	@FindBy(css = PACK_REVENUE_TYPE_CSS)
	private WebElement packRevenueType;
		
	protected WebElement getPackRevenueType() {
		return packRevenueType;
	}
	
	@FindBy(css = PACK_PRICE_CSS)
	private WebElement packPrice;
		
	protected WebElement getPackPrice() {
		return packPrice;
	}
	
	@FindBy(css = PACK_BRAND_CSS)
	private WebElement packBrand;
		
	protected WebElement getPackBrand() {
		return packBrand;
	}
	
	@FindBy(css = PACK_TAG_CSS)
	private WebElement packTag;
		
	protected WebElement getPackTag() {
		return packTag;
	}
	
	@FindBy(css = PACK_CATEGORY_CSS)
	private WebElement packCategory;
		
	protected WebElement getPackCategory() {
		return packCategory;
	}
	
	//-----------------Locators related to New Campaign---------------------------//
	
	@FindBy(css = CAMPAIGN_NAME_CSS)
	private WebElement campaignName;
		
	protected WebElement getCampaignName() {
		return campaignName;
	}
	
	@FindBy(css = CAMPAIGN_BRAND_CSS)
	private WebElement campaignBrand;
		
	protected WebElement getCampaignBrand() {
		return campaignBrand;
	}
	
	
	
	//------------------------- END OF CREATION OF ELEMENTS--------------------------------------
	
	
	
	
	public CommonHeaderFooterMethods(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void clickNewPackLink(){
		waitAndClickALink(driver,getNewPackButton());
	}
	
	public void clickNewBrandLink(){
		waitAndClickALink(driver,getNewBrandButton());
	}

	public void clickNewPublisherLink(){
		waitAndClickALink(driver,getNewPublisherButton());
	}
	
	public void clickNewCampaignLink(){
		waitAndClickALink(driver,getNewCampaignButton());
	}
	
	public void clickActivitiesLink(){
		waitAndClickALink(driver,getActivityLink());
	}
	
	public void clickSettingsLink() {
		waitAndClickALink(driver,getSettingsButton());
	}
	
	public void clickNewLink(){
		waitAndClickALink(driver,getNewButton());
	}
	
	public void clickProfileButtonLink(){
		waitAndClickALink(driver,getProfileButton());
	}
	
	
	public void clickProfileIconLink(){
		waitAndClickALink(driver,getProfileIcon());
	}
	
	
	public void clickLogout(){
		waitAndClickALink(driver,getLogoutButton());
	}
	
	public void clickSwyftLink()
	{
		waitAndClickALink(driver,getSwyftLink());
	}
	
	public void logout()
	{
		clickProfileIconLink();
		clickLogout();
	}
	
	public void enterNewBrandValues(String brandName, String brandEmail, String brandManager)
	{
		String[] brandManagers = CommonMethods.convertCommaSeparatedToString(brandManager);
		waitAndEnterText(driver,getBrandName(), brandName);
		enterText(getBrandEmail(), brandEmail);
		waitAndClickALink(driver, getBrandManager());		
		for(int i=0; i<brandManagers.length; i++)
		{
			waitAndEnterText(driver,getSearchBrandManager(),brandManagers[i]);
			waitAndClickALink(driver,getSelectBrandManagerCss(brandManagers[i]));
			clearText(getSearchBrandManager());
		}
		//Select The Brand Manager
	}
	
	public void enterNewCampaignValues(String campaignName, String brandName)
	{
		waitAndEnterText(driver,getCampaignName(),campaignName);
		//Select Brand
	}

	public void enterNewPackValues(String packName, String packDistributionType, String packRevenueType, String packPrice, String brandName, String [] tags, String category, String shortDescription, String longDescription, String legalLines)
	{
		waitAndEnterText(driver, getPackName(), packName);
		//Enter Array of Tags
		enterText(getPackCategory(), category);
		
	}
	
	public void enterNewPublisherValues(String publisherName, String publishType, String dashboardId, String keyContactName, String keyContactEmail, String designSpecifications, String androidVersion, String iOSVersion)
	{
		waitAndEnterText(driver,getPublisherName(), publisherName);
		enterText(getKeyContactName(), keyContactName);
		enterText(getKeyContactEmail(), keyContactEmail);
		enterText(getDesignSpecifications(), designSpecifications);
		enterText(getAndroidVersion(), androidVersion);
		enterText(getIosVersion(), iOSVersion);
		waitAndClickALink(driver, getPublishType());
		selectFromDropdownByVisibleText(getPublishType(), publishType);
		waitAndClickALink(driver, getDashboardId());
		selectFromDropdownByVisibleText(getDashboardId(), dashboardId);
	}
	
	public void clickCreate()
	{
		waitAndClickALink(driver, getCreateButton());
	}
	
	public void clickCancel()
	{
		waitAndClickALink(driver, getCancelButton());
	}
	
	public boolean verifyGrowlMessage(String message)
	{
		CommonMethods.waitForElementToBeVisible(driver, By.xpath(growlNotificationXPath1+message+growlNotificationXPath2));
		WebElement element = driver.findElement(By.xpath(growlNotificationXPath1+message+growlNotificationXPath2));
		return CommonMethods.isElementPresent(driver, element);
	}
	
}
