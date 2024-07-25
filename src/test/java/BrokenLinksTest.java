import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrokenLinksTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/broken");

		BaseClass base = new BaseClass();

		List<String> brokenLinks = base.brokenLinks(driver);

		for (String eachLink : brokenLinks) {
			System.out.println(eachLink);
		}

//		List<WebElement> allLinksElements = driver.findElements(By.tagName("a"));
//
//		for (WebElement eachElement : allLinksElements) {
//
//			String webLinkURL = eachElement.getAttribute("href");
//
//			System.out.println(webLinkURL);
//			try {
//				URL urlLink = new URL(webLinkURL);
//
//				URLConnection openConnection = urlLink.openConnection();
//
//				HttpURLConnection httpurlconnection = (HttpURLConnection) openConnection;
//
//				httpurlconnection.setConnectTimeout(5000);
//
//				httpurlconnection.connect();
//
//				if (httpurlconnection.getResponseCode() >= 400) {
//					System.out.println(httpurlconnection.getResponseMessage());
//					System.out.println("This is broken Link");
//					System.out.println(webLinkURL);
//				}
//
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//
//		}
//
//	}
	}

}
