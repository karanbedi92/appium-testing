package screens;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import support_libraries.DriverActions;

/**
 * Page object model Class for LinkAccount screen. Contains methods to deny
 * linking of google account to the app.
 * 
 * @author Karan Bedi
 * @email Karan.Bedi@cognizant.com
 */

public class LinkAccount extends DriverActions {
	By noThanksButton = By.id("com.ebay.mobile:id/button_google_deny");

	@SuppressWarnings("rawtypes")
	public LinkAccount(AppiumDriver driver) {
		super(driver);
	}

	public LinkAccount denyGoogleLinkRequest() {
		elementClick(noThanksButton);
		return new LinkAccount(driver);
	}
}
