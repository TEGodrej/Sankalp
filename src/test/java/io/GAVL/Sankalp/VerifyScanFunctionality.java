package io.GAVL.Sankalp;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Sankalp_GenericUtility.BaseClass_Sankalp;
import Sankalp_GenericUtility.ListnerUtility;
import io.appium.java_client.AppiumBy;

@Listeners(ListnerUtility.class)
public class VerifyScanFunctionality extends BaseClass_Sankalp{
	
	@Test
	public void verifyUserAbleToScanFromLiquidation() {
		dutil.implicitWait(10);
		dbp.getScanBtn().click();
		sp.getLiquidationbtn().click();
		WebElement proceedbtn=lp.getproceedBtn();
		dutil.explicitWait(10, proceedbtn);
		proceedbtn.click();
		WebElement valid=driver.findElement(AppiumBy.xpath("(//android.view.View[@text=\"Valid 1\"])[1]"));
		if(valid.isDisplayed()) {
			ssp.getsubmitBtn().click();
		}else if(ssp.getInvalidBtn().isDisplayed()) {
			ssp.getBackBtn().click();
		}else {
			dbp.getDashBoardBtn().click();
		}
	}

	@Test
	public void verifyUserAbleToScanFromLiquidationInvalidCode() {
		dutil.implicitWait(10);
		dbp.getScanBtn().click();
		sp.getLiquidationbtn().click();
		WebElement proceedbtn=lp.getproceedBtn();
		dutil.explicitWait(10, proceedbtn);
		proceedbtn.click();
		WebElement Invalid=driver.findElement(AppiumBy.xpath("(//android.view.View[@text=\"Invalid 1\"])[1]"));
		if(Invalid.isDisplayed()) {
			ssp.getBackBtn().click();
		}else {
			dbp.getDashBoardBtn().click();
		}
	}
	
}
