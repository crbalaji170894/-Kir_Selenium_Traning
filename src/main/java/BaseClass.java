import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

	// Alert alert = driver.switchTo().alert();

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

	public List brokenLinks(WebDriver driver1) {
		List<WebElement> allLinksElements = driver1.findElements(By.tagName("a"));

		List<String> brokenURLS = new LinkedList();

		for (WebElement eachElement : allLinksElements) {

			try {
				String webLinkURL = eachElement.getAttribute("href");

//				System.out.println(webLinkURL);

				URL urlLink = new URL(webLinkURL);

				URLConnection openConnection = urlLink.openConnection();

				HttpURLConnection httpurlconnection = (HttpURLConnection) openConnection;

				httpurlconnection.setConnectTimeout(5000);

				httpurlconnection.connect();

				if (httpurlconnection.getResponseCode() >= 400) {
//					System.out.println(httpurlconnection.getResponseMessage());
//					System.out.println("This is broken Link");
//					System.out.println(webLinkURL);
					brokenURLS.add(webLinkURL);
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		return brokenURLS;

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

	public Alert alertMethod(WebDriver driver) {

		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public void alertAccept(WebDriver driver) {
		Alert alertMethod = alertMethod(driver);
		alertMethod.accept();

	}

	public void alertDismiss(WebDriver driver) {
		Alert alertMethod = alertMethod(driver);
		alertMethod.dismiss();

	}

	public void sendKeysAlert(WebDriver driver, String text) {
		Alert alertMethod = alertMethod(driver);
		alertMethod.sendKeys(text);

	}

	public void takeScreenShot(WebDriver driver, String filePath) throws IOException {
		TakesScreenshot screenShot = (TakesScreenshot) driver;

		File srcFile = screenShot.getScreenshotAs(OutputType.FILE);

		File destnationFile = new File(filePath);

		FileUtils.copyFile(srcFile, destnationFile);

	}

}
