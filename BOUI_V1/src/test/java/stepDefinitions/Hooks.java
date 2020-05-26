package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.reusable.library.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks{
	
	public WebDriver driver;
	
	
	@Before
	public void beforeScenario(Scenario scenario) throws IOException {
		
		System.out.println("Control entered into the Before hook");
		driver=Base.getDriver();
		System.out.println("Control Executed the Before hook");
		
		
	}
	@After
	public void afterScenario(Scenario scenario) throws IOException {
		
		
		System.out.println("Control executed the After hook");
	
		
	}
	
	
	
	
	
	


	

}
