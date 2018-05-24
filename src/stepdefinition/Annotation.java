package stepdefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.GenericUtils;

public class Annotation extends GenericUtils{
	public static Scenario scenario1;
	public WebDriver driver;
	@Before
	public void setup(Scenario scenario) {
		scenario1= scenario;
		System.out.println("Scenario Name:: " + scenario.getName());
		System.out.println("Scenario Tags:: " + scenario.getSourceTagNames());
		driver =setWebdriver();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("Scenario status:: " + scenario.getStatus());
		report("Execution End");
		if (driver!=null) {
			driver.close();
			report("**Browser Closed**");
		}
	}

}
