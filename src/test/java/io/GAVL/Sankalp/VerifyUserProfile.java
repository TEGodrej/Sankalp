package io.GAVL.Sankalp;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Sankalp.GenericUtility.BaseClass_Sankalp;
import io.appium.java_client.AppiumBy;

public class VerifyUserProfile extends BaseClass_Sankalp {

	@Test
	public void verifyUserDetails() {
		dutil.implicitWait(10);
		dbp.getSideMenuBtn().click();
		driver.executeScript("mobile: clickGesture", ImmutableMap.of("x", 310, "y", 528));
//        WebElement profileTitle=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Profile\"]"));
//        dutil.explicitWait(10, profileTitle);

	}
}
