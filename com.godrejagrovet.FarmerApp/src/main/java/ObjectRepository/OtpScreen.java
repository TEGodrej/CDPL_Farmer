package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class OtpScreen {
	
	AndroidDriver driver;
	public OtpScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id='otp-input'])[1]")
	private WebElement firstTextBox;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id='otp-input'])[2]")
	private WebElement secondTextBox;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id='otp-input'])[3]")
	private WebElement thirdTextBox;
	
	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id='otp-input'])[4]")
	private WebElement forthTextBox;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Verify OTP']")
	private WebElement verifyOtpButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Resend']")
	private WebElement resendOption;
	
	public void sendkeyToFirstTextBox(String otp) {
		try {
			
	        firstTextBox.sendKeys(otp);
	        System.out.println("Entered first OTP");
	    } catch (Exception e) {
	        System.out.println("Not able to enter OTP: " + e);
	    }
	}
	
	public void sendkeyToSecondTextBox(String otp) {
		try {
	        secondTextBox.sendKeys(otp);
	        System.out.println("Entered second OTP");
	    } catch (Exception e) {
	        System.out.println("Not able to enter OTP: " + e);
	    }
	} 
	
	public void sendkeyToThirdTextBox(String otp) {
		try {
	        thirdTextBox.sendKeys(otp);
	        System.out.println("Entered thrid OTP");
	    } catch (Exception e) {
	        System.out.println("Not able to enter OTP: " + e);
	    }
	} 
	public void sendkeyToForthTextBox(String otp) {
		try {
	        forthTextBox.sendKeys(otp);
	        System.out.println("Entered forth OTP");
	    } catch (Exception e) {
	        System.out.println("Not able to enter OTP: " + e);
	    }
	}
	
	public void clickOnVerifyOtpButton() {
		try {
			verifyOtpButton.click();
			System.out.println("click on verify OTP Button ");
		} catch (Exception e) {
			System.out.println("Not able to click on verify Button "+e);
		}
	}
	
	public void clickOnResendOption() {
		try {
			resendOption.click();
			System.out.println("Clicked on Resend Option");
		} catch (Exception e) {
			System.out.println("Not able to click on Resend Option "+e);
		}
	}
}
