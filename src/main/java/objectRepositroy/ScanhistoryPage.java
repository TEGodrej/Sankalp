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
	
	public WebElement getfilterBtn() {
		return filterBtn;
	}
}
