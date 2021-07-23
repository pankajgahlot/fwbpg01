package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.SeleniumUtils;

public class LoginPage extends SeleniumUtils{

	
	
	public void login(WebDriver driver,String URL) {
		driver.get(URL);
		System.out.println("Successfully logged into : "+URL);
		wait(driver, 20, By.xpath("//button[text()='\u2715']"));
		driver.findElement(By.xpath("//button[text()='\u2715']")).click();
	}
}
