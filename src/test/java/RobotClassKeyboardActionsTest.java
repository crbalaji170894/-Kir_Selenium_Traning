import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassKeyboardActionsTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.gmail.com/");

		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("crebalaji17@gmail.com");

		WebElement element = driver.findElement(By.xpath("//a[text()='Learn more about using Guest mode']"));

		Actions acc = new Actions(driver);

		acc.contextClick(element).perform();

		Thread.sleep(5000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);

		robot.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(5000);

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

//		robot.keyPress(KeyEvent.VK_TAB);
//
//		robot.keyRelease(KeyEvent.VK_TAB);
//
//		Thread.sleep(5000);
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);
//
//		Thread.sleep(5000);
//
//		robot.keyPress(KeyEvent.VK_TAB);
//
//		robot.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(5000);
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(5000);
	}

}