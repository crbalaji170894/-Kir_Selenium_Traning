import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://easyupload.io/");

		driver.manage().window().maximize();

		StringSelection filePath = new StringSelection("C:\\ExcelUtils.java");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		driver.findElement(By.xpath("//button[@class='dz-button']")).click();

		Robot robot = new Robot();

//		robot.delay(250);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		

		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
