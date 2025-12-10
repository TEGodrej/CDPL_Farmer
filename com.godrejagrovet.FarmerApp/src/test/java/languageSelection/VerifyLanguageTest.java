package languageSelection;


import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class VerifyLanguageTest extends BaseClass{

	@Test
	public void verifyThatTheLanguageSelectionScreenLoadsProperly() {
		driverUtility.implicitlyWait(60);
		languageScreen.clickOnMarathiOption();
		getStartedScreen.verifymarathilanguage();
		getStartedScreen.clickOnBackButton();
	}
	
	@Test
	public void verifyThatUserCanSelectHindi() {
		driverUtility.implicitlyWait(50);
		languageScreen.clickOnHindiOption();
		getStartedScreen.verifyHindiLanguage();
		getStartedScreen.clickOnBackButton();
	}
	
	@Test
	public void verifyThatUserCanSelectEnglish() {
		driverUtility.implicitlyWait(50);
		languageScreen.clickOnEnglishOption();
		getStartedScreen.verifyEnglishLanguage();
		getStartedScreen.clickOnBackButton();
	}
	
	@Test
	public void verifyThatUserCanSelectTamil() {
		driverUtility.implicitlyWait(50);
		languageScreen.clickOnTamilOption();
		getStartedScreen.verifyTamilLanguage();
		getStartedScreen.clickOnBackButton();
	}
	
	@Test
	public void verifyThatAllLanguageOptionsAreClickable() {
		driverUtility.implicitlyWait(50);
		languageScreen.clickOnMarathiOption();
		getStartedScreen.verifymarathilanguage();
		driverUtility.threadWait(4);
		getStartedScreen.clickOnBackButton();
		driverUtility.threadWait(4);
		languageScreen.clickOnHindiOption();
		getStartedScreen.verifyHindiLanguage();
		driverUtility.threadWait(4);
		getStartedScreen.clickOnBackButton();
		driverUtility.threadWait(4);
		languageScreen.clickOnTeluguOption();
		driverUtility.threadWait(4);
		getStartedScreen.verifyTeluguLanguage();
		driverUtility.threadWait(4);
		getStartedScreen.clickOnBackButton();
		driverUtility.threadWait(4);
		languageScreen.clickOnTamilOption();
		driverUtility.threadWait(4);
		getStartedScreen.verifyTamilLanguage();
		driverUtility.threadWait(4);
		getStartedScreen.clickOnBackButton();
		driverUtility.threadWait(4);
		languageScreen.clickOnKanadaOption();
		driverUtility.threadWait(4);
		getStartedScreen.verifyKanadLanguage();
		driverUtility.threadWait(4);
		getStartedScreen.clickOnBackButton();
		driverUtility.threadWait(4);
		languageScreen.clickOnMalyalamOption();
		driverUtility.threadWait(4);
		getStartedScreen.verifyMalyalamLanguage();
		driverUtility.threadWait(4);
		getStartedScreen.clickOnBackButton();
		driverUtility.threadWait(4);
		languageScreen.clickOnEnglishOption();
		driverUtility.threadWait(4);
		getStartedScreen.verifyEnglishLanguage();
		driverUtility.threadWait(4);
		getStartedScreen.clickOnBackButton();
		driverUtility.threadWait(4);
		languageScreen.clickOnGujratiOption();
		driverUtility.threadWait(4);
		getStartedScreen.verifyGujratiLanguage();
		driverUtility.threadWait(4);
		getStartedScreen.clickOnBackButton();
		driverUtility.threadWait(4);
		languageScreen.clickOnBanglaOption();
		driverUtility.threadWait(4);
		getStartedScreen.verifyBanglaLanguage();
		driverUtility.threadWait(4);
		getStartedScreen.clickOnBackButton();
		driverUtility.threadWait(4);
		languageScreen.clickOnPunjabiOption();
		driverUtility.threadWait(4);
		getStartedScreen.verifyPunjabiLanguage();
		driverUtility.threadWait(4);
		getStartedScreen.clickOnBackButton();
		System.out.println("After all language click test . Finally selected English language");
		driverUtility.threadWait(4);
		languageScreen.clickOnEnglishOption();
		getStartedScreen.verifyEnglishLanguage();
	}


	@Test
	public void VerifyAbilityToChangeLanguageFromSettings() {
		String MobileNumber="9354029690";
		
			driverUtility.implicitlyWait(50);
//			languageScreen.clickOnEnglishOption();
//			getStartedScreen.verifyEnglishLanguage();
//			gestureUtility.clickByAxes(660, 602);
			getStartedScreen.sendKeyToMobileNumberTextField(MobileNumber);
			getStartedScreen.clickOnsendOtpButton();
			

		    otpScreen.sendkeyToFirstTextBox();
		    otpScreen.sendkeyToSecondTextBox();
		    otpScreen.sendkeyToThirdTextBox();
		    otpScreen.sendkeyToForthTextBox();
//		otpScreen.clickOnVerifyOtpButton();
//		homeScreen.clickOnProfileDropButton();
//		profileScreen.clickOnLanguageOption();
//		
//		languageScreen.clickOnHindiOption();
	}
	
	@Test
	public void verifyBehaviorWhenNoInternetDuringSelection() {
		driverUtility.implicitlyWait(6);
		driverUtility.turnOffWifi();
		languageScreen.clickOnEnglishOption();
		driverUtility.turnOnWifi();
	}
	
	@Test
	public void VerifyAppBehaviorOnDoubleTappingLanguage() {
		driverUtility.implicitlyWait(10);
		gestureUtility.doubleClick(languageScreen.getEnglishOption());
		
	}
	
	@Test
	public void verifyScreenDuringOrientationChange() {
		driverUtility.implicitlyWait(10);
		driverUtility.orientationPortrait();
	}
	
	@Test
	public void verifyBehaviorWhenPressingBack() {
		driverUtility.implicitlyWait(10);
		getStartedScreen.clickOnBackButton();
		languageScreen.clickOnHindiOption();
		driverUtility.closeApp();
		driverUtility.activateApp("com.farmingapp");
		getStartedScreen.verifyHindiLanguage();
	}





	

}
