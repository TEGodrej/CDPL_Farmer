package GenericUtilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;

/**
 *This class contains all the dirver methods to perform action on operating system
 *@author DivyaPrakashAmar
 */
public class DriverUtility {
	public AndroidDriver driver;
	
	public DriverUtility(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 *This method is use to install the application
	 *@param Takes app package as a parameter
	 */
	public void installapp(String package_name,String path) {
		driver.installApp(path);
		driver.isAppInstalled(package_name);
	}
	/**
	 *This method is use to uninstall the application
	 *@param Takes app package as a parameter
	 */
	public void uninstallapp(String package_name) {
		driver.removeApp(package_name);
	}
	/**
	 *This method is use to hide the key board
	 */
	public void hideKeyboard() {
		driver.hideKeyboard();
	}
	/**
	 *This method is use to open notification of the app
	 */
	public void opennotification() {
		driver.openNotifications();
	}
	/**
	 *This method is use to check the app status wheather it is running in the back ground
	 *@param package_name, takes app package as parameter
	 */
	public void appStatus(String pakage_name) {
		driver.queryAppState(pakage_name);
	}
	/**
	 *This method is use to check the device is locked or not 
	 */
	public void deviceLock() {
		driver.isDeviceLocked();
	}
	/**
	 *This method is use to activate app 
	 *@param package_name, takes app package as parameter 
	 */
	public void activateApp(String package_name) {
		driver.activateApp(package_name);
	}
	/**
	 *This method is use to run app in back groud 
	 *@param time , take time as parameter 
	 *The app will run in the background for the given number of time 
	 */
	public void appInackground(int time) {
		driver.runAppInBackground(Duration.ofSeconds(time));
	}
	/**
	 *This method is use to get the handles of the app
	 */
	public void contexthandles() {
		Set<String> ch=driver.getContextHandles();
		int count=ch.size();
		System.out.println(count);
		for(String allcontext:ch) {
			System.out.println(allcontext);
		}
	}
	/**
	 *This method is use to switch the context of the app
	 *@param WebView_packageName , this helps to switch the context to webview
	 */
	public void switchContext(String WEBVIEW_packageName) {
		driver.context(WEBVIEW_packageName);
	}
	/**
	 *This method is use to switch the context of the app
	 *@param NativeView_packageName , this helps to switch the context to native view
	 */
	public void SwitchToNativeView(String NATIVEVIEW_packageName) {
		driver.context(NATIVEVIEW_packageName);
	}
	/**
	 *This method is use to apply implicit wait on the app
	 *@param Time , this wait will be applicable to all over the  script
	 */
	 public void implicitWait(int Time) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 /**
	  *This method is use to change the orientation into landscape mode
	  */
	 @SuppressWarnings("static-access")
	public void orientationLandScape() {
		 org.openqa.selenium.ScreenOrientation screen= driver.getOrientation();
		 driver.rotate(screen.LANDSCAPE);
	 }
	 /**
	  *This method is use to change the orientation into landscape mode
	  */
	@SuppressWarnings("static-access")
	public void orientationPortrait() {
		 org.openqa.selenium.ScreenOrientation screen= driver.getOrientation();
		 driver.rotate(screen.PORTRAIT);
	}
	/**
	  *This method is use to turn off the data connection of mobile device 
	  */
	public void turnOfData() {
		@SuppressWarnings("unused")
		ConnectionState dataOff = driver.setConnection(new ConnectionStateBuilder().withDataDisabled().build());
	}
	/**
	  *This method is use to turn on the data connection of mobile device 
	  */
	public void turnOnData() {
		@SuppressWarnings("unused")
		ConnectionState turnOn = driver.setConnection(new ConnectionStateBuilder().withDataEnabled().build());
	}
	/**
	  *This method is use to turn off the wifi connection of mobile device 
	  */
	public void turnOffWifi() {
		@SuppressWarnings("unused")
		ConnectionState turnOfWifi = driver.setConnection(new ConnectionStateBuilder().withWiFiDisabled().build());
	}
	/**
	  *This method is use to turn on the wifi connection of mobile device 
	  */
	public void turnOnWifi() {
	@SuppressWarnings("unused")
	ConnectionState turnOnWifi = driver.setConnection(new ConnectionStateBuilder().withWiFiEnabled().build());
	
	}
	
	/**
	  *This method is use to turn off the airplane mode of mobile device 
	  */
	public void turnOffAirplane() {
		driver.setConnection(new ConnectionStateBuilder().withAirplaneModeDisabled().build());
	}
	
	/**
	  *This method is use to turn on the airplane mode of mobile device 
	  */
	public void turnOnAirplane() {
		driver.setConnection(new ConnectionStateBuilder().withAirplaneModeEnabled().build());
	}
	
	/**
	  *This method is use to apply explicit wait to fullfill any particular condition
	  *@param time and webelement , driver will wait for  
	  */
	public void explicitWait(int time, WebElement webelement) {
		WebDriverWait wait;
		wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(webelement));
	}
	
	public void explicitWaitTillVisibility(int time, WebElement webelement) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	    wait.until(ExpectedConditions.visibilityOf(webelement));
	}

	
	/**
	  *This method is use to apply explicit wait to fulfill any particular condition
	  *@param time and webelement , driver will wait for particular condition to be fulfill
	  */
	public void implicitlyWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	/**
	  *This method is use to apply thread wait for any particular condition
	  *@param time and webelement , driver will wait for particular condition  
	  */
	public void threadWait(int time) {
		try {
			Thread.sleep(Duration.ofSeconds(time));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
	  *This method is use to close the application
	  */
	public void closeApp() {
		try {
			driver.close();
		}catch (Exception e) {
			System.out.println("Not able to close the app");
		}
	}
	
	/**
	  *This method is use to terminate the application
	  *@param appPackage , takes app package to execute the method
	  */
	public void terminateApp(String appPackage) {
		try {
			driver.terminateApp(appPackage);
		}catch (Exception e) {
			System.out.println("Not able to terminate app");
		}
	}
	
}
