package support_libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

/**
 * Class for all the performing actions int the device. Contains methods for
 * performing actions like sendkeys, click, wait, swiping, assert, rotation etc.
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

	protected void rotateScreen(String orientation) {
		ScreenOrientation position;
		switch (orientation) {
		case "portrait":
			position = ScreenOrientation.PORTRAIT;
			break;
		case "landscape":
			position = ScreenOrientation.LANDSCAPE;
			break;
		default:
			position = ScreenOrientation.PORTRAIT;

		}
		driver.rotate(position);
	}
	
	protected String getOrientation() {
		return driver.getOrientation().value();
	}

	@SuppressWarnings("deprecation")
	protected void screenSwipe(int xStart, int yStart, int xEnd, int yEnd) {
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(xStart, yStart).moveTo(xEnd, xEnd).release().perform();
	}

	protected void waitForVisibilityOf(By locator, long timeOutSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	protected void waitForClickabilityOf(By locator, long timeOutSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	protected void getText(By elementSelector) {
		driver.findElement(elementSelector).getText();
	}

	protected void getAssert(String textOne, String textTwo) {
		Assert.assertEquals(textOne, textTwo);
	}

	protected void implicitWait(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}

}
