package io.GAVL.Sankalp;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import Sankalp_GenericUtility.BaseClass_Sankalp;
import io.appium.java_client.AppiumBy;

public class verifyQandAFuntionality extends BaseClass_Sankalp{

	@Test
	public void verifyUserableToCreateQueryWithTradeOption() {
		dutil.implicitWait(10);
		WebElement menuBtn=dbp.getSideMenuBtn();
		menuBtn.click();
		dutil.explicitWait(5, menuBtn);
		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x", 307, "y", 888));
		qp.getPlusBtn().click();
		qp.getQueryBtn().click();
		WebElement trade=driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Trade\"]"));
		trade.click();
		WebElement ticketId=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Ticket created - #100012\"]"));
		if(ticketId.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Ticket id is not generated: Case fails");
		}
	}
	
	@Test
	public void verifyUserableToCreateQueryWithProductEficacyandDosageOption() {
		dutil.implicitWait(10);
		WebElement menuBtn=dbp.getSideMenuBtn();
		menuBtn.click();
		dutil.explicitWait(5, menuBtn);
		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x", 307, "y", 888));
		qp.getPlusBtn().click();
		qp.getQueryBtn().click();
		WebElement trade=driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Product Eficacy/Dosage\"]"));
		trade.click();
		WebElement ticketId=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Ticket created - #100015\"]"));
		if(ticketId.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Ticket id is not generated: Case fails");
		}
	}
	@Test
	public void verifyUserableToCreateQueryWithAppIssueOption() {
		dutil.implicitWait(10);
		WebElement menuBtn=dbp.getSideMenuBtn();
		menuBtn.click();
		dutil.explicitWait(5, menuBtn);
		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x", 307, "y", 888));
		qp.getPlusBtn().click();
		qp.getQueryBtn().click();
		WebElement trade=driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"App issue\"]"));
		trade.click();
		WebElement ticketId=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Ticket created - #100016\"]"));
		if(ticketId.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Ticket id is not generated: Case fails");
		}
	}
	
	@Test
	public void verifyUserAbleToCreateComplaintWithTraderOption() {
		dutil.implicitWait(10);
		WebElement menuBtn=dbp.getSideMenuBtn();
		menuBtn.click();
		dutil.explicitWait(5, menuBtn);
		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x", 307, "y", 888));
		qp.getPlusBtn().click();
		qp.getComplaintBtn().click();
		WebElement trade=driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Trade\"]"));
		trade.click();
		WebElement ticketId=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Ticket created - #100017\"]"));
		if(ticketId.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Ticket id is not generated: Case fails");
		}
	}
	
	@Test
	public void verifyUserAbleToCreateComplaintWithProductEficacyAndDosageOption() {
		dutil.implicitWait(10);
		WebElement menuBtn=dbp.getSideMenuBtn();
		menuBtn.click();
		dutil.explicitWait(5, menuBtn);
		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x", 307, "y", 888));
		qp.getPlusBtn().click();
		qp.getComplaintBtn().click();
		WebElement trade=driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Product Eficacy/Dosage\"]"));
		trade.click();
		WebElement ticketId=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Ticket created - #100018\"]"));
		if(ticketId.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Ticket id is not generated: Case fails");
		}
	}
	
	@Test
	public void verifyUserAbleToCreateComplaintWithAppIssueOption() {
		dutil.implicitWait(10);
		WebElement menuBtn=dbp.getSideMenuBtn();
		menuBtn.click();
		dutil.explicitWait(5, menuBtn);
		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x", 307, "y", 888));
		qp.getPlusBtn().click();
		qp.getComplaintBtn().click();
		WebElement trade=driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"App issue\"]"));
		trade.click();
		WebElement ticketId=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Ticket created - #100020\"]"));
		if(ticketId.isDisplayed()) {
			assertTrue(true);
		}else {
			assertTrue(false, "Ticket id is not generated: Case fails");
		}
	}
	
}
