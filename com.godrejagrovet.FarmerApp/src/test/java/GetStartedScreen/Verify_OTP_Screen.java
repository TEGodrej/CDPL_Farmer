package GetStartedScreen;

import java.time.Duration;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class Verify_OTP_Screen extends BaseClass{
	
	@Test
	public void checkBehaviorWhenTheMobileNumberFieldIsLeftEmpty() {
		driverUtility.implicitlyWait(10);
		getStartedScreen.clickOnsendOtpButton();
		getStartedScreen.verifyEmptyMobileNumberErrorMessage();
	}
	
	@Test
	public void verifyIfTheSystemHandlesMobileNumbersWithLeadingZero() {
		String Number = "09354129690";
		driverUtility.implicitlyWait(10);
		getStartedScreen.sendKeyToMobileNumberTextField(Number);
		getStartedScreen.clickOnsendOtpButton();
	}
	
	@Test
	public void validateInputFieldWithAlphabetsOrSpecialCharacters() {
		driverUtility.implicitlyWait(10);
		String number= "9354%$2340";
		getStartedScreen.sendKeyToMobileNumberTextField(number);
		getStartedScreen.verifydigitErrorMessage();
		getStartedScreen.clickOnsendOtpButton();
	}
	
	@Test
	public void verifyAppHandlesOfflineScenario() {
		String number= "9354029690";
		getStartedScreen.sendKeyToMobileNumberTextField(number);
		driverUtility.turnOffWifi();
		getStartedScreen.verifyInternetErrorMessage();
		
	}
	
	@Test
	public void verifyRapidButtonPress() {
		driverUtility.implicitlyWait(10);
		String number= "9354%$2340";
		getStartedScreen.sendKeyToMobileNumberTextField(number);
		driverUtility.doubleClickAction(getStartedScreen.getSendOtpButton());
	}
	
	@Test
	public void verifyPopupHandlingWithNoInternet() {
		String Number = "9354029690";
		driverUtility.implicitlyWait(10);
		getStartedScreen.sendKeyToMobileNumberTextField(Number);
		getStartedScreen.clickOnsendOtpButton();
	}
	
	@Test
	public void verifyBehaviorWhenNo_OTP_Entered() {
		String Number = "9354029690";
		driverUtility.implicitlyWait(10);
		getStartedScreen.sendKeyToMobileNumberTextField(Number);
		getStartedScreen.clickOnsendOtpButton();
		otpScreen.clickOnVerifyOtpButton();
		otpScreen.verifyEmptyOTP_Message();
	}
	
	@Test
	public void verifyIncomplete_OTP() {
		String Number = "9354029690";
		driverUtility.implicitlyWait(10);
		getStartedScreen.sendKeyToMobileNumberTextField(Number);
		getStartedScreen.clickOnsendOtpButton();
		otpScreen.sendkeyToFirstTextBox();
	    otpScreen.sendkeyToSecondTextBox();
	    otpScreen.clickOnVerifyOtpButton();
	    otpScreen.verifyEmptyOTP_Message();
	}
	
	@Test
	public void VerifyInvalid_OTP_Handling() {
		String Number = "9354029690";
		driverUtility.implicitlyWait(10);
		getStartedScreen.sendKeyToMobileNumberTextField(Number);
		getStartedScreen.clickOnsendOtpButton();
		otpScreen.sendkeyToFirstTextBox();
	    otpScreen.sendkeyToSecondTextBox();
	    otpScreen.sendkeyToThirdTextBox();
	    otpScreen.sendkeyToForthTextBox();
	    otpScreen.clickOnVerifyOtpButton();
	    otpScreen.verifyInvalid_OTP_ErrorMessage();
	}
	
	
	@Test
	public void verifyExpired_OTP_Behavior() throws InterruptedException {
		String Number = "9354029690";
		driverUtility.implicitlyWait(10);
		getStartedScreen.sendKeyToMobileNumberTextField(Number);
		getStartedScreen.clickOnsendOtpButton();
		Thread.sleep(Duration.ofMinutes(6));
		otpScreen.sendkeyToFirstTextBox();
	    otpScreen.sendkeyToSecondTextBox();
	    otpScreen.sendkeyToThirdTextBox();
	    otpScreen.sendkeyToForthTextBox();
	    otpScreen.clickOnVerifyOtpButton();
	    otpScreen.verifyInvalid_OTP_ErrorMessage();
	    
		
	}
	
	@Test
	public void Verify_OTP_AcceptsOnlyDigits() {
		String Number = "9354029690";
		driverUtility.implicitlyWait(10);
		getStartedScreen.sendKeyToMobileNumberTextField(Number);
		getStartedScreen.clickOnsendOtpButton();
		otpScreen.sendkeyToFirstTextBox();
	    otpScreen.sendkeyToSecondTextBox();
	    otpScreen.sendkeyToThirdTextBox();
	    otpScreen.sendkeyToForthTextBox();
	    otpScreen.clickOnVerifyOtpButton();
	}
	
	
	@Test
	public void verifyResendRestrictionBeforeTimerExpiry() {
		String Number = "9354029690";
		driverUtility.implicitlyWait(10);
		getStartedScreen.sendKeyToMobileNumberTextField(Number);
		getStartedScreen.clickOnsendOtpButton();
		otpScreen.clickOnResendOption();
//		have to resend warning message line here
	}
	
	@Test
	public void verifyBehaviorWhenOffline() {
		driverUtility.implicitlyWait(10);
		driverUtility.turnOffWifi();
		languageScreen.clickOnEnglishOption();
		getStartedScreen.verifyInternetErrorMessage();
	}















}
