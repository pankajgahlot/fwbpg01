package com.flipkart.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.FilterPage;
import PageObject.HomePage;
import PageObject.LoginPage;

public class SuiteBase {
	
	public LoginPage LPg = new LoginPage();
	public HomePage HPg = new HomePage();
	public FilterPage FPg = new FilterPage();
	
	
	public Properties prop;	
	InheritableThreadLocal<WebDriver> driver = new InheritableThreadLocal<WebDriver>();
	
	public WebDriver getDriver() {
		return driver.get();
	}
	
	public void init() throws IOException {
		System.out.println("Call init");
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\data.properties");
		prop = new Properties();
		prop.load(fs);
		System.out.println("After init");
	}

	public void loadBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\driver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");
		
		driver.set(new  ChromeDriver(options));
		
		
	}

}
