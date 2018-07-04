package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import stepdefinition.Annotation;

public class GenericUtils {
	
	public static WebDriver driver;
	public static Scenario scenario;
	public static WebDriver setWebdriver() {
		scenario = getScenario();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/resources/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static Scenario getScenario() {
		scenario = Annotation.scenario1;
		return scenario;
	}
	
	public void report(String text) {
		scenario.write(text);
		//
	}

}
