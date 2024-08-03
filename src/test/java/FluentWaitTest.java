import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(60))
			       .pollingEvery(Duration.ofSeconds(10))
			       .ignoring(NoSuchElementException.class);

		
		 WebElement userName = driver.findElement(By.id("email"));

		userName.sendKeys("test@gpmail.com");

		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("test@123A");

		WebElement button = driver.findElement(By.name("login"));

		wait.until(ExpectedConditions.elementToBeClickable(button));

		button.click();

	}

}
