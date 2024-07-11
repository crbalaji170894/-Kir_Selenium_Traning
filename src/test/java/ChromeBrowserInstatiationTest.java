import java.io.IOException;

public class ChromeBrowserInstatiationTest {

	BaseClass baseObj = new BaseClass();

//	ChromeBrowserInstatiationTest() throws IOException {
//		baseObj.chromeBrowserInstantiation();
//
//	}

	public void browserInstantiationTest(String browserName) throws IOException {

		switch (browserName) {

		case "chrome":
			baseObj.chromeBrowserInstantiation();
			break;

		case "gecko":
			baseObj.firefoxBrowserInstantiaon();
			break;
		case "ie":
			baseObj.IeBrowserInstantiation();
			break;

		default:
			System.out.println("Browser Name is not matched anywhere");
			break;
		}

	}

	public static void main(String[] args) throws IOException {
		ChromeBrowserInstatiationTest obj = new ChromeBrowserInstatiationTest();
		obj.browserInstantiationTest("gecko");
		obj.browserInstantiationTest("ie");

	}

}
