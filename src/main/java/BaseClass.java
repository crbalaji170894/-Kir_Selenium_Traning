import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	WebDriver driver;

	WebDriver chromeDriver = new ChromeDriver();

	WebDriver fireFoxDriver = new FirefoxDriver();

	WebDriver internetExplorerDriver = new InternetExplorerDriver();

	Alert alert = driver.switchTo().alert();

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

		System.setProperty(Constants.ieDriverKey, System.getProperty("userdir") + Constants.ieDriverPath);

		String url = AccessProperties.accessPropertiesValues("gmail_URL");

		internetExplorerDriver.get(url);

	}

	public WebDriver moveToElementMethod(WebDriver driver, WebElement element) {

		Actions acc = new Actions(driver);

		acc.moveToElement(element).perform();

		return driver;

	}

	public WebDriver dragAndDropMethod(WebDriver driver, WebElement sourceElement, WebElement destinationElement) {

		Actions acc = new Actions(driver);

		acc.dragAndDrop(sourceElement, destinationElement).perform();

		return driver;

	}

	public WebDriver rightClick(WebDriver driver, WebElement element) {

		Actions acc = new Actions(driver);

		acc.contextClick(element).perform();

		return driver;

	}

	public WebDriver doubleClick(WebDriver driver, WebElement element) {

		Actions acc = new Actions(driver);

		acc.doubleClick(element).perform();

		return driver;

	}

	public WebDriver clickMethod(WebElement element, WebDriver driver) {
		element.click();
		return driver;
	}

	public WebDriver getPage(String url, WebDriver driver) {

		driver.get(url);
		return driver;

	}

	public Robot robotClass() throws AWTException {

		Robot robot = new Robot();

		return robot;

	}

	public void alertAccept(WebDriver driver) {
		this.driver = driver;
		alert.accept();

	}

	public void alertDismiss(WebDriver driver) {
		this.driver = driver;
		alert.dismiss();

	}

	public void sendKeysAlert(WebDriver driver, String text) {
		this.driver = driver;
		alert.sendKeys(text);

	}

}
