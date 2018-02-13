package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkAccount {
	protected WebDriver driver;
    By noThanksButton = By.id("com.ebay.mobile:id/button_google_deny");
    
    public LinkAccount(WebDriver driver) {
    	this.driver = driver;
    }
    public LinkAccount denyGoogleLinkRequest() {
    driver.findElement(noThanksButton).click();
	 return new LinkAccount(driver);
    }
}
