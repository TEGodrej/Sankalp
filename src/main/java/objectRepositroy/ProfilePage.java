package objectRepositroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProfilePage {

	AndroidDriver driver;
	public ProfilePage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input_2\"]")
	private WebElement customerNameTxtfld;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input_4\"]")
	private WebElement ownerNameTxtFld;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input_3\"]")
	private WebElement MobileNumbertxtFld;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input_5\"]")
	private WebElement GstnumberTxtFld;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input_6\"]")
	private WebElement pesticideTxtFld;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Click here to get your exact location details\"]")
	private WebElement clickHereBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Update profile\"]")
	private WebElement updateProfileBtn;

	public WebElement getCustomerNameTxtfld() {
		return customerNameTxtfld;
	}

	public WebElement getOwnerNameTxtFld() {
		return ownerNameTxtFld;
	}

	public WebElement getMobileNumbertxtFld() {
		return MobileNumbertxtFld;
	}

	public WebElement getGstnumberTxtFld() {
		return GstnumberTxtFld;
	}

	public WebElement getPesticideTxtFld() {
		return pesticideTxtFld;
	}

	public WebElement getClickHereBtn() {
		return clickHereBtn;
	}

	public WebElement getUpdateProfileBtn() {
		return updateProfileBtn;
	}
	
	
}
