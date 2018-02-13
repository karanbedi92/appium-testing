package screens;

import org.openqa.selenium.WebDriver;

import support_libraries.DriverActions;

public class SelectProduct extends DriverActions {
    public SelectProduct(WebDriver driver) {
    	super(driver);
    }
    
    public SelectProduct selectProduct() throws InterruptedException {
//    	(new TouchAction(driver)).press(521,1223).moveTo(4,-269).release().perform();
//    	scrollPageUp(521,1223,4,-269,1);
   	return new SelectProduct(driver);
    }

}
