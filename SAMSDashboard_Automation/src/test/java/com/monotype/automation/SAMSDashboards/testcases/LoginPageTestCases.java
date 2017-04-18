package com.monotype.automation.SAMSDashboards.testcases;

import org.testng.annotations.Test;

import com.monotype.automation.SAMSDashboards.BaseTest;

import junit.framework.Assert;
import utils.OpenBrowser;

public class LoginPageTestCases  extends BaseTest{

	String URL = "https://sams-staging.swyftmedia.com";

	@Test
	public void atTest() {
		getBaseURL(OpenBrowser.driver, URL);
		loginPage.enterLoginDetails("gaurav.sharma@monotype.com", "Monotype123#");
		loginPage.submitLoginDetails();
		Assert.assertTrue(condition);
	}
}
