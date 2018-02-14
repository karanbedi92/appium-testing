package screens;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import support_libraries.DriverActions;

/**
 * Page object model Class for ebay home screen. Contains methods to navigate to
 * sign in screen in the app.
 * 
 * @author Karan Bedi
 * @email Karan.Bedi@cognizant.com
 */

public class EbayHome extends DriverActions {
	By sideMenu = By.id("com.ebay.mobile:id/home");
	By signIn = By.id("com.ebay.mobile:id/home");

	@SuppressWarnings("rawtypes")
	public EbayHome(AppiumDriver driver) {
		super(driver);
	}

	public void navigateSignIn() {
		if(getOrientation()=="landscape") {
			rotateScreen("portrait");
		}
		elementClick(sideMenu);
		elementClick(signIn);
	}
}
