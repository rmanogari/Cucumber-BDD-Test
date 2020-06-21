package com.reusable.library;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class BaseUtil {
	
	public  WebDriver driver;
	
	public ExtentReports extent;
	
	public static ExtentTest scenarioDef;
	
	public static ExtentTest features;
	
	public static String reportLocation = "C:\\20056283\\ExtenReportLogs";

}




