package PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.flipkart.Base.seleniumUtils;

import properties.filterpage;

public class FilterPage extends seleniumUtils implements filterpage {

	public void applyFilter(WebDriver driver) {
		wait(driver, 10, By.xpath(FILTER_HEADER));
		driver.findElement(By.xpath(FILTER_HEADER)).click();
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath(FILTER_HEADER)).isDisplayed();
			System.out.println("Filter header is displayed");

			wait(driver, 20, By.xpath(F_ASSURED_CHECKBOX));
			driver.findElement(By.xpath(F_ASSURED_CHECKBOX)).click();
			System.out.println("fAssured checkbox checked !!");

			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",
					driver.findElement(By.xpath(RAM_HEADER)));
			Thread.sleep(3000);
			wait(driver, 20, By.xpath(BRAND_CHECKBOX));
			driver.findElement(By.xpath(BRAND_CHECKBOX)).click();
			System.out.println("Brand checkbox checked !!");
			Thread.sleep(2000);
			wait(driver, 20, By.xpath(SORT_ICON));
			driver.findElement(By.xpath(SORT_ICON)).click();
			System.out.println("list sorted by price low to high");

		} catch (Exception e) {
			System.out.println("Filter header is not displayed");
			Assert.fail();
		}
	}

	ArrayList<String> deviceName = new ArrayList<>();

	public void getDeviceName(WebDriver driver) throws InterruptedException {
		wait(driver, 60, By.xpath(DEVICE_NAME));
		List<WebElement> list = driver.findElements(By.xpath(DEVICE_NAME));
		System.out.println("total number of DEVICE found on the screen " + list.size());
		int i = 1;
		for (WebElement e : list) {
			int j = i++;
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", e);
			String device = e.getText();
			System.out.println("Device number-" + j + " is :" + device);
			deviceName.add(device);

		}
		System.out.println("***************************************************");

	}

	public void getDeviceLinks(WebDriver driver) throws InterruptedException {

		ArrayList<String> deviceLink = new ArrayList<>();

		List<WebElement> list = driver.findElements(By.xpath(DEVICE_LINK));
		int i = 0;
		for (WebElement e : list) {
			int j = i++;
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", e);
			String device = e.getAttribute("href");
			System.out.println("Link for Device -" + deviceName.get(j) + " is : " + device);
			deviceLink.add(device);

		}

	}

	public void getDeviceCost(WebDriver driver) throws InterruptedException {

		ArrayList<String> devicecost = new ArrayList<>();

		List<WebElement> list = driver.findElements(By.xpath(DEVICE_COST));
		int i = 0;
		for (WebElement e : list) {
			int j = i++;
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", e);
			String device = e.getText().replace("\u20B9", "").replace(",", "");
			System.out.println("Cost for Device -" + deviceName.get(j) + " is : " + device);
			devicecost.add(device);

		}
		System.out.println("***************************************************");
	}

}
