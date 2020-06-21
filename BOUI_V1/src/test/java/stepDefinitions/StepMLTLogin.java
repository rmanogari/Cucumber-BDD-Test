package stepDefinitions;

//import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.aventstack.extentreports.ExtentTest;
import com.reusable.library.Base;
import com.reusable.library.PageObjectO2;

import config.ReadPropFile;

//import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class StepMLTLogin{

	public static WebDriver driver;
	PageObjectO2 pgObj = new PageObjectO2();
	public ExtentTest report;
	

	@Given("^LoginPage$")
	public void loginpage() throws Throwable {

		System.out.println("Execution Control Enters into Given statement");
		driver=Base.getDriver();
		ReadPropFile dataObj = new ReadPropFile();
		//driver.get(dataObj.getpractiseUrl());
		
		
		driver.get(dataObj.getMLTUrl());
		driver.findElement(By.xpath(pgObj.userNametxtbx_xpath)).sendKeys(dataObj.getMLTUserName());	
		driver.findElement(By.xpath(pgObj.pwdtxtbx_xpath)).sendKeys(dataObj.getMLTPwd());
		driver.findElement(By.xpath(pgObj.loginbtn_xpath)).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(pgObj.clntSlctnPepsi_xpath));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		Thread.sleep(5000);
		System.out.println("Execution Completed for Given statement");

	}

	@When("^EnterUserName$")
	public void enterusername() throws Throwable {
		
		System.out.println("Execution Control Enters into When statement");
		Thread.sleep(4000);
		//WebElement element = driver.findElement(By.xpath(pgObj.fileUpload_xpath));
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;   
		//js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);
		//Actions action = new Actions(driver);
		//action.moveToElement(element).click().build().perform();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('mltFileUploadButton-btnIconEl').click();");
		
		Thread.sleep(7000);
		
		if(driver.findElement(By.id(pgObj.Headertxtfileupload_id)).isDisplayed()) {
			Pattern SelectFile = new Pattern("C:\\20056283\\Selenium\\SikuliImage\\SelectFile.PNG");
			Pattern FilePath = new Pattern("C:\\20056283\\Selenium\\SikuliImage\\FilePath.PNG");
			Pattern Openbtn = new Pattern("C:\\20056283\\Selenium\\SikuliImage\\Openbtn.PNG");
			
			Screen src = new Screen();
			src.setAutoWaitTimeout(30);
			src.doubleClick(SelectFile);
			Thread.sleep(3000);
			src.type(FilePath, "C:\\Users\\A1015238\\Downloads\\BaseAndRecurringPay.xls");
			src.click(Openbtn);
			
			Thread.sleep(4000);
			System.out.println("File Uploaded successfully through Sikuli");
			
			driver.findElement(By.xpath(pgObj.InstanceToTranspage_xpath)).click();
			Thread.sleep(6000);
			
			System.out.println("Successfully navigated to TransList page");
			
		}
		else
			System.out.println("Not able to upload the file through Sikuli");
		
		
		
		
		

		System.out.println("BDD executed When statement");

	}

	@Then("^Details$")
	public void details() throws Throwable {
		System.out.println("BDD executed Then statement");
	}




}

