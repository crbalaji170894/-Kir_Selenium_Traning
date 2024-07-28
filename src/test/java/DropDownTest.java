import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement dropDownWebelement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

		Select sel_obj = new Select(dropDownWebelement);
		
		System.out.println(sel_obj.isMultiple());
		

		List<WebElement> allOptionsWebElement = sel_obj.getOptions();

		// System.out.println(allOptionsWebElement);
		for (WebElement eachOptionWebElement : allOptionsWebElement) {

			sel_obj.selectByVisibleText(eachOptionWebElement.getText());

		}

		List<WebElement> allSelectedOptions = sel_obj.getAllSelectedOptions();

		for (WebElement eachOption : allSelectedOptions) {
			System.out.println(eachOption.getText());

			// String eachOptionText = eachOptionWebElement.getText();
//			System.out.println(eachOptionText);
//			if (eachOptionText.equals("Amazon Fresh")) {
//				System.out.println(eachOptionText);
//				//sel_obj.selectByValue(eachOptionText);
//				//sel_obj.selectByIndex(2);
//				sel_obj.selectByValue(eachOptionText);
//			}
		}
		
		sel_obj.deselectAll();

	}

}
