package objectRepositroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ScanhistoryPage {
	
	AndroidDriver driver;
	public ScanhistoryPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//android.widget.Button[@text=\"\"]")
	private WebElement filterBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Placement\"]")
	private WebElement placement;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Liquidation\"]")
	private WebElement liquidation;
	
	
	
	public WebElement getPlacement() {
		return placement;
	}



	public WebElement getLiquidation() {
		return liquidation;
	}



	public WebElement getfilterBtn() {
		return filterBtn;
	}
}
