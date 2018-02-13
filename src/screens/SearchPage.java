package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import support_libraries.DriverActions;

public class SearchPage extends DriverActions{
	
    By searchBox = By.id("com.ebay.mobile:id/search_box");
    By searchBoxTxt = By.id("com.ebay.mobile:id/search_src_text");
    By selectOption = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView");
    
    public SearchPage(AppiumDriver driver) {
    	super(driver);
    }
    
    public SearchPage searchProduct() throws InterruptedException {
    	elementClick(searchBox);
    	elementSendKeys(searchBoxTxt,"one plus 5t cover");
    	elementClick(selectOption);
    	return new SearchPage(driver);
    }

}
