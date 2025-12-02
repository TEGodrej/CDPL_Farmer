package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProfileScreen {
	
	AndroidDriver driver;
	public ProfileScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Language']")
	private WebElement languageOption;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Account Details']")
	private WebElement accountDetailOption;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Logout']")
	private WebElement logoutOption;
	
	public void clickOnLanguageOption() {
		try {
			languageOption.click();
			System.out.println("Clicked on language Option");
		} catch (Exception e) {
			System.out.println("Not able to click on languageOption "+e);
		}
	}
	
	public void clickOnAccountDetailOption() {
		try {
			accountDetailOption.click();
			System.out.println("Click on accountDetail Option");
		} catch (Exception e) {
			System.out.println("Not able to click on accountDetailOption "+e);
		}
	}
	
	public void clickOnLogoutOption() {
		try {
			logoutOption.click();
			System.out.println("Clicked on logoutOption");
		} catch (Exception e) {
			System.out.println("Not able to click on logoutOption "+e);
		}
	}
	
	
}
