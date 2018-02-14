package screens;

import io.appium.java_client.AppiumDriver;
import support_libraries.DriverActions;

/**
 * Page object model Class for product buy screen. 
 * 
 * @author Karan Bedi
 * @email Karan.Bedi@cognizant.com
 */

public class ProductBuy extends DriverActions {

	@SuppressWarnings("rawtypes")
	public ProductBuy(AppiumDriver driver) {
		super(driver);
	}

	public void selectProduct() throws InterruptedException {
		if(getOrientation()=="landscape") {
			rotateScreen("portrait");
		}
	}

}
