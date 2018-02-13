package scenarios;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import screens.EbayHome;
import screens.LinkAccount;
import screens.SearchPage;
import screens.SelectProduct;
import screens.SignIn;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class AppiumTest extends AndroidDriverSetup{
  @Test
  public void signIn() {
	  try {
	 new EbayHome(driver).navigateSignIn();
	 Thread.sleep(1000);
	 new SignIn(driver).loginIn();
	 new LinkAccount(driver).denyGoogleLinkRequest();
	 Thread.sleep(1000);
	 new SearchPage(driver).searchProduct();
	 Thread.sleep(10000);
	 new SelectProduct(driver).selectProduct();
//	 (new TouchAction(driver)).press(521,1223).moveTo(4,-269).release().perform();
	 Thread.sleep(10000);
	  }
	  catch (Exception e) {
		// TODO: handle exception
		  System.out.println(e);
	}
	 
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  //initializing driver for android testing
	  prepareAndroidForAppium();
  }

  @AfterTest
  public void afterTest() {
	  //quiting the driver after everything is done
	  driver.quit();
  }

}
