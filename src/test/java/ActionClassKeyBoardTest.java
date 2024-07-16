import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassKeyBoardTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement textuserNameBoxWebelement = driver.findElement(By.id("email"));

		Actions acc = new Actions(driver);

		acc.moveToElement(textuserNameBoxWebelement).click().keyDown(Keys.SHIFT).sendKeys("testemail@gmail.com")
				.keyUp(Keys.SHIFT).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.TAB).keyUp(Keys.TAB)
				.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

		Thread.sleep(10000);
	}

}
