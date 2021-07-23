package com.flipkart.check;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.Base.SuiteBase;

public class flipkartTEST01 extends SuiteBase {
	
	public static final String USERNAME = System.getenv("BROWSERSTACK_USERNAME");
	public static final String AUTOMATE_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	
	  // Additional import required

	public static void markTestStatus(String status, String reason, WebDriver driver) {  // the same WebDriver instance should be passed that is being used to run the test in the calling funtion
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+status+"\", \"reason\": \""+reason+"\"}}");
	}

	
	
	@BeforeTest
	public void setup() throws IOException {
		init();
	}
	
	@AfterMethod
	public void AfterMethod() {
		getDriver().quit();
		
	}
	
	@Test
	public void checkMobileName() throws InterruptedException {
		loadBrowser();
		LPg.login(getDriver(), prop.getProperty("URL"));
		HPg.SearchMobileDevice(getDriver());
		FPg.applyFilter(getDriver());
		Thread.sleep(2000);
		FPg.getDeviceName(getDriver());
		Thread.sleep(2000);
		FPg.getDeviceCost(getDriver());
		Thread.sleep(2000);
		FPg.getDeviceLinks(getDriver());
		
		
	}
	

	
	
	

}
