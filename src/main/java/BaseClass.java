import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	WebDriver chromeDriver = new ChromeDriver();

	WebDriver fireFoxDriver = new FirefoxDriver();

	public void chromeBrowserInstantiation() throws IOException {

		System.setProperty(Constants.chromeDriverKey, System.getProperty("userdir") + Constants.chromeDriverPath);

		String url = AccessProperties.accessPropertiesValues("selenium_url");

		chromeDriver.get(url);

	}

	public void firefoxBrowserInstantiaon() throws IOException {

		System.setProperty(Constants.geckoDriverKey, System.getProperty("userdir") + Constants.geckoDriverPath);

		String url = AccessProperties.accessPropertiesValues("fb_URL");

		fireFoxDriver.get(url);

	}

}
