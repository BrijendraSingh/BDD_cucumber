package stepdefinition;

import static org.junit.Assert.assertTrue;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page.GooglePage;
import utils.GenericUtils;

public class googlesteps extends GenericUtils{
	@Given("^I launch the google news$")
	public void i_launch_the_google_news() throws Throwable {
	   new GooglePage().launchApp("https://www.news.google.com");
	   System.out.println("App laucnde")
	}

	@Then("^I read the googles news headlines$")
	public void i_read_the_googles_news_headlines() throws Throwable {
	   new GooglePage().readNewsHeadlines(); 
	    
	}
}
