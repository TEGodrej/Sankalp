package io.GAVL.Sankalp;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Sankalp_GenericUtility.BaseClass_Sankalp;
import Sankalp_GenericUtility.ListnerUtility;
import io.appium.java_client.AppiumBy;

@Listeners(ListnerUtility.class)
public class verifyDashBoardElement extends BaseClass_Sankalp{

	@Test
	public void verifyDashBoardElementWithAccumulationPoint() {
		dutil.implicitWait(10);
		WebElement pieChart=driver.findElement(AppiumBy.xpath("//android.widget.Image[@resource-id=\"pieChartdiv\"]"));
		if(pieChart.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Chart did nit displayed: Case Fails");
		}
	}
	
	@Test
	public void verifyDashBoardElementWithProductWisePoint() {
		dutil.implicitWait(10);
		dbp.getProductBtn().click();
		WebElement barchart=driver.findElement(AppiumBy.xpath("//android.widget.Image[@resource-id=\"Barchartdiv\"]"));
		if(barchart.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(true, "Chart did not displayed: Case Fails");
		}
	}
}
