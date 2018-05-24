package stepdefinition;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page.GooglePage;

public class googlesteps {
	@Given("^I launch the google news$")
	public void i_launch_the_google_news() throws Throwable {
	   System.out.println("Goole is launched");
	   new GooglePage().writescenario();
	}

	@Then("^I read the googles news headlines$")
	public void i_read_the_googles_news_headlines() throws Throwable {
	    System.out.println("Goole news is read");
	    new GooglePage().writescenario();
	    assertTrue(false);
	}
}
