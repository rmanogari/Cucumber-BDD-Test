package Reusablelibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakingScreenshot_RahulShetty {

	public static WebDriver driver;
	public void getScreenShotPath()  
	{
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String destinationFile = System.getProperty("user.dir")+"\\reports\\ScreenshotRSUd123" + ".png"; // before png for BDD framework i need to add scenario to get the name of the scenario

			FileUtils.copyFile(source, new File(destinationFile));


		} catch (IOException e) {
			String errormessage = e.getMessage();
			System.out.println(errormessage);

			e.printStackTrace();
		}

	}

}
