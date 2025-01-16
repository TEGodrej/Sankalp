package objectRepositroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class liquidationPage {
	
	AndroidDriver driver;
	public liquidationPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@text=\" Keyboard\"]")
	private WebElement keyboardBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Flash light button\"]")
	private WebElement FlashlightBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Change camera zoom\"]")
	private WebElement zoomBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Proceed\"]")
	private WebElement proceedBtn;
	
	@FindBy(xpath = "//android.widget.EditText")
	private WebElement codeTxtFld;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Add\"]")
	private WebElement getAddBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\" Camera\"]")
	private WebElement cameraBtn;
	
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}

	public WebElement getCodeTxtFld() {
		return codeTxtFld;
	}

	public WebElement getGetAddBtn() {
		return getAddBtn;
	}

	public WebElement getCameraBtn() {
		return cameraBtn;
	}

	public WebElement getproceedBtn() {
		return proceedBtn;
	}

	public WebElement getKeyboardBtn() {
		return keyboardBtn;
	}

	public WebElement getFlashlightBtn() {
		return FlashlightBtn;
	}

	public WebElement getZoomBtn() {
		return zoomBtn;
	}
}
