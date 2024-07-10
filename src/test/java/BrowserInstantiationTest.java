import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserInstantiationTest {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://www.selenium.dev/downloads/");
//
		System.setProperty("wedriver.gecko.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\geckodriver.exe");

		WebDriver driver1 = new FirefoxDriver();

		driver1.get("https://www.selenium.dev/downloads/");

		System.setProperty("webdriver.iedriverserver.driver",
				System.getProperty("user.dir") + "\\Kir_Selenium_Traning\\drivers\\IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();

		driver2.get("https://www.selenium.dev/downloads/");
	}

}
