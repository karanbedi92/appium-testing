package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import support_libraries.DriverActions;

public class SignIn extends DriverActions {
    By username = By.id("com.ebay.mobile:id/edit_text_username");
    By password = By.id("com.ebay.mobile:id/edit_text_password");
    By signInButton = By.id("com.ebay.mobile:id/button_sign_in");
    
    public SignIn(WebDriver driver) {
    	super(driver);
    }
    public SignIn loginIn() {
    	elementSendKeys(username, "karanbedi792@gmail.com");
    	elementSendKeys(password, "Jan@2018");
    	elementClick(signInButton);
    	return new SignIn(driver);
    }

}
