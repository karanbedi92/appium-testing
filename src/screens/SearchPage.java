package screens;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import support_libraries.DriverActions;
import support_libraries.ExcelUtils;

/**
 * Page object model Class for search screen. Contains methods for searching the
 * product in the app.
 * 
 * @author Karan Bedi
 * @email Karan.Bedi@cognizant.com
 * 
 */
public class SearchPage extends DriverActions {

	By searchBox = By.id("com.ebay.mobile:id/search_box");
	By searchBoxTxt = By.id("com.ebay.mobile:id/search_src_text");
	By selectOption = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView");

	@SuppressWarnings("rawtypes")
	public SearchPage(AppiumDriver driver) throws Exception {
		super(driver);

		// Setting the test-data file used for data and the sheet name.
		ExcelUtils.setExcelFile("datasheet.xlsx", "search_product");
	}

	public void searchProduct() throws Exception {
		if(getOrientation()=="landscape") {
			rotateScreen("portrait");
		}
		waitForVisibilityOf(searchBox, 30);
		elementClick(searchBox);

		// Fetching the data from excel i.e product name to be searched in this case.
		elementSendKeys(searchBoxTxt, ExcelUtils.getCellData(1, 0));
		
		waitForVisibilityOf(selectOption, 30);
		elementClick(selectOption);
	}

}
