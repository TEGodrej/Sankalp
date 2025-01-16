package objectRepositroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ConfirmationPage {
	AndroidDriver driver;
	public ConfirmationPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@text=\"YES\"]")
	private WebElement yesBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"NO\"]")
	private WebElement noBtn;

	public WebElement getYesBtn() {
		return yesBtn;
	}

	public WebElement getNoBtn() {
		return noBtn;
	}
	
	
}
