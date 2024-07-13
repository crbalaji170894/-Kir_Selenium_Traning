import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XPathTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement textBox = driver.findElement(By.xpath("//input[@id='email']"));

		textBox.sendKeys("test@gmail.com");

		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("test@123A");

		driver.findElement(By.xpath("//button[@name='login']")).click();

		Thread.sleep(10000);

		Navigation navigate = driver.navigate();

		navigate.back();

		driver.navigate().back();

		driver.navigate().forward();

		driver.manage().window().minimize();

		driver.manage().window().maximize();

		// driver.close();

		// driver.quit();

		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);

		String title = driver.getTitle();

		System.out.println(title);

		String pageSource = driver.getPageSource();

		System.out.println(pageSource);

	}

}
