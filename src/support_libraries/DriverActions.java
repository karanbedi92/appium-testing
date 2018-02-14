package support_libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;

/**
 * Class for all the performing actions int the device. Contains methods for
 * performing actions like sendkeys, click, wait, swiping.
 * 
 * @author Karan Bedi
 * @email Karan.Bedi@cognizant.com
 */

@SuppressWarnings("rawtypes")
public class DriverActions {
	protected AppiumDriver driver;

	public DriverActions(AppiumDriver driver) {
		this.driver = driver;
	}

	protected void elementClick(By elementSelector) {
		driver.findElement(elementSelector).click();
	}

	protected void elementSendKeys(By elementSelector, String value) {
		driver.findElement(elementSelector).sendKeys(value);
	}

	protected void screenSwipe() {
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
