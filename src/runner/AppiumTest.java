package runner;

import org.testng.annotations.Test;
import screens.EbayHome;
import screens.LinkAccount;
import screens.SearchPage;
import screens.SelectProduct;
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
			new SignIn(driver).loginIn();
			new LinkAccount(driver).denyGoogleLinkRequest();
			new SearchPage(driver).searchProduct();
			Thread.sleep(10000);
			new SelectProduct(driver).selectProduct();
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
