package scenarios;

import org.testng.annotations.Test;

import screens.EbayHome;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class AppiumTest extends AndroidDriverSetup{
  @Test
  public void signIn() throws InterruptedException {
	 new EbayHome(driver).navigateSignIn();
	 Thread.sleep(1000);
	 driver.findElement(By.id("com.ebay.mobile:id/edit_text_username")).sendKeys("karanbedi792@gmail.com");
	 driver.findElement(By.id("com.ebay.mobile:id/edit_text_password")).sendKeys("Jan@2018");
	 driver.findElement(By.id("com.ebay.mobile:id/button_sign_in")).click();
	 driver.findElement(By.id("com.ebay.mobile:id/button_google_deny")).click();
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
