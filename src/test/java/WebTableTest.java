import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://qavbox.github.io/demo/webtable/");

		driver.manage().window().maximize();

		List<WebElement> tableElements = driver.findElements(By.tagName("table"));

		for (WebElement eachTable : tableElements) {
			List<WebElement> trelements = eachTable.findElements(By.tagName("tr"));

			for (WebElement eachRowElement : trelements) {
				//List<WebElement> tdElements = eachRowElement.findElements(By.tagName("td"));
				List<WebElement> tdElements = eachRowElement.findElements(By.tagName("th"));
				for (WebElement eachTableData : tdElements) {
					System.out.println(eachTableData.getText());
				}
			}
		}

	}

}
