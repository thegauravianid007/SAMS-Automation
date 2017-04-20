package com.monotype.automation.SAMSDashboards.pages.CommonHeaderFooter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonHeaderFooterLocators implements CommonHeaderFooterConstants{

	
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
	
	
			
	}
	
	
	
	
	
	

