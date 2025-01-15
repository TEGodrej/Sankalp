package objectRepositroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class scanPage {
	
	AndroidDriver driver;
	public scanPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@text=\"Placement\"]")
	private WebElement placementBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Liquidation\"]")
	private WebElement liquidationbtn;

	public WebElement getPlacementBtn() {
		return placementBtn;
	}

	public WebElement getLiquidationbtn() {
		return liquidationbtn;
	}
}
