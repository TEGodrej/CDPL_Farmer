package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LanguageScreen {
	
	AndroidDriver driver;
	public LanguageScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.View")
	private WebElement marathiOption;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.View")
	private WebElement hindiOption;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.View")
	private WebElement teluguOption;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.view.ViewGroup/android.view.View")
	private WebElement englishOption;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.View")
	private WebElement tamilOption;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.View")
	private WebElement kanadaOption;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup/android.view.View")
	private WebElement malyalamOption;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.view.ViewGroup/android.view.View")
	private WebElement gujratiOption;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.view.ViewGroup/android.view.View")
	private WebElement banglaOption;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup/android.view.ViewGroup/android.view.View")
	private WebElement punjabiOption;
	
	@FindBy(xpath = "//android.widget.TextView[@text=\"Let's Begin\"]")
	private WebElement startText;
	
	public WebElement getStartText() {
		return startText;
	}
	
	
	public void clickOnMarathiOption() {
		try {
			marathiOption.click();
			System.out.println("Selected Marathi language Option");
		} catch (Exception e) {
			System.out.println("Not able to select marathi language Option "+e);
		}
	}
	
	public void clickOnHindiOption() {
		try {
			hindiOption.click();
			System.out.println("Selected hindi language Option");
		} catch (Exception e) {
			System.out.println("Not able to select hindi language Option "+e);
		}
	}
	
	public void clickOnTeluguOption() {
		try {
			teluguOption.click();
			System.out.println("Selected telugu language Option");
		} catch (Exception e) {
			System.out.println("Not able to select telugu language Option "+e);
		}
	}
	
	public void clickOnEnglishOption() {
		try {
			englishOption.click();
			System.out.println("Selected english language Option");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void clickOnTamilOption() {
		try {
			tamilOption.click();
			System.out.println("Selected tamil language Option");
		} catch (Exception e) {
			System.out.println("Not able to click on tamil language Option "+e);
		}
	}
	
	public void clickOnKanadaOption() {
		try {
			kanadaOption.click();
			System.out.println("Selected kanada language Option");
		} catch (Exception e) {
			System.out.println("not able to select kanada language Option "+e);
		}
	}
	
	public void clickOnMalyalamOption() {
		try {
			malyalamOption.click();
			System.out.println("Selected malyalam language Option");
		} catch (Exception e) {
			System.out.println("Not able to select malyalam language Option "+e);
		}
	}
	
	public void clickOnGujratiOption() {
		try {
			gujratiOption.click();
			System.out.println("selected gujrati language Option");
		} catch (Exception e) {
			System.out.println("Not able to select gujrati language Option "+e);
		}
	}
	
	public void clickOnBanglaOption() {
		try {
			banglaOption.click();
			System.out.println("selected bangla language Option");
		} catch (Exception e) {
			System.out.println("Not able to select bangla language Option "+e);
		}
	}
	
	public void clickOnPunjabiOption() {
		try {
			punjabiOption.click();
			System.out.println("Selected punjabi Option");
		} catch (Exception e) {
			System.out.println("Not able to select punjabi language Option "+e);
		}
	}
}
