package Practise.DemoProject;

import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getDriver() throws IOException
	{
		 
		    prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\A1015238\\eclipse-workspace\\Automation\\src\\test\\java\\Cucumber\\Automation\\global.properties");// need to give the global properties path
			prop.load(fis);
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\20056283\\Selenium\\ChromeDriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("https://mywipro.wipro.com");
			//driver.get(prop.getProperty("url"));
			return driver;
			
	
		
		
		
	
	}

}
