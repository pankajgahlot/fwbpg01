package com.flipkart.check;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.Base.SuiteBase;

public class flipkartTEST01 extends SuiteBase {
	@BeforeTest
	public void setup() throws IOException {
		init();
	}
	
	@AfterMethod
	public void AfterMethod() {
		//getDriver().quit();
		
	}
	
	@Test
	public void checkMobileName() throws InterruptedException {
		loadBrowser();
		LPg.login(getDriver(), prop.getProperty("URL"));
		HPg.SearchMobileDevice(getDriver());
		FPg.applyFilter(getDriver());
		FPg.getDeviceName(getDriver());
		
	}
	

	
	
	

}
