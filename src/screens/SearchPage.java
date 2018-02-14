package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import support_libraries.DriverActions;
import support_libraries.ExcelUtils;

public class SearchPage extends DriverActions{
	
    By searchBox = By.id("com.ebay.mobile:id/search_box");
    By searchBoxTxt = By.id("com.ebay.mobile:id/search_src_text");
    By selectOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView");
    
    public SearchPage(AppiumDriver driver) throws Exception {
    	super(driver);
    	ExcelUtils.setExcelFile("datasheet.xlsx", "search_product");
    }
    
    public SearchPage searchProduct() throws Exception {
    	elementClick(searchBox);
    	elementSendKeys(searchBoxTxt,ExcelUtils.getCellData(1, 0));
    	elementClick(selectOption);
    	return new SearchPage(driver);
    }

}
