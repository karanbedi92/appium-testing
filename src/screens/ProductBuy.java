package screens;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import support_libraries.DriverActions;

/**
 * Page object model Class for product buy screen.
 * 
 * @author Karan Bedi
 * @email Karan.Bedi@cognizant.com
 */

public class ProductBuy extends DriverActions {

	By buyButton = By.id("Buy It Now");

	@SuppressWarnings("rawtypes")
	public ProductBuy(AppiumDriver driver) {
		super(driver);
	}

	public void buyProduct() throws InterruptedException {
		if (getOrientation() == "landscape") {
			rotateScreen("portrait");
		}
		elementClick(buyButton);
	}

}
