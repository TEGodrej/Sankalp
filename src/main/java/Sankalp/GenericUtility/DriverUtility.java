package Sankalp.GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class DriverUtility {
	AndroidDriver driver;
	
	public DriverUtility(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void implicitWait(int i) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	
	public void explicitWait(int i , WebElement element) {
		WebDriverWait wait;
		wait=new WebDriverWait(driver, Duration.ofSeconds(i));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
}
