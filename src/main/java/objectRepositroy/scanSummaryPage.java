package objectRepositroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class scanSummaryPage {
	
	AndroidDriver driver;
	public scanSummaryPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.view.View[@text=\"Valid\"]")
	private WebElement validBtn;
	
	@FindBy(xpath = "(//android.view.View[@text=\"Invalid 1\"])[1]")
	private WebElement invalidBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Back\"]")
	private WebElement backBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Submit\"]")
	private WebElement submitBtn;
	
	public WebElement getsubmitBtn() {
		return submitBtn;
	}

	public WebElement getValidBtn() {
		return validBtn;
	}

	public WebElement getInvalidBtn() {
		return invalidBtn;
	}

	public WebElement getBackBtn() {
		return backBtn;
	}
	
	
}
