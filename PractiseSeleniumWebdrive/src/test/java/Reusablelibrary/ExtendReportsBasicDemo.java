package Reusablelibrary;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsBasicDemo {
	
	private static WebDriver driver = null;


	public static void main(String[] args) {
		
		try {
		
		String timeStamp = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
		String path = System.getProperty("user.dir")+"\\reports\\TestReport_"; // while integrating with Cucumber Scenario name should replace TestReport_

		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(path + timeStamp + ".html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setReportName("Web Automation Results");
		htmlReporter.config().setDocumentTitle("Test Results");
		htmlReporter.config().setEncoding("uft-8");
		extent.setSystemInfo("Tester","A1015238");
		
		//htmlReporter.config().setTheme(Theme.DARK);
		
		ExtentTest test1 = extent.createTest("Google Search Test One", "This is to validate google search functionality");
		
		System.setProperty("webdriver.chrome.driver", "C:\\20056283\\Selenium\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		//Logging the application
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		test1.log(Status.INFO, "Starting Test Case");
		driver.get("https://www.google.com/");
		test1.pass("Navigated to google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("extent Reports");
		test1.pass("Entered text in search box");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		test1.pass("Clicked the search button");
		driver.close();
		driver.quit();
		test1.pass("Closed the browser");
		test1.info("Test1 Completed");
		
		driver = new ChromeDriver();
		ExtentTest test2 = extent.createTest("Google Search Test One", "This is to validate google search functionality");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		test2.log(Status.INFO, "Starting Test Case");
		driver.get("https://www.google.com/");
		test2.pass("Navigated to google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("extent Reports");
		test2.pass("Entered text in search box");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		test2.fail("Clicked the search button");
		
		driver.close();
		driver.quit();
		test1.pass("Closed the browser");
		test1.info("Test2 Completed");
		
		extent.flush();
		}
		catch(Exception expObj) {
			
			System.out.println(expObj.getCause());
			System.out.println(expObj.getMessage());
		    expObj.printStackTrace();
		    
			
		}
		
	}

}
