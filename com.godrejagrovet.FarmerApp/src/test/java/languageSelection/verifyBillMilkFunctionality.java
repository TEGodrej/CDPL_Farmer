package languageSelection;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class verifyBillMilkFunctionality extends BaseClass{

	@Test
	public void selectDateRange() {
	driverUtility.implicitlyWait(10);
	homeScreen.clickOndateDropDwn();
	homeScreen.selectStartDate();
	homeScreen.selectEndDate();
	homeScreen.clickOnOkButton();
	homeScreen.clickOnviewBillButton();
	
	
	}
}
