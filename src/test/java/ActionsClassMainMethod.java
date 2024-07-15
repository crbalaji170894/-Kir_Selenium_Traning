import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMainMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

//		driver.get("https://www.facebook.com/");

		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		driver.get("https://demoqa.com/droppable/");
	//	WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

//		WebElement webelement = driver.findElement(By.xpath("//a[text()='Messenger']"));
//
//		WebElement webElement2 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		Actions acc = new Actions(driver);
//
//		acc.moveToElement(webelement).perform();
//
//		driver.manage().window().maximize();
//
//		Thread.sleep(10000);
//
//		webelement.click();
		
		WebElement sourceElement = driver.findElement(By.xpath("//div[text()='Drag me']"));
		
		WebElement destinationElement = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions acc = new Actions(driver);

		// acc.contextClick(element).perform();

		//acc.doubleClick(element).perform();
		
		acc.dragAndDrop(sourceElement, destinationElement).perform();

		Thread.sleep(10000);

	}

}
