package ReusableFunctions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshotMethod1Krishna {

	public static WebDriver driver;
	public static void main(String args[]) throws IOException  
	{
		try {
			//PageObjectO2 pgObj = new PageObjectO2();
			System.setProperty("webdriver.chrome.driver", "C:\\20056283\\Selenium\\ChromeDriver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			String url = "https://www.google.com";
			driver.get(url);
			Thread.sleep(2000);
			captureScreenshot("screenshot");
			System.out.println("Screenshot taken successfully by calling from other functions");
			
		} catch (InterruptedException e) {
			String errormessage = e.getMessage();
			System.out.println(errormessage);
			e.printStackTrace();
		}
		
	}
	
	public static void captureScreenshot(String screenshotName) {
		
		
		try {
			SimpleDateFormat formatter= new SimpleDateFormat("ddMMyyyHHmmss");
			Date date = new Date();
			String screenshotNameFormat = screenshotName+ " " + formatter.format(date);
			String destinationFile = System.getProperty("user.dir")+"\\reports\\Screenshots\\"+ screenshotNameFormat + ".png";
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshot, new File(destinationFile));
			
		} catch (IOException e) {
			String errormessage = e.getMessage();
			System.out.println(errormessage);
			e.printStackTrace();
		}
	}

}
