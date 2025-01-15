package Sankalp.GenericUtility;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import objectRepositroy.DashBoardPage;
import objectRepositroy.ProfilePage;

public class BaseClass_Sankalp {
	public static AndroidDriver driver;
	public static DashBoardPage dbp;
	public static ProfilePage pp;
	public static DriverUtility dutil;
	

	@BeforeClass
	public void StartApp() throws MalformedURLException {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("deviceName", "Redmi A2");
		dc.setCapability("UDID", "WKAQCYCQKROVDE4L");
		
		URL url=URI.create("http://localhost:4723").toURL();
		 driver=new AndroidDriver(url, dc);
		
		driver.activateApp("com.godrej.agri.chpartnersdemo");
		
		dbp=new DashBoardPage(driver);
		pp=new ProfilePage(driver);
		dutil=new DriverUtility(driver);
	}
}
