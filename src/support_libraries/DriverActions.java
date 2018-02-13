package support_libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;

public class DriverActions {

    protected AppiumDriver driver;

    public DriverActions(AppiumDriver driver) {
        this.driver = driver;
    }

    protected void elementClick(By elementSelector) {
    	driver.findElement(elementSelector).click();
    }
    
    protected void elementSendKeys(By elementSelector,String value) {
    	driver.findElement(elementSelector).sendKeys(value);
    }
    
    protected void screenSwipe() {
    	(new TouchAction((PerformsTouchActions)driver)).press(521,1223).moveTo(4,-269).release().perform();
    }
    
    protected void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected void waitForClickabilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    
}
