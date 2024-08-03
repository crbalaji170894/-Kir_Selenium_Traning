import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTestTwo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://moneyboats.com/");

		driver.manage().window().maximize();

		WebElement scrollDownElement = driver.findElement(By.xpath("//h3[text()='Archive']"));

		WebElement scrollUpElement = driver.findElement(By.xpath("(//span[text()='Home'])[2]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", scrollDownElement, scrollUpElement);
		
		Thread.sleep(10000);
		
		js.executeScript("arguments[1].scrollIntoView(false);", scrollDownElement, scrollUpElement);
	}

}
