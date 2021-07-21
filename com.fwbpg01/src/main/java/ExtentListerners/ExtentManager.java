package ExtentListerners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	public static ExtentReports ExtentRep;
	
	
	public static ExtentReports extentReport(String fileName ) {
		ExtentSparkReporter htmlReporter= new ExtentSparkReporter(fileName);
		
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("com.fwbpg01 Report");
		htmlReporter.config().setReportName("Automation Execution Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		
		ExtentRep = new ExtentReports();
		ExtentRep.attachReporter(htmlReporter);
		
		
		ExtentRep.setSystemInfo("Automation Tester", "Pankaj Gahlot");
		ExtentRep.setSystemInfo("Build No", "fwbpg01-001");
		
		return ExtentRep;
		
	}

}
