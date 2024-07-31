import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableClassTest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://qavbox.github.io/demo/webtable/");

		driver.manage().window().maximize();

		WebElement table_element = driver.findElement(By.xpath("//table[@id='table01']"));
		
		List<WebElement> allRow = table_element.findElements(By.tagName("tr"));
		
		for(WebElement eachRow:allRow) {
			List<WebElement> tDataElements = eachRow.findElements(By.tagName("td"));
			
			for(WebElement eachDataElement:tDataElements)
			{
				String tableText = eachDataElement.getText();
				System.out.println(tableText);
				
				if(tableText.equals("Selenium"))
				{
					eachDataElement.click();
				}
				
			}
		}

	}

}
