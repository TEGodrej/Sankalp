package objectRepositroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class RegistrationPage {
	
	AndroidDriver driver;
	public RegistrationPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input1\"]")
	private WebElement input1;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input2\"]")
	private WebElement input2;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input3\"]")
	private WebElement input3;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input4\"]")
	private WebElement input4;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input5\"]")
	private WebElement input5;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input6\"]")
	private WebElement input6;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input7\"]")
	private WebElement input7;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input8\"]")
	private WebElement input8;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input9\"]")
	private WebElement input9;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"input10\"]")
	private WebElement input10;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Send OTP\"]")
	private WebElement otpBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"sign up.\"]")
	private WebElement signupBtn;

	public WebElement getInput1() {
		return input1;
	}

	public WebElement getInput2() {
		return input2;
	}

	public WebElement getInput3() {
		return input3;
	}

	public WebElement getInput4() {
		return input4;
	}

	public WebElement getInput5() {
		return input5;
	}

	public WebElement getInput6() {
		return input6;
	}

	public WebElement getInput7() {
		return input7;
	}

	public WebElement getInput8() {
		return input8;
	}

	public WebElement getInput9() {
		return input9;
	}

	public WebElement getInput10() {
		return input10;
	}

	public WebElement getOtpBtn() {
		return otpBtn;
	}

	public WebElement getSignupBtn() {
		return signupBtn;
	}
	
	
}
