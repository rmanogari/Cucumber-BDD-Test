package stepDefinitions;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Practise.DemoProject.CustomExtentReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Practise.DemoProject.Base {
	
	//private static ResusableFunct resuefun;
	private static CustomExtentReporter customExtentReporter;
	private static boolean isReportRunning;
	
	
	
	@Before
	public void beforeScenario(Scenario scenario) {
		if(!isReportRunning) {
			System.out.println("Execution Control Enters into Before Scenario Hooks block");
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			String path = System.getProperty("user.dir")+"\\reports\\TestReport_";
			customExtentReporter = new CustomExtentReporter (path + timeStamp + ".html");
			isReportRunning=true;
		}
		
	}
	@After
	public void afterScenario(Scenario scenario) throws IOException {
		
		System.out.println("Execution control enters into after Scenario hook");
		if(scenario.isFailed()) {
			//customExtentReporter = new CustomExtentReport (path + timeStamp + ".html");
			System.out.println("Scenario Failed");
		}
	   
		customExtentReporter.writeToReport();
		if(driver!=null) {
			driver.close();
		    //driver.quit();
		}
		
	}
	
	
	
	
	
	


	

}
