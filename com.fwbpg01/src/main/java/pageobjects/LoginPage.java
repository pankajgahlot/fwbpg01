package pageobjects;

import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	
	public void login(WebDriver driver,String URL) {
		driver.get(URL);
		System.out.println("Successfully logged into : "+URL);
	}
}
