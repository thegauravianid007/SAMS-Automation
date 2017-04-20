package utils;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

	public static boolean isElementPresent(WebDriver driver, WebElement element)
	{
		boolean webElementLoaded = false;
		try {

			while (webElementLoaded == false) {

				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
				wait.until(ExpectedConditions.visibilityOf(element));
				webElementLoaded = true;
			}
		} catch (Exception e) {
			System.out.println("Web Element not present - " + element);
			e.printStackTrace();
		}
		return webElementLoaded;
	}
	
	
	
	public static void waitForPageLoad(WebDriver driver, int time) {
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(pageLoadCondition);
    }
	
	
	public static void waitForElementToBeClickable(final WebDriver driver, WebElement element) {

        boolean webElementLoaded = false;
        try {

            while (webElementLoaded == false) {

                Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
                wait.until(ExpectedConditions.elementToBeClickable(element));
                webElementLoaded = true;
            }
        } catch (Exception e) {
            System.out.println("Web Element not clickable - " + element);
            e.printStackTrace();
        }
    }
	
	
	public static void waitForElementToBeInvisible(final WebDriver driver, WebElement element) {
		boolean webElementLoaded = false;
		try {

			while (webElementLoaded == false) {

				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
				wait.until(ExpectedConditions.invisibilityOf(element));
				webElementLoaded = true;
			}
		} catch (Exception e) {
			System.out.println("Web Element not invisible - " + element);
		}
	}
	
	public static void waitForElementToBeVisible(final WebDriver driver, By by) {
		boolean webElementLoaded = false;
		try {

			while (webElementLoaded == false) {

				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
				wait.until(ExpectedConditions.visibilityOfElementLocated(by));
				webElementLoaded = true;
			}
		} catch (Exception e) {
			System.out.println("Web Element not visible - " + by);
		}
	}
	
	
	
	
	
}




/*static boolean isElementPresent(final WebDriver driver, By by) {

	boolean webElementLoaded = false;
	try {

		while (webElementLoaded == false) {

			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			webElementLoaded = true;
		}
	} catch (Exception e) {
		System.out.println("Web Element not present - " + by);
		e.printStackTrace();
	}
	return webElementLoaded;
}*/




