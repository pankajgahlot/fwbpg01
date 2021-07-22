package com.fwbpg01.sanity;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.SuiteBase;

public class sanityTest extends SuiteBase{
	@BeforeTest
	public void setup() throws IOException {
		init();
	}
	
	@Test
	public void SanityTC001() {
		loadBrowser();
		System.out.println(prop.getProperty("URL"));
		LPg.login(getDriver(), prop.getProperty("URL"));
		
		
	}
	
	@AfterMethod
	public void AfterMethod() {
		getDriver().quit();
		
	}

}
