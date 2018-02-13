package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	protected WebDriver driver;
    By username = By.id("com.ebay.mobile:id/edit_text_username");
    By password = By.id("com.ebay.mobile:id/edit_text_password");
    By signInButton = By.id("com.ebay.mobile:id/button_sign_in");
    
    public SignIn(WebDriver driver) {
    	this.driver = driver;
    }
    public SignIn loginIn() {
    driver.findElement(username).sendKeys("karanbedi792@gmail.com");
	 driver.findElement(password).sendKeys("Jan@2018");
	 driver.findElement(signInButton).click();
	 return new SignIn(driver);
    }

}
