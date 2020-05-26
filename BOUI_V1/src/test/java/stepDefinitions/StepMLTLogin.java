package stepDefinitions;

//import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

	public WebDriver driver;
	PageObjectO2 pgObj = new PageObjectO2();

	public static String O2username = "A1015238";
	public static String O2pwd ="Alliswell20";
	public static String lan_ID = "A1015238";

	@Given("^LoginPage$")
	public void loginpage() throws Throwable {

		System.out.println("Execution Control Enters into Given statement");
  
		driver=Base.getDriver();
		ReadPropFile dataObj = new ReadPropFile();
		driver.get(dataObj.getMLTUrl());
		driver.findElement(By.xpath(pgObj.userNametxtbx_xpath)).sendKeys(dataObj.getMLTUserName());	
		driver.findElement(By.xpath(pgObj.pwdtxtbx_xpath)).sendKeys(dataObj.getMLTPwd());
		driver.findElement(By.xpath(pgObj.loginbtn_xpath)).click();
		System.out.println("Execution Completed for Given statement");


	}

	@When("^EnterUserName$")
	public void enterusername() throws Throwable {

		System.out.println("BDD executed When statement");

	}

	@Then("^Details$")
	public void details() throws Throwable {
		System.out.println("BDD executed Then statement");
	}




}

