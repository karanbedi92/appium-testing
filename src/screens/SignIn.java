package screens;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import support_libraries.DriverActions;
import support_libraries.ExcelUtils;

/**
 * Page object model Class for sign in screen. Contains methods to navigate to
 * login in the app.
 * 
 * @author Karan Bedi
 * @email Karan.Bedi@cognizant.com
 */

public class SignIn extends DriverActions {
	By username = By.id("com.ebay.mobile:id/edit_text_username");
	By password = By.id("com.ebay.mobile:id/edit_text_password");
	By signInButton = By.id("com.ebay.mobile:id/button_sign_in");

	@SuppressWarnings("rawtypes")
	public SignIn(AppiumDriver driver) throws Exception {
		super(driver);

		// Setting the test-data file used for data and the sheet name.
		ExcelUtils.setExcelFile("datasheet.xlsx", "sign_in");
	}

	public void loginIn() throws Exception {
		if(getOrientation()=="landscape") {
			rotateScreen("portrait");
		}

		waitForVisibilityOf(username, 30);
		
		// Fetching the data from excel i.e username & password in this case.
		elementSendKeys(username, ExcelUtils.getCellData(1, 1));
		elementSendKeys(password, ExcelUtils.getCellData(1, 2));
		waitForClickabilityOf(signInButton,30);
		elementClick(signInButton);
	}
}