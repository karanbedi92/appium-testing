package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import support_libraries.DriverActions;

public class LinkAccount extends DriverActions{
    By noThanksButton = By.id("com.ebay.mobile:id/button_google_deny");
    
    public LinkAccount(AppiumDriver driver) {
    	super(driver);
    }
    public LinkAccount denyGoogleLinkRequest() {
    	elementClick(noThanksButton);
    	return new LinkAccount(driver);
    }
}
