package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class AccountDetailScreen {

	AndroidDriver driver;
	public AccountDetailScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text='Account Details']")
	private WebElement AccountDetailTitle;
	
	public void clickOnAccountDetailTitle() {
		try {
			if (AccountDetailTitle.isDisplayed()) {
				System.out.println("you are on to accounts detail page");
			}
		} catch (Exception e) {
			System.out.println("Not able to navigate to AccountDetail screen"+e);
		}
	}
}
