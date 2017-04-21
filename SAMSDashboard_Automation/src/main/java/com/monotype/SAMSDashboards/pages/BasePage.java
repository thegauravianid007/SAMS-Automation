package com.monotype.SAMSDashboards.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class BasePage {

	public void clickALink(WebElement element)
	{
		element.click();
	}
	
	public void enterText(WebElement element, String text)
	{
		element.sendKeys(text);
	}
	
	public void waitAndEnterText(WebDriver driver, WebElement element, String text)
	{
		CommonMethods.waitForElementToBeClickable(driver, element);
		element.sendKeys(text);
	}
	
	public boolean isElementPresent(WebDriver driver, WebElement element)
	{
		return CommonMethods.isElementPresent(driver, element);
	}
	
	public void waitAndClickALink(WebDriver driver, WebElement element)
	{
		CommonMethods.waitForElementToBeClickable(driver, element);
		element.click();
	}
	
	public  void selectFromDropdownByVisibleText(WebElement element, String optionToSelect) {
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(optionToSelect);		
	}
	
	
	
}
