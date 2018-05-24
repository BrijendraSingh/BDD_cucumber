package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericUtils {
	
	public static WebDriver driver;
	public static WebDriver setWebdriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/resources/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

}
