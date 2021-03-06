package utilities;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extentRep;
	public static ExtentTest extentTest;
	
	@BeforeTest
	public static void setReport() {
		htmlReporter = new ExtentHtmlReporter("./Reports/Report.html");
		
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("com.fwbpg01 Report");
		htmlReporter.config().setReportName("Automation Execution Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		extentRep =new ExtentReports();
		extentRep.attachReporter(htmlReporter);
		
		
		extentRep.setSystemInfo("Automation Tester", "Pankaj Gahlot");
		extentRep.setSystemInfo("Build No", "fwbpg01-001");
	}
	
	
	
	@AfterTest
	public void EndReport() {
		extentRep.flush();
	}
	
	@AfterMethod
	public void itestresult(ITestResult result) {
		
		
		if (result.getStatus()== ITestResult.FAILURE) {
			
			String methodname=result.getMethod().getMethodName();
			String logtext="<b>"+"Testcase: - "+methodname.toUpperCase()+ " Failed"+"<b>";
			Markup m = MarkupHelper.createLabel(logtext, ExtentColor.RED);
			extentTest.fail(m);
			
		}else if (result.getStatus()== ITestResult.SKIP) {
			String methodname=result.getMethod().getMethodName();
			String logtext="<b>"+"Testcase: - "+methodname.toUpperCase()+ " SKIPPED"+"<b>";
			Markup m = MarkupHelper.createLabel(logtext, ExtentColor.YELLOW);
			extentTest.skip(m);
			
		}else if (result.getStatus()== ITestResult.SUCCESS) {
			
			String methodname=result.getMethod().getMethodName();
			String logtext="<b>"+"Testcase: - "+methodname.toUpperCase()+ " PASSED"+"<b>";
			Markup m = MarkupHelper.createLabel(logtext, ExtentColor.GREEN);
			extentTest.pass(m);
			
		}
	}
	
	
	
	
	@Test
	public void test() {
		
		extentTest= extentRep.createTest("first test");
		
	}
@Test
public void Skiptest() {
		
		extentTest= extentRep.createTest("skip test");
		throw new SkipException("skipping the test");
		
	}
@Test
public void failtest() {
	
	extentTest= extentRep.createTest("fail test");
	assertEquals(true, false);
	
}
}
