package io.GAVL.Sankalp;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Sankalp_GenericUtility.BaseClass_Sankalp;
import Sankalp_GenericUtility.ListnerUtility;
import io.appium.java_client.AppiumBy;

@Listeners(ListnerUtility.class)
public class VerifyUserProfile extends BaseClass_Sankalp {

	@Test
	public void verifyUserDetails() throws InterruptedException {
		String ExpectedcustomerName="Testing kirana store";
		dutil.implicitWait(10);
		WebElement menuBtn=dbp.getSideMenuBtn();
		menuBtn.click();
		dutil.explicitWait(5, menuBtn);
		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x", 415, "y", 531));
		Thread.sleep(10);
        WebElement CustomerName=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Testing kirana store']"));
        String ActualCustomerName=CustomerName.getText();
        if(ActualCustomerName.equals(ExpectedcustomerName)) {
        	assertTrue(true);
        }else {
        	assertTrue(false, "Name miss match: Case Fails");
        }
	}
}
