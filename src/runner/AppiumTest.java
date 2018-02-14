package runner;

import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import screens.EbayHome;
import screens.LinkAccount;
import screens.SearchPage;
import screens.SignIn;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import org.testng.annotations.AfterTest;

/**
 * TestNg class where actual test executes. "validateProductCheckout" method
 * executes the complete flow of the testing from sign,searching the product and
 * buying it.
 * 
 * @author Karan Bedi
 * @email Karan.Bedi@cognizant.com
 */

public class AppiumTest extends AndroidDriverSetup {
	@Test
	public void validateProductCheckout() {
		try {
			new EbayHome(driver).navigateSignIn();
			Thread.sleep(1000);
			new SignIn(driver).loginIn();
			new LinkAccount(driver).denyGoogleLinkRequest();
			Thread.sleep(1000);
			new SearchPage(driver).searchProduct();
			Thread.sleep(10000);
			// new SelectProduct(driver).selectProduct();
			(new TouchAction(driver)).press(521, 1223).moveTo(4, -269).release().perform();
			Thread.sleep(10000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@BeforeTest
	public void beforeTest() throws MalformedURLException {
		// Calling initializing driver method for android testing.
		prepareAndroidForAppium();
	}

	@AfterTest
	public void afterTest() {
		// Quiting the driver after everything is done.
		driver.quit();
	}

}
