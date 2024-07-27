import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/guru99home/");
		
		List<WebElement> allframesWebElements = driver.findElements(By.tagName("iframe"));
		
		System.out.println(allframesWebElements.size());
		
//		for(int i =0; i<=allframesWebElements.size();i++)
//		{
//			
//			driver.switchTo().frame(i);
//		}
//		
		driver.switchTo().frame(3);
		
		WebDriver parentFrame = driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
	}

}
