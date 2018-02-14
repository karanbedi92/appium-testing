package support_libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Setting {
	static Properties properties = new Properties();
	public Setting(){
		try {
			String dir = System.getProperty("user.dir");
	        InputStream inputStream = new FileInputStream(dir + "/appium-testing.properties");
	        properties.load(inputStream);
	        inputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException while loading the appium-testing properties file");
		} catch (IOException e) {
			System.out.println("IOException while loading the appium-testing properties file");
		}
	}
	public Properties getInstance() {
		return properties;
	}
}
