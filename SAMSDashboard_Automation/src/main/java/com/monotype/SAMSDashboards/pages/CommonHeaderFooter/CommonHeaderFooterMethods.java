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
