package com.reusable.library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtil extends BaseUtil {
	
	String fileName = reportLocation + "extentreport.html";
	
	public void ExtentReport() {
		
		extent = new ExtentReports();
		
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(new File(fileName));
		
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setReportName("Web Automation Results");
		htmlReporter.config().setDocumentTitle("Test Results");
		htmlReporter.config().setEncoding("uft-8");
		
		
		extent.setSystemInfo("Tester","A1015238");
		extent.attachReporter(htmlReporter);
		
		//extent.setAnalysisStrategy(AnalysisStrategy.TEST);
		//extenHtmlReporter.config().setTheme(Theme.DARK);
		
	}
	
    public void ExtentReportScreenshot() throws IOException {
    	
    	File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileHandler.copy(scr, new File(reportLocation + "screenshot.png"));
    	//scenarioDef.fail("Fail");
    	
    }
    
    
    public void FlushReport() {
    	
    	extent.flush();
    }
    
    
    
    
    
    
}




