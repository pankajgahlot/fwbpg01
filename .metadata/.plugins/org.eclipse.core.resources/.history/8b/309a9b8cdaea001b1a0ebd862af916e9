import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.SuiteBase;

public class sanityTest extends SuiteBase{
	
	
	@Test
	public void SanityTC001() {
		loadBrowser();
		
		LPg.login(getDriver(), "https://chromedriver.chromium.org/downloads");
		
		
	}
	
	@AfterMethod
	public void AfterMethod() {
		getDriver().quit();
		
	}

}
