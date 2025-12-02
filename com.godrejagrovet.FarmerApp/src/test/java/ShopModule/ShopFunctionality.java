package ShopModule;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class ShopFunctionality extends BaseClass{

	@Test
	public void verifyShopFunctionality() {
		driverUtility.implicitlyWait(10);
		homeScreen.clickOnShopTab();
	}
}
