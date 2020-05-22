package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import CucumberExtent.AdapterExtentReport.Base;

//import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepMLTLogin{
	
	   public WebDriver driver;
	   
	   public static String SearchKeyword = "selenium tutorial";
	   
	    @Given("^LoginPage$")
	    public void loginpage() throws Throwable {
	    	
	    	 System.out.println("Execution Control Enters into Given statement");
	    	 driver=Base.getDriver();
			 driver.get("https://www.google.com/");
	    	 driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(SearchKeyword);	
	    	 driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
 			 
				
			
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

