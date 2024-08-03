import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement userName = driver.findElement(By.id("email"));

		userName.sendKeys("test@gpmail.com");

		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("test@123A");

		WebElement button = driver.findElement(By.name("login"));

		wait.until(ExpectedConditions.elementToBeClickable(button));

		button.click();
	}

}
