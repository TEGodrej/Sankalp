package objectRepositroy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ponitPage {

	AndroidDriver driver;
	public ponitPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Accumulation\"]")
	private WebElement accumulationTab;
	
	@FindBy(xpath = "(//android.widget.Button[@text=\"Productwise\"])[1]")
	private WebElement productwisePtTab;
	
	@FindBy(xpath = "//android.widget.Button[@text=\"Distributorwise\"]")
	private WebElement distributorTab;
	
	@FindBy(xpath = "(//android.widget.Button[@text=\"Productwise\"])[2]")
	private WebElement productwiseTab;

	public WebElement getAccumulationTab() {
		return accumulationTab;
	}

	public WebElement getProductwisePtTab() {
		return productwisePtTab;
	}

	public WebElement getDistributorTab() {
		return distributorTab;
	}

	public WebElement getProductwiseTab() {
		return productwiseTab;
	}
	
	
}
