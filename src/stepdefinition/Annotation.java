package stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Annotation {
	public static Scenario scenario1;
	@Before
	public void setup(Scenario scenario) {
		scenario1= scenario;
		//scenario.write("this is my message");
		System.out.println("Scenario Name:: " + scenario.getName());
		System.out.println("Scenario Tags:: " + scenario.getSourceTagNames());
	}
	
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("Scenario status:: " + scenario.getStatus());
		scenario.write("jndjhasjdasd jsdjsa");
	}

}
