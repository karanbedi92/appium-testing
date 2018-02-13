package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import support_libraries.DriverActions;

public class LinkAccount extends DriverActions{
    By noThanksButton = By.id("com.ebay.mobile:id/button_google_deny");
    
    public LinkAccount(WebDriver driver) {
    	super(driver);
    }
    public LinkAccount denyGoogleLinkRequest() {
    	elementClick(noThanksButton);
    	return new LinkAccount(driver);
    }
}
