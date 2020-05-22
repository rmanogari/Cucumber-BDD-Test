package Pepsi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EC_CompensationInfo {

	
	   public static  String ECURL = "https://performancemanager8.successfactors.com";
	    public static String ECCompanyId = "PepsiCoECDEV";
		public static String ECUserName ="09107706";
		public static String ECPwd = "Flash$12";
		public static String EmployeeId ="71021619";
		public static String ECPortel="Compensation Information";

		public static void main(String[] args) {
			try {
				
				PageObjectO2 pgObj = new PageObjectO2();
				System.setProperty("webdriver.chrome.driver", "C:\\20056283\\Selenium\\ChromeDriver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				WebDriverWait wait = new WebDriverWait(driver, 10);
				
				//Logging the EC Application
				driver.manage().window().maximize();
				driver.get(ECURL);
				
				driver.findElement(By.xpath(pgObj.ECEnterCompanyIdtxtbx_xpath)).sendKeys(ECCompanyId);
				driver.findElement(By.xpath(pgObj.ECCompanyIdSubmitbtn_xpath)).click();
				//Thread.sleep(1000); // need to increase the sleep time during execution
				driver.findElement(By.name(pgObj.ECUserNametxt_name)).sendKeys(ECUserName);
				driver.findElement(By.name(pgObj.ECPasswrdtxt_name)).sendKeys(ECPwd);
				driver.findElement(By.xpath(pgObj.ECLoginbtn_xpath)).click();
				//Thread.sleep(2000);
				driver.findElement(By.xpath(pgObj.ECSearchtxtbx_xpath)).sendKeys(EmployeeId);
				//Thread.sleep(1000);
				driver.findElement(By.xpath(pgObj.ECSearchtxtbx_xpath)).sendKeys(Keys.ARROW_DOWN);
				driver.findElement(By.xpath(pgObj.ECSearchtxtbx_xpath)).sendKeys(Keys.ENTER);
				//Thread.sleep(1000);
				
				driver.findElement(By.xpath(pgObj.ECJobInfoheader_xpath)).click();
				
				
				
				WebElement element = driver.findElement(By.xpath(pgObj.ECEmployeeExpandicon_xpath));
				
				JavascriptExecutor js = (JavascriptExecutor)driver;   
				js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);
				Actions action = new Actions(driver);
				action.moveToElement(element).click().build().perform();
				
				
				WebElement ECPortelsoptions = driver.findElement(By.xpath(pgObj.ECPortelslistbx_xpath));
				List<WebElement> ECPortelSelect = ECPortelsoptions.findElements(By.xpath(pgObj.ECPortelCompInfo_xpath));
				for (WebElement ECPortelRO : ECPortelSelect)
				{
				    if (ECPortelRO.getText().equals(ECPortel))
				    {
				    	ECPortelRO.click(); 
				    	//Thread.sleep(1000);
				        break;
				    }
				}

				
				
				
				
				
			}
			
			
			catch(Exception e){
				String errormsg = e.getMessage();
				System.out.println(errormsg);
				System.out.println("There is a problem in logging in EC application");
				
			}
}
}