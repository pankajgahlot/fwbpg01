package PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.flipkart.Base.seleniumUtils;

import properties.filterpage;

public class FilterPage extends seleniumUtils implements filterpage {

	public void applyFilter(WebDriver driver) {
		wait(driver, 10, By.xpath(FILTER_HEADER));
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(FILTER_HEADER)).isDisplayed();
			System.out.println("Filter header is displayed");

			wait(driver, 20, By.xpath(F_ASSURED_CHECKBOX));
			driver.findElement(By.xpath(F_ASSURED_CHECKBOX)).click();		
			

			wait(driver, 20, By.xpath(BRAND_CHECKBOX));
			driver.findElement(By.xpath(BRAND_CHECKBOX)).click();

		} catch (Exception e) {
			System.out.println("Filter header is not displayed");
		}
	}

	public void getDeviceName(WebDriver driver) throws InterruptedException {

		ArrayList<String> deviceName = new ArrayList<>();

		List<WebElement> list = driver.findElements(By.xpath(DEVICE_NAME));

		for (WebElement e : list) {
			Thread.sleep(1000);
			String device = e.getText();
			System.out.println(device);
			deviceName.add(device);

		}

	}
	
	public void getDeviceLinks(WebDriver driver) throws InterruptedException {

		ArrayList<String> deviceLink = new ArrayList<>();

		List<WebElement> list = driver.findElements(By.xpath(DEVICE_LINK));

		for (WebElement e : list) {
			Thread.sleep(1000);
			String device = e.getAttribute("href");
			System.out.println(device);
			deviceLink.add(device);

		}

	}
	
	public void getDeviceCost(WebDriver driver) throws InterruptedException {

		ArrayList<String> devicecost = new ArrayList<>();

		List<WebElement> list = driver.findElements(By.xpath(DEVICE_COST));

		for (WebElement e : list) {
			Thread.sleep(1000);
			String device = e.getText();
			System.out.println(device);
			devicecost.add(device);

		}

	}

}
