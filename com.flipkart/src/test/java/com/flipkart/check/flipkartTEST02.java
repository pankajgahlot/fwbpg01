package com.flipkart.check;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.Base.SuiteBase;

public class flipkartTEST02 extends SuiteBase{
	
	@BeforeTest
	public void setup() throws IOException {
		init();
	}
	
	@AfterMethod
	public void AfterMethod() {
		//getDriver().quit();
		
	}
	
	@Test
	public void checkLinks() throws InterruptedException {
		loadBrowser();
		LPg.login(getDriver(), prop.getProperty("URL"));
		HPg.SearchMobileDevice(getDriver());
		FPg.applyFilter(getDriver());
		FPg.getDeviceLinks(getDriver());
		
	}

}
