package scenarios;

import org.testng.annotations.Test;

import screens.EbayHome;
import screens.LinkAccount;
import screens.SignIn;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class AppiumTest extends AndroidDriverSetup{
  @Test
  public void signIn() throws InterruptedException {
	 new EbayHome(driver).navigateSignIn();
	 Thread.sleep(1000);
	 new SignIn(driver).loginIn();
	 new LinkAccount(driver).denyGoogleLinkRequest();
	 Thread.sleep(1000);
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
