package com.monotype.automation.SAMSDashboards.pages.CommonHeaderFooter;

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
	
}
