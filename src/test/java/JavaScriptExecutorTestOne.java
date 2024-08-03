import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTestOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi?%3CAuthentication");

		driver.manage().window().maximize();

		WebElement submit = driver.findElement(By.xpath("//input[@name='proceed']"));

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// js.executeScript("arguments[1].click();", password,submit);

//		js.executeScript("arguments[1].setAttribute('value','hellow@123');", submit, password);
//
//		String value = (String) js.executeScript("return  arguments[1].getAttribute('value');", submit, password);
//
//		System.out.println(value);
		
		
	}

}
