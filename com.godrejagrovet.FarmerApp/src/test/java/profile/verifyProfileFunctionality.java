package profile;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class verifyProfileFunctionality extends BaseClass{

	
	@Test
	public void verifyUserAbleToClickOnProfileDropdonw() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnProfileDropButton();
		homeScreen.verifylogoutButton();
	}
}
