package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class myCartScreen {
	
	AndroidDriver driver;
	public myCartScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//android.widget.TextView[@text='']")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='']")
	private WebElement editButton;
	
	public void clickOnDeleteButton() {
		try {
			deleteButton.click();
			System.out.println("Clicked on deleteButton");
		} catch (Exception e) {
			System.out.println("Not able to click on deleteButton "+e);
		}
	}
	
	public void clickOnEditButton() {
		try {
			editButton.click();
			System.out.println("Clicked on Edit Button");
		} catch (Exception e) {
			System.out.println("Not able to click on editButton "+e);
		}
	}
}
