package com.monotype.automation.SAMSDashboards.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	public void clickALink(WebDriver driver, WebElement element)
	{
		element.click();
	}
	
	public void enterText(WebDriver driver, WebElement element, String text)
	{
		element.sendKeys(text);
	}
	
}
