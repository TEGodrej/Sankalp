package io.GAVL.Sankalp;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class install {

	@Test
	public void Install() throws MalformedURLException {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("automationName", "Uiautomator2");
		dc.setCapability("deviceName", "Redmi A2");
		dc.setCapability("UDID", "WKAQCYCQKROVDE4L");
		
		dc.setCapability("appPackage", "com.godrej.agri.chpartnersdemo");
		dc.setCapability("appActivity", "com.godrej.agri.chpartnersdemo.MainActivity");
		
		AndroidDriver driver;
		URL url= URI.create("http://localhost:4723").toURL();
		driver=new AndroidDriver(url, dc);
		
		driver.installApp("C:\\Users\\testing.engineer\\Downloads\\Demo Sankalp-1.1.6.apk");
	}
}
