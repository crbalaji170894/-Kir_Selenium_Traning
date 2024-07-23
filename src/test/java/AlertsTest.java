import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
//simple alert
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi?%3CAuthentication");
//
//		driver.manage().window().maximize();
//
//		driver.findElement(By.xpath("//input[@name ='proceed']")).click();
//
//		Thread.sleep(10000);
//
//		Alert al = driver.switchTo().alert();
//
//		al.accept();
	//confrim alert	
//		driver.get("https://demo.guru99.com/test/delete_customer.php");
//		
//		driver.findElement(By.xpath("//input[@name='submit']")).click();
//		
//		Thread.sleep(10000);
//
//		Alert al = driver.switchTo().alert();
//
//		//al.accept();
//		
//		al.dismiss();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		Thread.sleep(10000);

		Alert al = driver.switchTo().alert();
		
		al.sendKeys("Hello World");
		
		Thread.sleep(10000);

		al.accept();
		
		//al.dismiss();

	}

}
