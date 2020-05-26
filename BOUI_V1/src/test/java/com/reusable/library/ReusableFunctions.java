package com.reusable.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ReusableFunctions {

	public Properties prop = new Properties();
	public String projectPath = System.getProperty("user.dir");
	public String configFilePath = projectPath+"/src/test/java/config/config.properties";

	
	
	/*Method Name : highlightElement
	 * Purpose : To highlight the WebElement during run time
	 * Author : A1015238
	 * Created Date : 5/23/2020
	 * Last Modified : 5/23/2020
	 */
	public void highlightElement(WebDriver driver, WebElement element) {
		for (int i = 0; i <2; i++) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);

		}
	}


	/*Method Name : caputreScreenShot
	 * Purpose : To capture the Screenshot 
	 * Author : A1015238
	 * Created Date : 5/23/2020
	 * Last Modified : 5/23/2020
	 */
	public String caputreScreenShot(WebDriver driver, String ScreenshotName)
	{
		try {
			SimpleDateFormat formatter= new SimpleDateFormat("ddMMyyyHHmmss");
			Date date = new Date();
			String screenshotNameFormat = ScreenshotName+ " " + formatter.format(date);
			String destScreenshotFile1 = System.getProperty("user.dir")+"\\reports\\Screenshots\\"+ screenshotNameFormat + ".png";
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshot, new File(destScreenshotFile1));

		} catch (IOException e) {
			String errormessage = e.getMessage();
			System.out.println(errormessage);
			e.printStackTrace();
		}

		return ScreenshotName;
	}

	/*Method Name : getProperties
	 * Purpose : To get the data from .properties file 
	 * Author : A1015238
	 * Created Date : 5/23/2020
	 * Last Modified : 5/23/2020
	 */
	public  String getData(String keyName) {

		try {

			//InputStream input = new FileInputStream(projectPath + "/src/test/java/config/config.properties");
			FileInputStream input = new FileInputStream(configFilePath);
			prop.load(input);

			//String keyName = prop.getProperty(data);
			prop.getProperty(keyName);
			System.out.println(keyName);

		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		return keyName;
	}
	
	/*Method Name : getProperties
	 * Purpose : To set the data to .properties file 
	 * Author : A1015238
	 * Created Date : 5/23/2020
	 * Last Modified : 5/23/2020
	 */

	public  void putData() throws IOException {

		try {

			//OutputStream output = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
			FileOutputStream output = new FileOutputStream(configFilePath);
			prop.setProperty("Application", "MLT");
			prop.store(output, null);


		} catch (FileNotFoundException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	
	/*Method Name : getScreenshot
	 * Purpose : To capture the screenshot with one parameter
	 * Author : A1015238
	 * Created Date : 5/25/2020
	 * Last Modified : 5/25/2020
	 */
	public  String getScreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
		
		File destination=new File(path);
		
		try 
		{
			FileHandler.copy(src, destination);
		} catch (IOException e) 
		{
			System.out.println("Capture Failed "+e.getMessage());
		}
		
		return path;
	}

	}