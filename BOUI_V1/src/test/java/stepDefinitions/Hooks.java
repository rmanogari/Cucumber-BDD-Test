package stepDefinitions;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

import com.reusable.library.BaseUtil;
import com.reusable.library.CustomExtentReporter;
import com.reusable.library.ReusableFunctions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseUtil {
	
	public WebDriver driver;
	
	private static CustomExtentReporter customExtentReporter;
	private static boolean isReporterRunnig;
	ReusableFunctions rf = new ReusableFunctions();

	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println("Control entered into the Before hook");
		if(!isReporterRunnig) {
			
			String timeStamp = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
			String path = System.getProperty("user.dir")+"\\reports\\TestReport_";
			customExtentReporter = new CustomExtentReporter(path + timeStamp + ".html");
			//customExtentReporter = new CustomExtentReporter("C:\\20056283\\ExtenReportLogs\\TestReport.html");
			isReporterRunnig=true;
		}
		
		
		System.out.println("Control Executed the Before hook");
	}
	
	@After
	public void afterScenario(Scenario scenario) throws IOException {
		System.out.println("Control entered into the After hook");
		String screenShotFileName = "C:\\20056283\\ExtenReportLogs" + scenario.getName().replaceAll("", "")+".jpeg";
		if(scenario.isFailed()) {
			rf.takeScreenShot(screenShotFileName);
		}
		
		customExtentReporter.createTest(scenario, screenShotFileName);
		customExtentReporter.writeToReport();
		if(driver!=null) {
			driver.quit();
		}
		
		System.out.println("Control executed the After hook successfully");
	}
	}
	
	
	
	

	


