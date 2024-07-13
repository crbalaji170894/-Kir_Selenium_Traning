import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedAndPartialLinkedText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		// WebElement linkedText = driver.findElement(By.linkText("Gmail"));

		// linkedText.click();

		WebElement partialLinkedText = driver.findElement(By.partialLinkText("Gm"));

		partialLinkedText.click();

	}

}
