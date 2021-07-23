package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.flipkart.Base.seleniumUtils;

import properties.homepage;

public class HomePage extends seleniumUtils implements homepage {

	public void SearchMobileDevice(WebDriver driver) {
		try {
			driver.findElement(By.xpath(PAGE_TITLE)).isDisplayed();
			System.out.println("Flipkart home page is displayed");

			driver.findElement(By.xpath(SEARCH_TEXTBOX)).sendKeys("Samsung Galaxy S10");
			System.out.println("Searching for mobile device");

			wait(driver, 20, By.xpath(PRODUCT_CATEGORY));
			Thread.sleep(1000);
			driver.findElement(By.xpath(PRODUCT_CATEGORY)).click();
			System.out.println("Product category is select");

		} catch (Exception e) {
			System.out.println("Flipkart home page is not displayed");
			Assert.fail();
		}

	}
}
