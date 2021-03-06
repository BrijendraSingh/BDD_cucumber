package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.Scenario;
import stepdefinition.Annotation;
import utils.GenericUtils;

public class GooglePage extends GenericUtils{
	Scenario scenario;
	
	@FindBy(xpath="//a[@class='ipQwMb Q7tWef']/span")
	List<WebElement> results;
	
	public GooglePage() {
		scenario = Annotation.scenario1;
		PageFactory.initElements(driver, this);
	}
	
	public void launchApp(String url) {
		driver.navigate().to(url);
		report("Application launched: " + url);
	}
	
	public void readNewsHeadlines() {
		int c=0;
		report("Total result: " + results.size());
		for (WebElement ele: results){
			if (!ele.getText().isEmpty()) {
				report(c+" --> " + ele.getText());
			c++;
			}
		}
	}

}
