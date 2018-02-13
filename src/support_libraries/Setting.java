package support_libraries;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Setting {
	
	static Properties properties = new Properties();

	public Setting(){

	try {
		InputStream inputStream = Setting.class.getClassLoader().getResourceAsStream("appium-testing.properties");
		System.out.println(inputStream.toString());
		properties.load(inputStream);
	} catch (FileNotFoundException e) {
		System.out.println("FileNotFoundException while loading the appium-testing properties file");
	} catch (IOException e) {
		System.out.println("IOException while loading the appium-testing properties file");
	}
	}
	public static Properties getInstance() {
		return properties;
	}
}
