package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ShopScreen {
	
	AndroidDriver driver;
	public ShopScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=', ADD']")
	private WebElement addButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='']")
	private WebElement crossButton;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Add to Cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='']")
	private WebElement editOption;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='View Cart, ']")
	private WebElement viewCartOption;
	
	
	public void clickOnaddButton() {
		try {
			addButton.click();
			System.out.println("Clicked on Add Button ");
		} catch (Exception e) {
			System.out.println("Not able to click on Add Button "+e);
		}
	}
	
	public void clickOnCrossButton() {
		try {
			crossButton.click();
			System.out.println("Clicked on Cross Button");
		} catch (Exception e) {
			System.out.println("Not able to click on Cross Button "+e);
		}
	}
	
	public void clickOnAddTocartButton() {
		try {
			addToCartButton.click();
			System.out.println("Clicked on addToCart Button");
		} catch (Exception e) {
			System.out.println("Not able to click on addTocart Button "+e);
		}
	}
	
	public void clickOneditOption() {
		try {
			editOption.click();
			System.out.println("Clicked on editOption");
		} catch (Exception e) {
			System.out.println("Not able to click on editOption "+e);
		}
	}
	
	public void clickOnViewCartOption() {
		try {
			viewCartOption.click();
			System.out.println("Clicked on ViewCart Option");
		} catch (Exception e) {
			System.out.println("Not able to click on ViewCart Option "+e);
		}
	}
}
