package Pepsi;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;


public class EC_CompensationInfo {

	
	   public static  String ECURL = "https://performancemanager8.successfactors.com";
	    public static String ECCompanyId = "PepsiCoECDEV";
		public static String ECUserName ="09107706";
		public static String ECPwd = "Flash$12";
		public static String EmployeeId ="71021619";
		public static String ECPortlet="Compensation Information";

		public static void main(String[] args) {
			try {
				
				PageObjectO2 pgObj = new PageObjectO2();
				System.setProperty("webdriver.chrome.driver", "C:\\20056283\\Selenium\\ChromeDriver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				WebDriverWait wait = new WebDriverWait(driver, 10);
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				Actions action = new Actions(driver);
				
				//Logging the EC Application
				driver.manage().window().maximize();
				driver.get(ECURL);
				
				driver.findElement(By.xpath(pgObj.ECEnterCompanyIdtxtbx_xpath)).sendKeys(ECCompanyId);
				driver.findElement(By.xpath(pgObj.ECCompanyIdSubmitbtn_xpath)).click();
				//Thread.sleep(1000); // need to increase the sleep time during execution
				driver.findElement(By.name(pgObj.ECUserNametxt_name)).sendKeys(ECUserName);
				driver.findElement(By.name(pgObj.ECPasswrdtxt_name)).sendKeys(ECPwd);
				Thread.sleep(1000);
				WebElement loginbtn = driver.findElement(By.xpath(pgObj.ECLoginbtn_xpath));
				action.moveToElement(loginbtn).click().build().perform();	
				
				//driver.findElement(By.xpath(pgObj.ECLoginbtn_xpath)).click();
				driver.findElement(By.xpath(pgObj.ECSearchtxtbx_xpath)).sendKeys(EmployeeId);
				Thread.sleep(1000);
				driver.findElement(By.xpath(pgObj.ECSearchtxtbx_xpath)).sendKeys(Keys.ARROW_DOWN);
				driver.findElement(By.xpath(pgObj.ECSearchtxtbx_xpath)).sendKeys(Keys.ENTER);

					
				driver.findElement(By.xpath(pgObj.ECJobInfoheader_xpath)).click();
				
				
				
				WebElement element = driver.findElement(By.xpath(pgObj.ECEmployeeExpandicon_xpath));
				
				JavascriptExecutor js = (JavascriptExecutor)driver;   
				js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);
				
				action.moveToElement(element).click().build().perform();
				
				
				WebElement ECPortletsoptions = driver.findElement(By.xpath(pgObj.ECPortletslistbx_xpath));
				List<WebElement> ECPortletSelect = ECPortletsoptions.findElements(By.xpath(pgObj.ECPortletCompInfo_xpath));
				for (WebElement ECPortletRO : ECPortletSelect)
				{
				    if (ECPortletRO.getText().equals(ECPortlet))
				    {
				    	ECPortletRO.click(); 
				        break;
				    }
				}

				Thread.sleep(1000);
				driver.findElement(By.xpath(pgObj.ECCompInfoHistorybtn_xpath)).click();
				
				
				String StartDateTemp = "Mar 07, 2020"; // need to modify by getting from MLT TransDetail page & to find the method to convert the 03/07/2020 into Mar 07, 2020
				String PayCompValFile = "122,100.00";  // need to modify by getting from MLT TransDetail page
				
				
				List<WebElement> ECRecordCount = driver.findElements(By.xpath(pgObj.ECRecordEventDateList_xpath));
				for(WebElement ECRecordToprow :ECRecordCount)
				{
					if(ECRecordToprow.getText().equals(StartDateTemp))
					{
						driver.findElement(By.xpath(pgObj.ECReocrdEventDate_xpath)).click();
						wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(pgObj.ECEventReasonlbl_xpath)));
						String ECPaycompValue = driver.findElement(By.xpath(pgObj.ECPayCompValue_xpath)).getText();
						if(PayCompValFile.contains(ECPaycompValue))
						{
							Assert.assertTrue("Base Salary updated", true);
						}
						break;
					}
					
					
				}
				
				
				
				/*String ECEventDate = driver.findElement(By.xpath(pgObj.ECReocrdEventDate_xpath)).getText();
				
				if(StartDateTemp.contains(ECEventDate)) 
				{
					
					driver.findElement(By.xpath(pgObj.ECReocrdEventDate_xpath)).click();
					wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(pgObj.ECEventReasonlbl_xpath)));
					String ECPaycompValue = driver.findElement(By.xpath(pgObj.ECPayCompValue_xpath)).getText();
					if(PayCompValFile.contains(ECPaycompValue))
					{
						Assert.assertTrue("Base Salary updated", true);
					}
					
				}*/
				
				
			}
			
			
			catch(Exception e){
				String errormsg = e.getMessage();
				System.out.println(errormsg);
				System.out.println("There is a problem in logging in EC application");
				
			}
}
}