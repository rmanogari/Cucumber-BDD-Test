package Pepsi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ReusableFunctions.PageObjectO2;
import ReusableFunctions.TakingScreenshotMethod1Krishna;

public class LoginMLT extends TakingScreenshotMethod1Krishna {

	public static void main(String[] args) {
		
		PageObjectO2 pgObj = new PageObjectO2();
		TakingScreenshotMethod1Krishna ss = new TakingScreenshotMethod1Krishna();

		try {

			
			System.setProperty("webdriver.chrome.driver", "C:\\20056283\\Selenium\\ChromeDriver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			//Logging the application
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			String url = "https://www.google.com";
			driver.get(url);
			Thread.sleep(2000);
			//ss.getScreenShotPath();
			System.out.println("Screenshot Taken successfully");
		}catch(Exception e){
			String errormsg = e.getMessage();
			System.out.println(errormsg);
			System.out.println("There is a problem in Uploading a File");

		}
		
	}

}
