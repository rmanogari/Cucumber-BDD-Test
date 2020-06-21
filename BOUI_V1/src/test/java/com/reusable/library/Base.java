package com.reusable.library;

//import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() throws IOException
	{
	
		
			String projectPath = System.getProperty("user.dir"); 
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
			
			//System.setProperty("webdriver.chrome.driver", "C:\\20056283\\Selenium\\ChromeDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			return driver;
	}

}




