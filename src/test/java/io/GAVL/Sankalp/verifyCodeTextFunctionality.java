package io.GAVL.Sankalp;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Sankalp_GenericUtility.BaseClass_Sankalp;
import Sankalp_GenericUtility.ListnerUtility;
import io.appium.java_client.AppiumBy;

@Listeners(ListnerUtility.class)
public class verifyCodeTextFunctionality extends BaseClass_Sankalp{

	@Test
	public void verifyUserCanEnterValidCodeText() throws InterruptedException {
		dutil.implicitWait(10);
		dbp.getScanBtn().click();
		sp.getLiquidationbtn().click();
		lp.getKeyboardBtn().click();
		WebElement textFld=lp.getCodeTxtFld();
		dutil.explicitWait(10, textFld);
		textFld.sendKeys("A0512AE95267J2456800194");
		lp.getGetAddBtn().click();
		lp.getproceedBtn().click();
		WebElement valid=driver.findElement(AppiumBy.xpath("(//android.view.View[@text=\"Valid 1\"])[1]"));
		if(valid.isDisplayed()) {
			ssp.getsubmitBtn().click();
		}
	}
	
	@Test
	public void verifyUserNotAbleToScanInvalidCode() {
		dutil.implicitWait(10);
		dbp.getScanBtn().click();
		sp.getLiquidationbtn().click();
		lp.getKeyboardBtn().click();
		WebElement textFld=lp.getCodeTxtFld();
		dutil.explicitWait(10, textFld);
		textFld.sendKeys("A0512AE95267J2456800194");
		lp.getGetAddBtn().click();
		lp.getproceedBtn().click();
		WebElement invalid=driver.findElement(AppiumBy.xpath("(//android.view.View[@text=\"Invalid 1\"])[1]"));
		if(invalid.isDisplayed()) {
			ssp.getBackBtn().click();
		}
	}
}
