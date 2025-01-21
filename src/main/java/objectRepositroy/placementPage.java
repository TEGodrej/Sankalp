package objectRepositroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class placementPage {
	
	AndroidDriver driver;
	public placementPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@text=\" Keyboard\"]")
	private WebElement keyboardBTn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Flash light button\"]")
	private WebElement flashLightBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Change camera zoom\"]")
	private WebElement zoomBtn;
	
	@FindBy(xpath = "//android.widget.EditText")
	private WebElement Textfld;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Add\"]")
	private WebElement addBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\" Camera\"]")
	private WebElement cameraBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Proceed\"]")
	private WebElement proceedBtn;
	
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

	public WebElement getKeyboardBTn() {
		return keyboardBTn;
	}

	public WebElement getFlashLightBtn() {
		return flashLightBtn;
	}

	public WebElement getZoomBtn() {
		return zoomBtn;
	}

	public WebElement getTextfld() {
		return Textfld;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getCameraBtn() {
		return cameraBtn;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}
	
	
	
}
