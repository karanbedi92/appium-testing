package scenarios;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import support_libraries.Setting;
@SuppressWarnings("rawtypes")
public class AndroidDriverSetup {
	
	protected AppiumDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
    	Setting appiumProperties=new Setting();
    	System.out.println();
    	File app=null;
    	
    	if(Boolean.parseBoolean(appiumProperties.getInstance().getProperty("InstallApplicationInDevice"))) {
    		//fetching the application (.apk) path if InstallApplicationInDevice property is true
    		System.out.println(Boolean.parseBoolean(appiumProperties.getInstance().getProperty("InstallApplicationInDevice")));
    		File classpathRoot = new File(System.getProperty("user.dir"));
    		File appDir = new File(classpathRoot, "/apps/");
    		app = new File(appDir, appiumProperties.getInstance().getProperty("Android_APK_Name"));
    	}
		
		//desired capabilities initialization for test execution
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", appiumProperties.getInstance().getProperty("Device_Name"));
		capabilities.setCapability("platformVersion", appiumProperties.getInstance().getProperty("Platform_Version"));
		capabilities.setCapability("platformName", appiumProperties.getInstance().getProperty("platformVersion"));
		
		if(Boolean.parseBoolean(appiumProperties.getInstance().getProperty("InstallApplicationInDevice"))) {
		capabilities.setCapability("app", app.getAbsolutePath());
		}
		
		capabilities.setCapability("appPackage", appiumProperties.getInstance().getProperty("Application_Package_Name"));
		capabilities.setCapability("appActivity", appiumProperties.getInstance().getProperty("Application_MainActivity_Name"));
		
		//appium server url
		driver = new AndroidDriver(new URL(appiumProperties.getInstance().getProperty("AppiumURL")), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    }

}
