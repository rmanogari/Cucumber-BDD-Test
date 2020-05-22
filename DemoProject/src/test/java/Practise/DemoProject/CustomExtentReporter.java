package Practise.DemoProject;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.java.Scenario;

public class CustomExtentReporter {
	
	private ExtentSparkReporter extenHtmlReporter;
	private ExtentReports extentReports;
	
	public CustomExtentReporter(String reportLoaction)
	{
		extenHtmlReporter=new ExtentSparkReporter(new File(reportLoaction));
		extentReports=new ExtentReports();
		//extentReports.set(new ExtentReports());
		extentReports.attachReporter(extenHtmlReporter);
		
		extenHtmlReporter.config().setReportName("Web Automation Results");
		extenHtmlReporter.config().setDocumentTitle("Test Results");
		extenHtmlReporter.config().setEncoding("uft-8");
		//extenHtmlReporter.config().setTheme(Theme.DARK);
		
		extenHtmlReporter.config().setTheme(Theme.STANDARD);
		
	}
	
	public void createTest(Scenario scenario,String screenShotFile) throws IOException {
		
		if(scenario!=null) {
			String testName = getScenarioTitle(scenario);
			switch(scenario.getStatus()) {
			case PASSED:
				extentReports.createTest(testName).pass("Passed");
				System.out.println("Scenario Passed- Control went to Passed Switch Case");
			    break;
			case FAILED:
				extentReports.createTest(testName).fail("Failed").addScreenCaptureFromPath(getScreenShotLocation(screenShotFile));
			
			default:
				extentReports.createTest(testName).skip("Skipped");
				
			}
			 
			
			
		}
	}
	
	public void writeToReport() {
		
		if(extentReports!=null) {
			extentReports.flush();
		}
	}
	
	private String getScreenShotLocation(String aLocation) {
		
		return "file:///" + aLocation.replaceAll("\\", "//");
	}
	
	private String getScenarioTitle(Scenario scenario){
		
		return scenario.getName().replaceAll("", "");
	}
	
	
	
	
	

}
