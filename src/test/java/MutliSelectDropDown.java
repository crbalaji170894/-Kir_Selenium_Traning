import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutliSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");

		WebElement element = driver.findElement(By.xpath("//select[@id='cars']"));
		// (//div[@class=' css-yk16xz-control'])[3]

		Select sel = new Select(element);

		System.out.println(sel.isMultiple());

		sel.selectByIndex(3);

		Thread.sleep(10000);
		sel.deselectByIndex(3);

	}

}
