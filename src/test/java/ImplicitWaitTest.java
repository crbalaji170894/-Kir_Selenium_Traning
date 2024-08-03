import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement userName = driver.findElement(By.id("email35"));

		userName.sendKeys("test@gpmail.com");

		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("test@123A");

		WebElement button = driver.findElement(By.name("login"));

		button.click();
	}

}
