import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");

		String parentWindowID = driver.getWindowHandle();

		System.out.println(parentWindowID);

		Set<String> allWindowId = driver.getWindowHandles();

		System.out.println(allWindowId);
		for (String eachWindowId : allWindowId) {

			if (!parentWindowID.equals(eachWindowId)) {

				driver.switchTo().window(eachWindowId);

				System.out.println(eachWindowId);
			}
		}
	}

}
