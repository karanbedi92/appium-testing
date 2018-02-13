package scenarios;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import screens.EbayHome;
import screens.LinkAccount;
import screens.SearchPage;
import screens.SignIn;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

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
