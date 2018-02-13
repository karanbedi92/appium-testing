package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import support_libraries.DriverActions;

public class EbayHome extends DriverActions {
    By sideMenu = By.id("com.ebay.mobile:id/home");
    By signIn = By.id("com.ebay.mobile:id/home");
    
    public EbayHome(AppiumDriver driver) {
    	super(driver);
    }
    public EbayHome navigateSignIn() {
    	elementClick(sideMenu);
    	elementClick(signIn);
    	return new EbayHome(driver);
    }
}
