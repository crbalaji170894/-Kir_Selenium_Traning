import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pages.FBLoginPage;

public class BaseClassAndPOMIntegrationTest {

	BaseClass baseClass = new BaseClass();

	public void test_01_LoginWithValidUserNameAndInvlaidPassword() throws IOException, InterruptedException {
		WebDriver firefoxBrowserInstantiaon = baseClass.firefoxBrowserInstantiaon();

		FBLoginPage fb_Page = new FBLoginPage(firefoxBrowserInstantiaon);

		fb_Page.getUserNameTextBox().sendKeys("test@gmail.com");

		fb_Page.getPassTextBox().sendKeys("test@123A");

		fb_Page.getLoginButton().click();

		Thread.sleep(10000);

	//	firefoxBrowserInstantiaon.close();

	}

	public void test_02_LoginWithinValidUserNameAndInvlaidPassword() throws IOException, InterruptedException {
		WebDriver firefoxBrowserInstantiaon = baseClass.firefoxBrowserInstantiaon();

		FBLoginPage fb_Page = new FBLoginPage(firefoxBrowserInstantiaon);

		fb_Page.getUserNameTextBox().sendKeys(" ");

		fb_Page.getPassTextBox().sendKeys("");

		Thread.sleep(10000);

		fb_Page.getLoginButton().click();

		Thread.sleep(10000);

		//firefoxBrowserInstantiaon.close();

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClassAndPOMIntegrationTest obj = new BaseClassAndPOMIntegrationTest();
		obj.test_01_LoginWithValidUserNameAndInvlaidPassword();
		obj.test_02_LoginWithinValidUserNameAndInvlaidPassword();
	}

}
