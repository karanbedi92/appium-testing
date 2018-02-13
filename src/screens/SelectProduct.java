package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import support_libraries.DriverActions;

public class SelectProduct extends DriverActions {
    public SelectProduct(AppiumDriver driver) {
    	super(driver);
    }
    
    public SelectProduct selectProduct() throws InterruptedException {
    	TouchAction touchAction = new TouchAction(driver);
    	touchAction.press(521,1223).moveTo(4,-269).release().perform();
   	return new SelectProduct(driver);
    }

}
