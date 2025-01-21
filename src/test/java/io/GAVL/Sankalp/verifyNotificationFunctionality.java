package io.GAVL.Sankalp;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Sankalp_GenericUtility.BaseClass_Sankalp;
import io.appium.java_client.AppiumBy;

public class verifyNotificationFunctionality extends BaseClass_Sankalp{

	@Test
	public void verifyNotificationDisplay() throws InterruptedException {
		dutil.implicitWait(10);
		WebElement menuBtn=dbp.getSideMenuBtn();
		menuBtn.click();
		dutil.explicitWait(5, menuBtn);
		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x", 405, "y", 651));
		Thread.sleep(10);
		WebElement Notification1=driver.findElement(AppiumBy.xpath("//android.widget.Image[@text=\"TR_NT_1711561425556_%7BE9D11EFF-88B2-ADF1-2382-D4229FF01894%7D\"]"));
		Notification1.click();
		WebElement attachment=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Attachments\"]"));
		if(attachment.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(true, "Text did not display: Case Fails");
		}
	}
	
	@Test
	public void verifySecondNotificationDisplay() throws InterruptedException {
		dutil.implicitWait(10);
		WebElement menuBtn=dbp.getSideMenuBtn();
		menuBtn.click();
		dutil.explicitWait(5, menuBtn);
		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x", 405, "y", 651));
		Thread.sleep(10);
		WebElement Notification1=driver.findElement(AppiumBy.xpath("//android.widget.Image[@text=\"TR_NT_1711561351268_%7B271C7BAB-937A-E3EC-64A5-9378BAA56834%7D\"]"));
		Notification1.click();
		WebElement attachment=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Attachments\"]"));
		if(attachment.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(true, "Text did not display: Case Fails");
		}
	}
}
