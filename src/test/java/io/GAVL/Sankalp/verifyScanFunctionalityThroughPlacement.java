package io.GAVL.Sankalp;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Sankalp_GenericUtility.BaseClass_Sankalp;
import Sankalp_GenericUtility.ListnerUtility;
import io.appium.java_client.AppiumBy;

@Listeners(ListnerUtility.class)
public class verifyScanFunctionalityThroughPlacement extends BaseClass_Sankalp{

	/*
	 *This is to verify should be able to scan through  Placement 
	 */
	@Test
	public void verifyUserIsAbleToScanThroughPlacement() {
		dutil.implicitWait(10);
		dbp.getScanBtn().click();
		sp.getPlacementBtn().click();
		WebElement proceedBtn=plp.getProceedBtn();
		dutil.explicitWait(10, proceedBtn);
		proceedBtn.click();
		WebElement invalidCode=driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Invalid - Inner code scanned 1 0 Invalid - Inner code scanned 1 \"]"));
		if(invalidCode.isDisplayed()) {
			assertTrue(true);
		}else {
			ssp.getBackBtn();
		}
		ssp.getBackBtn().click();
	}
	
	/*
	 * This is to verify user should be able to enter qrcode number and make entry 
	 */
	@Test
	public void verifyUserIsAbleToEnterQRcodeManually() {
		dutil.implicitWait(10);
		dbp.getScanBtn().click();
		sp.getPlacementBtn().click();
		plp.getKeyboardBTn().click();
		plp.getTextfld().sendKeys("A051B758ABA7J2429600248");
		plp.getAddBtn().click();
		WebElement proceedBtn=plp.getProceedBtn();
		dutil.explicitWait(10, proceedBtn);
		proceedBtn.click();
		WebElement validTab=driver.findElement(AppiumBy.xpath("(//android.view.View[@text=\"Valid 1\"])[1]"));
		if(validTab.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false,"QR Code is invalid: Case Fails");
		}
		WebElement submitBtn=ssp.getsubmitBtn();
		dutil.explicitWait(10, submitBtn);
		submitBtn.click();
	}
}
