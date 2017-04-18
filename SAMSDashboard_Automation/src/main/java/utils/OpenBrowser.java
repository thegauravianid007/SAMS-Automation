package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;


public class OpenBrowser {

	public static WebDriver driver;
	static DesiredCapabilities capabilities = new DesiredCapabilities();
	public static void chooseBrowser(String browserName)
	{
		if (browserName.equalsIgnoreCase("firefox"))
		{
			capabilities = DesiredCapabilities.firefox();
			driver = new FirefoxDriver(capabilities);
		} 
		
		else if (browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
				
		else
		{
			throw new UnreachableBrowserException(browserName);
		}
	}
	
	public static void maximizeWindow()
	{
		driver.manage().window().maximize();
	}
	
}
