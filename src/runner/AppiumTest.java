package runner;

import org.junit.Test;
//import org.testng.annotations.Test;
import screens.EbayHome;
import screens.LinkAccount;
import screens.ProductBuy;
import screens.SearchPage;
import screens.SelectProduct;
import screens.SignIn;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;

import org.testng.Reporter;
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
			Reporter.log("Application Lauched successfully |");
			new EbayHome(driver).navigateSignIn();
			Reporter.log("Navigated to Sign in successfully | ");
			new SignIn(driver).loginIn();
			Reporter.log("Successfully logged in | ");
			new LinkAccount(driver).denyGoogleLinkRequest();
			new SearchPage(driver).searchProduct();
			Reporter.log("Product searched successfully | ");
			Thread.sleep(10000);
			new SelectProduct(driver).selectProduct();
			Reporter.log("Product selected successfully | ");
			new ProductBuy(driver).buyProduct();
			Reporter.log("Poduct bought successfully ");
		} catch (Exception e) {
			System.out.println(e);
			Reporter.log("Application Testing Failed with following error : " + e);
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
