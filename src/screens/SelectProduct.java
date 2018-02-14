package screens;

import io.appium.java_client.AppiumDriver;
import support_libraries.DriverActions;

/**
 * Page object model Class for select product screen. Contains methods to select
 * the product in the app.
 * 
 * @author Karan Bedi
 * @email Karan.Bedi@cognizant.com
 */

public class SelectProduct extends DriverActions {

	@SuppressWarnings("rawtypes")
	public SelectProduct(AppiumDriver driver) {
		super(driver);
	}

	public void selectProduct() throws InterruptedException {
		if(getOrientation()=="landscape") {
			rotateScreen("portrait");
		}
		screenSwipe(521, 1223, 4, -269);
		elementTap(479, 588);
	}

}
