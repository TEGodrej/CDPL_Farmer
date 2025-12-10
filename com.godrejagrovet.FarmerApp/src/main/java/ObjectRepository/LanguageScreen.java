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

	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='मराठी']/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement marathiOption;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='हिंदी']/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement hindiOption;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='తెలుగు']/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement teluguOption;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='English']/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement englishOption;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='ಕನ್ನಡ']/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement tamilOption;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='தமிழ்']/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement kanadaOption;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='മലയാളം']/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement malyalamOption;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='ગુજરાતી']/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement gujratiOption;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='বাংলা']/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement banglaOption;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='ਪੰਜਾਬੀ']/android.view.ViewGroup/android.view.ViewGroup[2]")
	private WebElement punjabiOption;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Let's Begin']")
	private WebElement startText;
	
	public WebElement getStartText() {
		return startText;
	}
	
	public WebElement getEnglishOption() {
		return englishOption;
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
