package ObjectRepository;

import java.util.Scanner;

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

	@FindBy(xpath = "(//android.view.ViewGroup[@resource-id=\"otp-input\"])[1]")
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
	
	@FindBy(xpath = "//android.widget.TextView[@text='Please enter a valid 4-digit OTP']")
	private WebElement emptyOTP_Message;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='toastText2']")
	private WebElement invalid_OTP_ErrorMessage;
	
	
	public void sendkeyToFirstTextBox() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter firstOTP:");
			String firstOTP = sc.nextLine(); 
			firstTextBox.click();
	        firstTextBox.sendKeys(firstOTP);
	        System.out.println("Entered first OTP");
	    } catch (Exception e) {
	        System.out.println("Not able to enter OTP: " + e);
	    }
	}
	
	public void sendkeyToSecondTextBox() {
		try (Scanner sc = new Scanner(System.in)) {
			String secondOTP =sc.next();
	        secondTextBox.sendKeys(secondOTP);
	        System.out.println("Entered second OTP");
	    } catch (Exception e) {
	        System.out.println("Not able to enter OTP: " + e);
	    }
	} 
	
	public void sendkeyToThirdTextBox() {
		try (Scanner sc = new Scanner(System.in)) {
			String thirdOTP =sc.next();
	        thirdTextBox.sendKeys(thirdOTP);
	        System.out.println("Entered thrid OTP");
	    } catch (Exception e) {
	        System.out.println("Not able to enter OTP: " + e);
	    }
	} 
	public void sendkeyToForthTextBox() {
		try (Scanner sc = new Scanner(System.in)) {
			String forthOTP =sc.next();
	        forthTextBox.sendKeys(forthOTP);
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
	
	public void verifyEmptyOTP_Message() {
		try {
			if(emptyOTP_Message.isDisplayed()) {
				System.out.println("You have not entered OTP");
			}
		} catch (Exception e) {
			System.out.println("Got issue in OTP "+e);
		}
	}
	
	public void verifyInvalid_OTP_ErrorMessage() {
		try {
			if(invalid_OTP_ErrorMessage.isDisplayed()) {
				System.out.println("Entered OTP is invalid ; Please provide valid OTP ");
			}
		} catch (Exception e) {
			System.out.println("Not able to enter OTP "+e);
		}
	}
}
