package objectRepositroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class DashBoardPage {
AndroidDriver driver;
	public DashBoardPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//android.widget.Button[@text=\" Dashboard\"]")
	private WebElement dashBoardBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"\"]")
	private WebElement scanBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"\"]")
	private WebElement pointBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"\"]")
	private WebElement sideMenuBtn;
	
	@FindBy(xpath = "//android.view.View[@resource-id=\"objMain\"]/android.view.View/android.view.View[1]")
	private WebElement DashBoardTitle;

	public WebElement getDashBoardBtn() {
		return dashBoardBtn;
	}

	public WebElement getScanBtn() {
		return scanBtn;
	}

	public WebElement getPointBtn() {
		return pointBtn;
	}

	public WebElement getSideMenuBtn() {
		return sideMenuBtn;
	}

	public WebElement getDashBoardTitle() {
		return DashBoardTitle;
	}
	
	
}
