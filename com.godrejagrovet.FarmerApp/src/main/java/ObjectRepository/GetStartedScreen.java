package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class GetStartedScreen {

	AndroidDriver driver;
	public GetStartedScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.EditText[@text='Enter Your Mobile Number']")
	private WebElement mobileNumberTextField;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Send OTP']")
	private WebElement sendOtpButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='']")
	private WebElement backButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='सुरुवात करा']")
	private WebElement marathilanguage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='शुरू करें']")
	private WebElement hindiLanguage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='ప్రారంభించండి']")
	private WebElement teluguLanguage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='ప్రారంభించండి']")
	private WebElement tamilLanguage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='தொடங்குங்கள்']")
	private WebElement kanadLanguage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='തുടങ്ങുക']")
	private WebElement malyalamLanguage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Get Started']")
	private WebElement englishLanguage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='શરૂ કરો']")
	private WebElement gujratiLanguage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='শুরু করুন']")
	private WebElement banglaLanguage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='ਸ਼ੁਰੂ ਕਰੋ']")
	private WebElement punjabiLanguage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Phone number is required']")
	private WebElement emptyMobileNumberErrorMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Please check your network and try again.']")
	private WebElement internetErrorMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='toastText1']")
	private WebElement OtpErrorMessage;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Phone number must be exactly 10 digits']")
	private WebElement digitErrorMessage;
	
	public WebElement getSendOtpButton() {
		return sendOtpButton;
	}
	
	public void sendKeyToMobileNumberTextField(String key) {
		try {
			mobileNumberTextField.sendKeys(key);
			System.out.println("Entered value in mobile Number TextField ");
		} catch (Exception e) {
			System.out.println("Not able to enter value in mobile Number TextField "+e);
		}
	}
	
	public void clickOnsendOtpButton() {
		try {
			sendOtpButton.click();
			System.out.println("Clicked on send OTP Button");
		} catch (Exception e) {
			System.out.println("Not able to click on send OTP Button "+e);
		}
	}
	
	public void clickOnBackButton() {
		try {
			backButton.click();
			System.out.println("Clicked on backButton");
		} catch (Exception e) {
			System.out.println("Not able to click on backButton "+e);
		}
	}
	
	public void verifymarathilanguage() {
		if(marathilanguage.isDisplayed()) {
			System.out.println("App is responding in marathilanguage");
		}else {
			System.out.println("App is not responding in marathilanguage");
		}
	}      
	
	public void verifyHindiLanguage() {
		if(hindiLanguage.isDisplayed()) {
			System.out.println("App is responding in hindiLanguage");
		}else {
			System.out.println("App is not responding in hindiLanguage ");
		}
	}          
	
	public void verifyTeluguLanguage() {
		if(teluguLanguage.isDisplayed()) {
			System.out.println("App is responding in teluguLanguage");
		}else {
			System.out.println("App is not responding in teluguLanguage ");
		}
	}        
	
	public void verifyTamilLanguage() {
		if(tamilLanguage.isDisplayed()) {
			System.out.println("App is responding in tamilLanguage");
		}else {
			System.out.println("App is not responding in tamilLanguage ");
		}
	}            
	
	public void verifyKanadLanguage() {
		if(kanadLanguage.isDisplayed()) {
			System.out.println("App is responding in kanadLanguage");
		}else {
			System.out.println("App is not responding in kanadLanguage ");
		}
	}           
	
	public void verifyMalyalamLanguage() {
		if(malyalamLanguage.isDisplayed()) {
			System.out.println("App is responding in malyalamLanguage");
		}else {
			System.out.println("App is not responding in malyalamLanguage ");
		}
	}       
	
	public void verifyEnglishLanguage() {
		if(englishLanguage.isDisplayed()) {
			System.out.println("App is responding in englishLanguage");
		}else {
			System.out.println("App is not responding in englishLanguage ");
		}
	}        
	
	public void verifyGujratiLanguage() {
		if(gujratiLanguage.isDisplayed()) {
			System.out.println("App is responding in gujratiLanguage");
		}else {
			System.out.println("App is not responding in gujratiLanguage ");
		}
	}           
	
	public void verifyBanglaLanguage() {
		if(banglaLanguage.isDisplayed()) {
			System.out.println("App is responding in banglaLanguage");
		}else {
			System.out.println("App is not responding in banglaLanguage ");
		}
	}          
	
	public void verifyPunjabiLanguage() {
		if(punjabiLanguage.isDisplayed()) {
			System.out.println("App is responding in punjabiLanguage");
		}else {
			System.out.println("App is not responding in punjabiLanguage ");
		}
	}
	
	public void verifyEmptyMobileNumberErrorMessage() {
		try {
			if(emptyMobileNumberErrorMessage.isDisplayed()) {
				System.out.println("Error message is displayed");
			}else {
				System.out.println("Error message is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("Error message is not displayed "+e);
		}
	}
	
	public void verifyInternetErrorMessage() {
		try {
			if(internetErrorMessage.isDisplayed()) {
				System.out.println("You are not connected with internet");
			}
		} catch (Exception e) {
			System.out.println("InternetErrorMessage is not displayed "+e);
		}
	}
	
	public void verifOtpErrorMessage() {
		try {
			if(OtpErrorMessage.isDisplayed()) {
				System.out.println("OTP Error Message is displayed ");
			}
		} catch (Exception e) {
			System.out.println("OTP Error Message is not displayed "+e);
		}
	}
	
	public void verifydigitErrorMessage() {
		try {
			if(digitErrorMessage.isDisplayed()) {
				System.out.println("Please enter 10 digits number");
			}
		} catch (Exception e) {
			System.out.println("10 digits number as required "+e);
		}
	}
}
