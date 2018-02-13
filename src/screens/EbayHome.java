package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EbayHome {
	protected WebDriver driver;
    By sideMenu = By.id("com.ebay.mobile:id/home");
    By signIn = By.id("com.ebay.mobile:id/home");
    
    public EbayHome(WebDriver driver) {
    	this.driver = driver;
    }
    public EbayHome navigateSignIn() {
    driver.findElement(By.id("com.ebay.mobile:id/home")).click();
	 driver.findElement(By.id("com.ebay.mobile:id/home")).click();
	 return new EbayHome(driver);
    }
}