package objectRepositroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class QnAPage {
	AndroidDriver driver;
	public QnAPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//android.view.View[@text=\"Open\"])[1]")
	private WebElement openTab;
	
	@FindBy(xpath = "//android.view.View[@text=\"Closed\"]")
	private WebElement CloseTab;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"\"]")
	private WebElement plusBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Query\"]")
	private WebElement queryBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Complaint\"]")
	private WebElement complaintBtn;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"idTextArea\"]")
	private WebElement msgTxtFld;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"\"]")
	private WebElement attachmnetBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"\"]")
	private WebElement cameraBtn;

	public WebElement getAttachmnetBtn() {
		return attachmnetBtn;
	}

	public WebElement getCameraBtn() {
		return cameraBtn;
	}

	public WebElement getMsgTxtFld() {
		return msgTxtFld;
	}

	public WebElement getQueryBtn() {
		return queryBtn;
	}

	public WebElement getComplaintBtn() {
		return complaintBtn;
	}

	public WebElement getOpenTab() {
		return openTab;
	}

	public WebElement getCloseTab() {
		return CloseTab;
	}

	public WebElement getPlusBtn() {
		return plusBtn;
	}
	
	
}
