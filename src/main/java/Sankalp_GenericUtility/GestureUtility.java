package Sankalp_GenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class GestureUtility {

	static AndroidDriver driver;
	
	public void longclick(WebElement element) {
			((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()));
		}
	public void DoubeClick(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId()));
	}
	
	public void click(WebElement element) {
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId()));
	}
	
	public void drag(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId(),
		    "endX", 100,
		    "endY", 100 ));
	}
	
	public void Fling(WebElement element, String dir, int speed) {
		@SuppressWarnings("unused")
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId(),
		    "direction", dir,
		    "speed", speed ));
	}
	
	public void pinchOpen(WebElement element, double percentage) {
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId(),
		    "percent", percentage
		));
	}
	
	public void Swipe(int left, int top, int width, int height, String dir, double percentage) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		    "left", left, "top", top, "width", width, "height", height,
		    "direction", dir,
		    "percent", percentage ));
	}
	
	public void scroll(int left, int top, int width, int height, String dir, double percentage) {
		@SuppressWarnings("unused")
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", left, "top", top, "width", width, "height", height,
		    "direction", dir, "percent", percentage ));
	}
}
