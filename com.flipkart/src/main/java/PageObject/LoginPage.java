package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.flipkart.Base.seleniumUtils;

import properties.homepage;

public class LoginPage extends seleniumUtils implements homepage {
	
	public void login(WebDriver driver,String URL) {
		driver.get(URL);
		System.out.println("Successfully logged into : "+URL);
		
		wait(driver, 20, By.xpath(CLOSE_ICON));
		driver.findElement(By.xpath(CLOSE_ICON)).click();
		
		
	}

}
