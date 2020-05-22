package stepDefinitions;

import java.io.IOException;

import CucumberExtent.AdapterExtentReport.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Base {
	
	
	
	
	@Before
	public void beforeScenario(Scenario scenario) {
		
		System.out.println("Execution control enters into Before Scenario hook - Rad");
		
	}
	@After
	public void afterScenario(Scenario scenario) throws IOException {
		
		System.out.println("Execution control enters into after Scenario hook - Rad ");
		if(driver!=null) {
			driver.close();
		    //driver.quit();
		}
		
	}
	
	
	
	
	
	


	

}
