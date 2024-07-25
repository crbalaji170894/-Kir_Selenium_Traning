import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement userName = driver.findElement(By.id("email"));

		userName.sendKeys("test@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("test@123A");

		WebElement button = driver.findElement(By.name("login"));

		button.click();
		
		Thread.sleep(10000);
//
//		TakesScreenshot screenShot = (TakesScreenshot) driver;
//
//		File srcFile = screenShot.getScreenshotAs(OutputType.FILE);
//
//		File destnationFile = new File("C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\images\\test.png");
//
//		FileUtils.copyFile(srcFile, destnationFile);
		
		BaseClass base = new BaseClass();
		
		base.takeScreenShot(driver, "C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\images\\test.png");
	}

}
