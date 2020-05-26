package Reusablelibrary;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsWithTestNG {
	
	ReusableFunctions rfObj = new ReusableFunctions();

	WebDriver driver;
	
	//ExtentSparkReporter htmlReporter;
	ExtentHtmlReporter htmlReporter;
	
	ExtentReports extent;
	ExtentTest test; //= extent.createTest("Google Search Test One", "This is to validate google search functionality");


	@BeforeSuite
	public void setUp()
	{

		String timeStamp = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
		String path = System.getProperty("user.dir")+"\\reports\\TestNGReport_"; // while integrating with Cucumber Scenario name should replace TestReport_

		
		//htmlReporter = new ExtentSparkReporter(path + timeStamp + ".html");
		htmlReporter = new ExtentHtmlReporter(path + timeStamp + ".html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setReportName("Web Automation Results");
		htmlReporter.config().setDocumentTitle("Test Results");
		htmlReporter.config().setEncoding("uft-8");
		extent.setSystemInfo("Tester","A1015238");

		

	}
	
	@BeforeTest
	public void setUpTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\20056283\\Selenium\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

	@Test
	public void test1() throws IOException
	{
		String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis();
	    test = extent.createTest("Extent Reports", "Creation"); 
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("extent Reports");
		//test.pass("Entered text in search box");
		//driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		//test.pass("Clicked the search button");
		
		//test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		//test.addScreenCaptureFromPath("screenshot.png");
		
		MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build();
		test.pass("details", mediaModel);
		
		//System.out.println("Screenshot Placed in the Extent Report successfully");

		//test.info("Test1 Completed");
		//test.log(Status.INFO, "This step shows usage of log(status and Info");
		//test.info("this shows the usage of info");
		//System.out.println("test1 executed");
	}
	
	@Test
	public void test2() throws IOException
	{
       
	    test = extent.createTest("Selenium", "Search"); 
		driver.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		test.pass("Entered text in search box");
		//driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		//test.fail("The script failed");
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
		//test.info("Test2 Completed");
		//System.out.println("test2 executed");

		//test.info("Test2 Completed");
		//test.log(Status.INFO, "This step shows usage of log(status and Info");
		//test.info("this shows the usage of info");
		
	}
	
	/*@AfterTest
	public void tearDown(ITestResult result) throws IOException
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String temp=rfObj.getScreenshot(driver);
			
			test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}
		
		extent.flush();
		driver.close();
		driver.quit();
		test.pass("Closed the browser");
		System.out.println("Execution for Test -  Completed");
		
	}*/
	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush();
		
	}
}


