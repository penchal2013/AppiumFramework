package com.Libraries;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class BaseAutomation 
{

	public DesiredCapabilities capabilities;
	public static AndroidDriver driver;
	
	@BeforeMethod /* runs as many number of times @Test Present*/
	public void setup() throws MalformedURLException
	{
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "HHS4C16602001332");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("app", "./Apkfile/voonik.apk");
		
		driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		
	}
	
	
	@AfterMethod 
	public void teardown() throws MalformedURLException
	{
		driver.quit();
		
	}
}
