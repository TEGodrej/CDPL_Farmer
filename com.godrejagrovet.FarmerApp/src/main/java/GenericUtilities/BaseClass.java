package GenericUtilities;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.sql.Connection;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import ObjectRepository.GetStartedScreen;
import ObjectRepository.LanguageScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;



/**
 * This class is being used for start the appium server and to activate app
 *@author DivyaPrakashAmar
 */
public class BaseClass {
	
	public static AndroidDriver driver;
	public static AppiumDriver appiumdriver;
	public  Connection connection;
	public  DriverUtility driverUtility;
	public  FileUtility fileUtility;
	public  GestureUtility gestureUtility;
	public  ListenerUtility listenerUtility;
	public  ExcelUtility excelUtility;
	public  AppiumDriverLocalService service ;
	public  LanguageScreen languageScreen;
	public  GetStartedScreen getStartedScreen;
	
	

	/**
	 *This method is used for starting the app and appium server
	 *
	 */
		@BeforeMethod
		public void startApp() throws IOException {
//		this is to start the appium server
			
//			File file = new File(FileUtility.getDataFromProperty("mainJSPath"));
//		    service = new AppiumServiceBuilder().withAppiumJS(file).withIPAddress(FileUtility.getDataFromProperty("ipAddress")).usingPort(Integer.parseInt(FileUtility.getDataFromProperty("portNumber"))).build();
//			service.start();
//			
//			// Fetching data from property file
//			String platformName=FileUtility.getDataFromProperty("platformName");
//			String DeviceName=FileUtility.getDataFromProperty("deviceName");
//			String AutomationName=FileUtility.getDataFromProperty("automationName");
//			String udid=FileUtility.getDataFromProperty("UDID");
//			String appactivity=FileUtility.getDataFromProperty("appActivity");
//			String apppackage=FileUtility.getDataFromProperty("appPackage");
//			String NoReset=FileUtility.getDataFromProperty("noReset");
//			
//			DesiredCapabilities desiredCapability=new DesiredCapabilities();
//			desiredCapability.setCapability("platformName", platformName);
//			desiredCapability.setCapability("deviceName", DeviceName);
//			desiredCapability.setCapability("automationName", AutomationName);
//			desiredCapability.setCapability("UDID", udid);
//			desiredCapability.setCapability("noReset", NoReset);
//			desiredCapability.setCapability("appActivity", appactivity);
//			desiredCapability.setCapability("appPackage", apppackage);
			
			DesiredCapabilities cap = new DesiredCapabilities();

	        cap.setCapability("deviceName", "Redmi A2");
	        cap.setCapability("UDID", "WKAQCYCQKROVDE4L"); // ✅ should be lowercase "udid"
	        cap.setCapability("platformName", "Android");
	        cap.setCapability("automationName", "UiAutomator2");
	        cap.setCapability("noReset", true);                     
	 
	        // Optional: include if you're launching the app directly via session
	        cap.setCapability("appPackage", "com.farmingapp");
	        cap.setCapability("appActivity", "com.farmingapp.MainActivity");

	        // ✅ Include the /wd/hub path
	        URL url = URI.create("http://localhost:4723").toURL();
	        appiumdriver= new AppiumDriver(url, cap);
	         driver = new AndroidDriver(url, cap);
			
			driver.activateApp("com.farmingapp");
			System.out.println("Application Started...");
			
			driverUtility        = new DriverUtility(driver);
			fileUtility          = new FileUtility();
			gestureUtility       = new GestureUtility(driver);
			listenerUtility      = new ListenerUtility();
			excelUtility         = new ExcelUtility();
			languageScreen       = new LanguageScreen(driver);
			getStartedScreen     = new GetStartedScreen(driver);
		        
		}
		
		/**
		 * This method is use to close the app and appium server
		 */
//		@AfterMethod
//		public void closeApp() throws IOException {
//			driverUtility.terminateApp("com.godrejagrovet.cdpl.dairy.frontliner");
//			service.stop();
//		}
		
	}


