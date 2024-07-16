import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	WebDriver chromeDriver = new ChromeDriver();

	WebDriver fireFoxDriver = new FirefoxDriver();
	
	WebDriver internetExplorerDriver = new InternetExplorerDriver();

	public void chromeBrowserInstantiation() throws IOException {

		System.setProperty(Constants.chromeDriverKey, System.getProperty("userdir") + Constants.chromeDriverPath);

		String url = AccessProperties.accessPropertiesValues("selenium_url");

		chromeDriver.get(url);

	}

	public WebDriver firefoxBrowserInstantiaon() throws IOException {

		System.setProperty(Constants.geckoDriverKey, System.getProperty("userdir") + Constants.geckoDriverPath);

		String url = AccessProperties.accessPropertiesValues("fb_URL");

		fireFoxDriver.get(url);
		
		return fireFoxDriver;

	}
	public void IeBrowserInstantiation() throws IOException {

		System.setProperty(Constants.ieDriverKey , System.getProperty("userdir") + Constants.ieDriverPath);

		String url = AccessProperties.accessPropertiesValues("gmail_URL");

		internetExplorerDriver.get(url);

	}

	
}
