package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import support_libraries.DriverActions;
import support_libraries.ExcelUtils;

public class SignIn extends DriverActions {
    By username = By.id("com.ebay.mobile:id/edit_text_username");
    By password = By.id("com.ebay.mobile:id/edit_text_password");
    By signInButton = By.id("com.ebay.mobile:id/button_sign_in");
    
    public SignIn(AppiumDriver driver) throws Exception {
    	super(driver);
    	ExcelUtils.setExcelFile("datasheet.xlsx", "sign_in");
    }
    public SignIn loginIn() throws Exception {
    	elementSendKeys(username, ExcelUtils.getCellData(1, 1));
    	elementSendKeys(password, ExcelUtils.getCellData(1, 2));
    	elementClick(signInButton);
    	return new SignIn(driver);
    }

}
