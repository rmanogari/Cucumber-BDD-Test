package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

//import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

//import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepMLTLogin{
	
	public static String O2username = "A1015238";
	public static String O2pwd ="Alliswell20";
	public static String lan_ID = "A1015238";
	
	  // public WebDriver driver;
	   //public static Properties prop;
	   
	   PageObjectO2 pgObj;
	   
	    @Given("^LoginPage$")
	    public void loginpage() throws Throwable {
	    	
	    			
	    			//WebDriverWait wait = new WebDriverWait(driver, 10);
	    			
	    			 System.out.println("Execution Control Enters into Given statement");
	    	    	 //driver=Base.getDriver();
	    			 System.setProperty("webdriver.chrome.driver", "C:\\20056283\\Selenium\\ChromeDriver\\chromedriver.exe");
	    				
	    			 WebDriver driver = new ChromeDriver();
	    			 driver.manage().window().maximize();
	    			
	    			//Logging the application
	    			driver.manage().window().maximize();
	    			String url = "https://hitlb02.hrbpo.hewitt.com/basemassloads/LDAPLogin.jsp#";
	    			driver.get(url);
	    			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(pgObj.userNametxtbx_xpath)));
	    			Thread.sleep(2000);
	    			
	    			
	    			driver.findElement(By.xpath(pgObj.userNametxtbx_xpath)).sendKeys(O2username);	
	    			driver.findElement(By.xpath(pgObj.pwdtxtbx_xpath)).sendKeys(O2pwd);
	    			driver.findElement(By.xpath(pgObj.loginbtn_xpath)).click();
	    			//wait.until(ExpectedConditions.presenceOfElementLocated(By.id(pgObj.clntSlctnO2base_id)));
	    			Thread.sleep(4000);
	    			
	    			driver.findElement(By.id(pgObj.clntSlctnO2base_id)).click();
	    			//wait.until(ExpectedConditions.presenceOfElementLocated(By.id(pgObj.fileUploadicon_id)));
	    			Thread.sleep(4000);
	    			
	    			
	    			//Clicking File Upload icon
	    			WebElement element = driver.findElement(By.id(pgObj.fileUploadicon_id));
	    			Actions action = new Actions(driver);
	    			action.moveToElement(element).build().perform();
	    			
	    			Thread.sleep(4000);
	    			WebElement subelement = driver.findElement(By.xpath(pgObj.fileUploadbtn_xpath));
	    			action.moveToElement(subelement).click().build().perform();
	    			
	    			//wait.until(ExpectedConditions.presenceOfElementLocated(By.id(pgObj.Headertxtfileupload_id)));
	    			Thread.sleep(4000);
	    			
	    			//File Uploading
	    			WebElement uploadElement = driver.findElement(By.xpath(pgObj.FileUploadlink_xpath));
	    			uploadElement.click();
	    			Thread.sleep(4000);

	    	        
	    			if(driver.findElement(By.id(pgObj.Headertxtfileupload_id)).isDisplayed()) {
	    				
	    				//driver.findElement(By.xpath(pgObj.FileUploadlink_xpath)).click();
	    				
	    				Pattern SelectFile = new Pattern("C:\\20056283\\Selenium\\SikuliImage\\SelectFile.PNG");
	    				Pattern FilePath = new Pattern("C:\\20056283\\Selenium\\SikuliImage\\FilePath.PNG");
	    				Pattern Openbtn = new Pattern("C:\\20056283\\Selenium\\SikuliImage\\Openbtn.PNG");
	    				
	    				Screen src = new Screen();
	    				src.setAutoWaitTimeout(30);
	    				src.doubleClick(SelectFile);
	    				Thread.sleep(3000);
	    				src.type(FilePath, "C:\\Users\\A1015238\\Downloads\\CreatePosition30.xls");
	    				src.click(Openbtn);
	    				
	    				Thread.sleep(4000);
	    				System.out.println("File Uploaded successfully through Sikuli");
	    				
	    				//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(pgObj.ConfirmInstance_xpath)));
	    				driver.findElement(By.xpath(pgObj.InstanceToTranspage_xpath)).click();
	    				Thread.sleep(6000);
	    				
	    				//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(pgObj.TransListHdr_xpath)));
	    				System.out.println("Successfully navigated to TransList page");
	    				
	    			}
	    			else
	    				System.out.println("Not able to upload the file through Sikuli");
	    			
	    		
	    		System.out.println("There is a problem in Uploading a File");
	    		
	    	
	    	 
	    }

	    @When("^EnterUserName$")
	    public void enterusername() throws Throwable {
	    	
	    	System.out.println("BDD executed When statement");
	    	//Assert.assertTrue(false);
	    	//Assert.fail("BDD Execution failed - Check the screeshot");
	        
	    }

	    @Then("^Details$")
	    public void details() throws Throwable {
	    	//driver.findElement(By.xpath("//input[@id='emailID-inputEl']")).sendKeys("abcd");
			//System.out.println("Execution Control completely executed the Given statement");
	    	System.out.println("BDD executed Then statement");
	    }
	 
	 
	 
    
    }

