package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;

public class SearchPage {
	
	protected WebDriver driver;
    By searchBox = By.id("com.ebay.mobile:id/search_box");
    By searchBoxTxt = By.id("com.ebay.mobile:id/search_src_text");
    
    public SearchPage(WebDriver driver) {
    	this.driver = driver;
    }
    public SearchPage searchProduct() throws InterruptedException {
    	MobileElement el4 = (MobileElement) driver.findElement(searchBox);
   	 el4.click();
   	 MobileElement el5 = (MobileElement) driver.findElement(searchBoxTxt);
   	 el5.sendKeys("one plus 5t cover");
   	Thread.sleep(5000);
   	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView")).click();
   	return new SearchPage(driver);
    }

}
