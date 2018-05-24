package page;

import cucumber.api.Scenario;
import stepdefinition.Annotation;

public class GooglePage {
	Scenario scenario;
	public GooglePage() {
		scenario = Annotation.scenario1;
	}
	
	public void writescenario() {
		scenario.write("my test.....");
	}

}
