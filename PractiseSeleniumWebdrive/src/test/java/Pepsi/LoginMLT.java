package Pepsi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Reusablelibrary.PageObjectO2;
import Reusablelibrary.ReusableFunctions;
import config.ReadPropFile;

public class LoginMLT {

	public static void main(String[] args) throws Exception {
		
		PageObjectO2 pgObj = new PageObjectO2();
		ReusableFunctions reusefunObj = new ReusableFunctions();
		ReadPropFile dataObj = new ReadPropFile();
		
		try {
			
			System.setProperty("webdriver.chrome.driver", "C:\\20056283\\Selenium\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			//Logging the application
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get(dataObj.getpractiseUrl());
			//Thread.sleep(1000);
			//WebElement element = driver.findElement(By.xpath("//input[@title='Search']"));
			//reusefunObj.highlightElement(driver, element);
			String ScreenshotName = "TestReusablefunctions";
			reusefunObj.caputreScreenShot(driver, ScreenshotName);
			
			System.out.println("Screenshot Taken successfully");
		}catch(Exception e){
			String errormsg = e.getMessage();
			System.out.println(errormsg);
			System.out.println("There is a problem in Uploading a File");

		}
		
	}

}
