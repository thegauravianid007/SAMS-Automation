package com.monotype.SAMSDashboards.pages.CommonHeaderFooter;

public interface CommonHeaderFooterConstants {

	String PROFILE_ICON_CSS = "button.btn-profile";
	String PROFILE_BUTTON_CSS = "a[ui-sref='portal.profile']";
	String LOGOUT_BUTTON_CSS = "a[ng-click='logOut()']";
	String NEW_BUTTON_CSS = "button.btn-new";
	String NEW_PUBLISHER_BUTTON_CSS = "a[ng-click='createApp()']";
	String NEW_BRAND_BUTTON_CSS = "a[ng-click='createBrand()']";
	String NEW_PACK_BUTTON_CSS = "a[ng-click='createPack()']";
	String NEW_CAMPAIGN_BUTTON_CSS = "a[ng-click='createCampaign()']";
	String SETTINGS_BUTTON_CSS = "a[ui-sref='portal.settings.list']";
	String SWYFT_LINK_CSS = "img[alt='Swyft Logo']";
	String ACTIVITY_CSS = "";
	
	String CREATE_CSS = "button.create";
	String CANCEL_CSS = "button[ng-click='cancel()']";
	
	
	
	//-------Locators related to New Publisher-------//
	
	String PUBLISHER_NAME_CSS = "input[name='appName']";
	String PUBLISH_TYPE_CSS = "select[name='publishTypeId']";
	String DASHBOARD_ID_CSS = "select[name='dashboardId']";
	String KEY_CONTACT_NAME_CSS = "input[name='keyContactName']";
	String KEY_CONTACT_EMAIL_CSS = "input[name='keyContactEmail']";
	String DESIGN_SPECIFICATIONS_CSS = "textarea[name='designSpecifications']";
	String ANDROID_VERSION_CSS = "input[name='androidVersion']";
	String IOS_VERSION_CSS = "input[name='iosVersion']";
	
	//-------Locators related to New Brand-------//
	
	String BRAND_NAME_CSS = "input[name='brandName']";
	String BRAND_EMAIL_CSS = "input[name='brandEmail']";
	String BRAND_MANAGER_CSS = "div[name='brandManager'] button";
	String BRAND_MANAGER_SEARCH_CSS = "div.show input[placeholder='Search...']";
	String SELECT_BRAND_MANAGER_XPATH1 = "//div[@name='brandManager']//span[contains(text(),'";
	String SELECT_BRAND_MANAGER_XPATH2 = "')]";
	
	//-------Locators related to New Pack-------//
	
	String PACK_NAME_CSS = "";
	String PACK_DISTRIBUTION_TYPE_CSS = "";
	String PACK_REVENUE_TYPE_CSS = "";
	String PACK_PRICE_CSS = "";
	String PACK_BRAND_CSS = "";
	String PACK_TAG_CSS = "";
	String PACK_CATEGORY_CSS = "";
	
	
	//-------Locators related to New Campaign-------//
	
	String CAMPAIGN_NAME_CSS = "";
	String CAMPAIGN_BRAND_CSS = "";
	
	
	
}
