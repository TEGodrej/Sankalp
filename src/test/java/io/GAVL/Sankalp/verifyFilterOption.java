package io.GAVL.Sankalp;

import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebElement;

import Sankalp_GenericUtility.BaseClass_Sankalp;

public class verifyFilterOption extends BaseClass_Sankalp{

	@Test
	public void verifyPlacementfilteroption() {
		dutil.implicitWait(10);
		WebElement  menubtn = dbp.getSideMenuBtn();
		menubtn.click();
		dutil.explicitWait(5, menubtn);
		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x",356,"y",771));
		shp.getfilterBtn().click();
		driver.executeScript("mobile: clickGesture", ImmutableMap.of("x",387,"y",878));
		driver.executeScript("mobile: clickGesture", ImmutableMap.of("x",200,"y",1336));
		driver.executeScript("mobile: clickGesture", ImmutableMap.of("x",501,"y",1450));
		if(shp.getPlacement().isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false,"Placement did not displayed: Case Fails");
		}
	}
	
	@Test
	public void verifyLiquidationfilteroption() throws InterruptedException {
		dutil.implicitWait(10);
		WebElement  menubtn = dbp.getSideMenuBtn();
		menubtn.click();
		dutil.explicitWait(5, menubtn);
		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x",356,"y",771));
		shp.getfilterBtn().click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.executeScript("mobile: clickGesture", ImmutableMap.of("x",433,"y",1336));
		driver.executeScript("mobile: clickGesture", ImmutableMap.of("x",513,"y",1450));

		if(shp.getLiquidation().isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false,"Liquidation did not displayed: Case Fails");
		}
	}
}
