import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FBLoginPage;

public class FBLoginPageTestWithPOM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Kir_Selenium_Traning\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		FBLoginPage fbPage = new FBLoginPage(driver);
		
		fbPage.getUserNameTextBox().sendKeys("test@gmail.com");
		
		fbPage.getPassTextBox().sendKeys("test@123A");
		
		fbPage.getLoginButton().click();		
	}

}
