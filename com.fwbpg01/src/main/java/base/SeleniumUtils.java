package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {
	
	
	
	public WebDriverWait wait;
	
	public void wait(WebDriver driver,long Time ,By by) {
	wait =new WebDriverWait(driver, Time );
	wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	
}
