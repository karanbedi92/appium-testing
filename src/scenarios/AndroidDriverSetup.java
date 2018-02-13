package scenarios;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
@SuppressWarnings("rawtypes")
public class AndroidDriverSetup {
	
	protected AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
    	//fetching the application (.apk) path
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/apps/");
		File app = new File(appDir, "com.ebay.mobile_v5.17.0.18-117_Android-5.0.apk");
		
		//desired capabilities initialization for test execution
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Pixel");
		capabilities.setCapability("platformVersion", "7.1.2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.ebay.mobile");
		capabilities.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
		
		//appium server url
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    }

}
