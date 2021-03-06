package ExtentListerners;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

//import org.testng.ITestListener;

public class ExtentListner implements ITestListener {

	static Date d = new Date();

	static String fileName = "Extent_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";

	private static ExtentReports extentrep = ExtentManager
			.extentReport(System.getProperty("user.dir") + "\\ExtentReports\\reports\\" + fileName);

	public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		ExtentTest test = extentrep
				.createTest(result.getTestClass().getName() + "|| Testcase ||" + result.getMethod().getMethodName());
		testReport.set(test);
	}
	
	public void onTestSuccess(ITestResult result) {
		String methodname =result.getMethod().getMethodName();
		String logtext="<b>"+methodname.toUpperCase()+" || Passed || "+"</b>";
		Markup m=MarkupHelper.createLabel(logtext, ExtentColor.GREEN);
				
		testReport.get().pass(m);
	}
	
	public void onFinish(ITestContext context) {

		if (extentrep != null) {

			extentrep.flush();
		}

	}
}
