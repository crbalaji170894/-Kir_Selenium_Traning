import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindWebElementIDLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement userName = driver.findElement(By.id("email"));

		userName.sendKeys("test@gpmail.com");

		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("test@123A");

		WebElement button = driver.findElement(By.name("login"));

		button.click();
	}                  

}
